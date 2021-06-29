package calc;


import java.io.*;
import java.net.*;

public class Server implements Runnable 
{
    static int max = 5; //maximum thread's number
    static int i = 0, count = 0; //i for for-loop, count for count number of threads

    public static void main(String args[]) throws IOException 
    {
        ServerSocket serverSocket = new ServerSocket(6666); //open new socket
        File file = new File("src/serverinfo.dat"); //make data file to save server info.
        System.out.println("Maximum 5 users can be supported.\nWaiting...");

        for(i=0; i <= max; i++) { new Connection(serverSocket); } //make sockets - loop for max(=5) times

        try //server information file writing
        { 
            String dataString = "Max thread = 5\nServer IP = 127.0.0.1\nServer socket = 6789\n";
            @SuppressWarnings("resource")
            FileWriter dataFile = new FileWriter(file);
            dataFile.write(dataString);
        }
        catch(FileNotFoundException e) { e.printStackTrace(); }
        catch(IOException e) { e.printStackTrace(); }
    }


    static class Connection extends Thread
    {
        private ServerSocket serverSocket;

        public Connection(ServerSocket serverSock)
        {
            this.serverSocket = serverSock;
            start();
        }

        public void run()
        { 
            Socket acceptSocket = null;
            BufferedReader inFromClient = null;
            DataOutputStream msgToClient = null;
            String receiveString = null;
            String result = "", sys_msg = "";

            try
            {
                while(true)
                {
                    acceptSocket = serverSocket.accept(); // 접속수락 소켓
                    count++;

                    inFromClient = new BufferedReader(new InputStreamReader(acceptSocket.getInputStream()));
                    msgToClient = new DataOutputStream(acceptSocket.getOutputStream());
                    System.out.println(count + "th client connected: " + acceptSocket.getInetAddress().getHostName() + "    " + count + "/" + max);
                    System.out.println("Waiting response...");

                    while(true)
                    {

                        if (count >= max+1) // if 6th client tries to access
                        {
                            System.out.println("Server is too busy. " + max + " clients are already connected. Client access denied.");
                            sys_msg = "DENIED";
                            msgToClient.writeBytes(sys_msg);
                            acceptSocket.close();
                            count--;
                            break;
                        }

                        try{ msgToClient.writeBytes(result); }
                        catch(Exception e) {}

                        try{ receiveString = inFromClient.readLine(); }
                        catch(Exception e) // if receiveString = null
                        {
                            System.out.println("Connection Close");
                            count--;
                            break;
                        }

                        System.out.println("Input from client : " + receiveString);

                        try
                        {       

                            if(receiveString.indexOf("+") != -1) { result = cal("+", receiveString); }
                            else if(receiveString.indexOf("-") != -1) { result = cal("-", receiveString); }
                            else if(receiveString.indexOf("/") != -1) { result = cal("/", receiveString); }
                            else if(receiveString.indexOf("*") != -1) { result = cal("*", receiveString); }
                            else if(receiveString.indexOf("+") == -1 || receiveString.indexOf("-") == -1 || receiveString.indexOf("*") == -1 || receiveString.indexOf("/") == -1) { result = "No INPUT or Invalid operation"; }
                        }
                        catch(Exception e){ result = "Wrong INPUT"; }

                        try{ msgToClient.writeBytes(result); }
                        catch(Exception e) {}
                    }
                }
            }
            catch(IOException e) { e.printStackTrace(); }
        }
    }

    private static String cal(String op, String recv) //function for calculating
    {
        double digit1, digit2; //first number, second number

        String result = null;

        digit1 = Integer.parseInt(recv.substring(0, recv.indexOf(op)).trim());
        digit2 = Integer.parseInt(recv.substring(recv.indexOf(op)+1, recv.length()).trim());

        if(op.equals("+")) { result = digit1 + " + " + digit2 + " = " + (digit1 + digit2); }
        else if(op.equals("-")) { result = digit1 + " - " + digit2 + " = " + (digit1 - digit2); }
        else if(op.equals("*")) { result = digit1 + " * " + digit2 + " = " + (digit1 * digit2); }
        else if(op.equals("/"))
        {
            if(digit2 == 0){ result = "ERROR OCCURRED: Cannot be divided by ZERO"; }
            else{ result = digit1 + " / " + digit2 + " = " + (digit1 / digit2); }
        }
        return result;
    }

    @Override
    public void run() {
  //    TODO Auto-generated method stub
    }
}