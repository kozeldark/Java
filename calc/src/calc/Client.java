package calc;


import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) throws IOException
    {
        Socket clientSocket = null;

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inFromServer = null;
        DataOutputStream msgToServer = null;

        String sendString = "", receiveString = "";

        try
        {
            clientSocket = new Socket("127.0.0.1", 6666); //make new clientSocket
            inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            msgToServer = new DataOutputStream(clientSocket.getOutputStream());

            System.out.println("Input exit to terminate");
            System.out.println("Connection Success... Waiting for permission");

            while(true)
            {
                receiveString = inFromServer.readLine();
                if(receiveString.equals("DENIED"))
                {
                    System.out.println("Server is full. Try again later.");
                    break;
                }
                else { System.out.println("Connection permitted."); }

                System.out.print("Input an expression to calculate(ex. 3+1): ");
                sendString = userInput.readLine();

                if(sendString.equalsIgnoreCase("exit")) //when user input is "exit" -> terminate
                {
                    clientSocket.close();
                    System.out.println("Program terminated.");
                    break;
                }

                try { msgToServer.writeBytes(sendString); }
                catch(Exception e) {}

                try { receiveString = userInput.readLine(); }
                catch(Exception e) {}

                System.out.println("Result: " + receiveString); //print result
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}