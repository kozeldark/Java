import java.io.*;
import java.net.*;

public class Calculator_Network_Server 
{
	public static void main(String[] args) throws IOException 
	{
		ServerSocket welcomeSocket = new ServerSocket(6789);//Create welcoming ServerSocket at port 6789

		File file = new File("serverinfo.dat");//Creating an object in the serverinfo.dat file
		if(!file.exists())
		{
		       boolean created = file.createNewFile();//Generate if the serverinfo.dat file does not exist
		}

		try //Write information about the server in the serverinfo.dat file.
		{
			String infomation = "Server IP [127.0.0.1]'\nServer socket [6789]\n";

			FileOutputStream fileout = new FileOutputStream(file);			
	        BufferedOutputStream bufferout = new BufferedOutputStream(fileout);
	        DataOutputStream dataout = new DataOutputStream(bufferout);

	        dataout.writeUTF("Server IP [127.0.0.1]'\\nServer socket [6789]\n");
	        
	        dataout.flush();
	        
	        dataout.close();
	        bufferout.close();
	        fileout.close();

		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}

		int user = 1;
		
		while (true)// When a client connects, it allocates threads, i.e. supports multi-threads.
		{
			Socket connectionSocket = welcomeSocket.accept();//Wait until the socket is connected.
			System.out.println("[" + user + "th User Connected!]");//When connected, print out the notification.

			new Thread(new server(connectionSocket)).start();//Creating and Running server Threads
			user++;
		}

	}
}

class server extends Thread //server class
{
	Socket socket;//Create Socket

	public server(Socket client)//Constructor
	{
		this.socket = client;
	}

	public void run() 
	{
		
		try 
		{
			outerLoop:	while (true)//Repeat until user(client) enters EXIT
			{
				
				String clientSentence;//Declares variables to store statements received from user(client)

				BufferedReader inFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//Create inputstream, attached to socket

				DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
				//Create outputstream, attached to socket
				
				while (true)
				{
					clientSentence = inFromClient.readLine();//Receive the sentence from the client.

					System.out.println("Calculation received from the client : " + clientSentence);
				
					int result = 0;//Variables to use to store values for expressions other than division					
					float divresult = 0;//Variables to use to store values for division
					
					String spacesplit[] = clientSentence.split(" ");//Divide sentences into intervals of spaces and store them in an array.
					String operation = " ";//First is operator, so save as string
					int number1 = 0;//Second and third are numbers, so save in integer
					int number2 = 0;
					
					try
					{
						operation = spacesplit[0];//First is operator, so save as string
						number1 = Integer.parseInt(spacesplit[1]);//Second and third are numbers, so save in integer
						number2 = Integer.parseInt(spacesplit[2]);
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						
					}
					
					if (clientSentence.equals("EXIT"))//If user(client) enters EXIT
					{
						System.out.println(getName() + " Exit Calculator Program");
						break outerLoop;
					}
					
					if (!clientSentence.equals("EXIT") && spacesplit.length == 1 || !clientSentence.equals("EXIT") && spacesplit.length == 2)//Output an error message when the number of objects is insufficient
					{
						String res = "ERROR MESSAGE : To low arguments" + '\n';
						System.out.println(res + "Send ERROR MESSAGE to clients");
						outToClient.writeBytes(res);
					}
			
					if (spacesplit.length > 3)//Output error message when number of elements is high
					{
						String res = "ERROR MESSAGE : To many arguments" + '\n';
						System.out.println(res + "Send ERROR MESSAGE to clients");
						outToClient.writeBytes(res);
					}
			
					if (operation.equals("ADD") && spacesplit.length == 3)//Calculate and send results for the plus operator
					{
						result = number1 + number2;

						System.out.println("Send answers to clients");
						String res = Integer.toString(result) + '\n';//Convert result to string variable
						outToClient.writeBytes(res);//Send res statements to client
					}

					else if (operation.equals("MINUS") && spacesplit.length == 3)//Calculate and send results for the minus operator 
					{
						result = number1 - number2;

						System.out.println("Send answers to clients");
						String res = Integer.toString(result) + '\n';
						outToClient.writeBytes(res);
					}

					else if (operation.equals("MUL") && spacesplit.length == 3) //Calculate and send results for the multiplication operator
					{
						result = number1 * number2;

						System.out.println("Send answers to clients");
						String res = Integer.toString(result) + '\n';
						outToClient.writeBytes(res);
					}

					else if (operation.equals("DIV") && spacesplit.length == 3)//Calculate and send results for the divison operator 
					{
						if (number2 == 0)//Output error message when second operand is zero 
						{
							String res = "ERROR MESSAGE : Can't be divided by zero" + '\n';
							System.out.println(res + "Send ERROR MESSAGE to clients");
							outToClient.writeBytes(res);
						} 
						else 
						{
							divresult = (float)number1 / number2;
							
							System.out.println("Send answers to clients");
							String res = Float.toString(divresult) + '\n';
							outToClient.writeBytes(res);
						}
					}
					if (!operation.equals("ADD") && !operation.equals("MINUS") && !operation.equals("MUL")
							&& !operation.equals("DIV") && spacesplit.length == 3)
						//If the number of operators is correct, but the operator is wrong. 
					{
						String res = "ERROR MESSAGE : Please enter the calculation according to the manual..." + '\n';
						System.out.println("Send ERROR MESSAGE to clients");
						outToClient.writeBytes(res);
					}

				}
				
			
			}
			
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}
}
