import java.io.*;
import java.net.*; 
  
public class Calculator_Network
{ 
    public static void main(String args[]) throws IOException  
    { 
  
        String sentence;//Declares variables to save user input and send to the server
        String modifiedSentence;//Declare variables to store sentences sent by the server
        
        Socket clientSocket = new Socket("127.0.0.1", 6789);//Create client socket to connect to server
  
        BufferedReader inFromUser =
        		new BufferedReader(new InputStreamReader(System.in));//Create input stream
       
        DataOutputStream outToServer =
        		new DataOutputStream(clientSocket.getOutputStream());//Create output stream attached to socket

        BufferedReader inFromServer =
        		new BufferedReader(new
        		InputStreamReader(clientSocket.getInputStream()));//Create input stream attached to socket
    
        
        System.out.println("Please enter a calculation according to this manual.");//Manual Output 
        System.out.println("1. Plus calculation format -> ADD number1 number2 (ex)ADD 2 5)"); 
        System.out.println("2. Minus calculation format -> MINUS number1 number2 (ex)MINUS 2 5)"); 
        System.out.println("3. Multiplication calculation format -> MUL number1 number2 (ex)MUL 2 5)"); 
        System.out.println("4. Division calculation format -> DIV number1 number2 (ex)DIV 2 5)");
        System.out.println("5. Enter EXIT if you want to exit.\n\n"); 
        
        while (true)//Repeat until user enters EXIT
        {             	
        	System.out.print("Enter the calculation according to the manual : "); 
                     
            sentence = inFromUser.readLine();//Store user-entered sentences in sentence 
            
            outToServer.writeBytes(sentence + '\n');//Send sentence to server

            if (sentence.equals("EXIT"))//If sentence is the same as EXIT
            {
            	System.out.println("Exit Calculator Program"); 
                break;//Escape from while loop 
            }
  
            modifiedSentence = inFromServer.readLine();//Read line from server and stored line to modifiedSentence         
  
            System.out.println("FROM SERVER: " + modifiedSentence); 
            
        }        
        clientSocket.close();//close the socket
        
    } 
} 