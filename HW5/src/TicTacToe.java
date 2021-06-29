/**
 Program playing Tic-Tac-Toe game.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem8
 Last changed: June 2, 2020.
 */

import java.util.Scanner;//Scanner 함수 사용을 위해 Scanner 클래스를 포함시킨다.

public class TicTacToe//틱택토 게임을 생성할 클래스 TicTacToe을 정의한다.
{
    private static char[][] board = new char[3][3];
    //게임보드가 되어줄 2차원 배열 board를 선언하고 new로 행 0~2번의 인덱스 열 0~2번의 인덱스를 할당하여준다.
    
    private static char player; //플레이어 이름의 값을 저장해줄 변수 player를 선언한다.
    
    private static int row;//보드의 행의 값을 저장해줄 변수 row를 선언한다.             
    private static int col;//보드의 열의 값을 저장해줄 변수 row를 선언한다. 
    
    private static int insertRow;//사용자가 입력한 위치의 행의 값을 저장해줄 변수 insertRow를 선언한다.
    private static int incertCol;//사용자가 입력한 위치의 열의 값을 저장해줄 변수 incertCol를 선언한다.   
    
    private static int round = 1;//현재 게임 라운드의 값을 저장해줄 변수 round를 선언한다.


    private static void move()//사용자가 보드에 글자를 입력하게 해줄 메소드 move를 정의한다.
    {
        boolean insertIsVaild = false;//글자를 입력한 위치가 유효한지에 대한 값을 저장해줄 변수 insertIsVaild를 선언하고 false로 초기화한다.
        boolean rowIsVaild = false;//입력한 행의 유효한지에 대한 값을 저장해줄 변수 rowIsVaild를 선언하고 false로 초기화한다. 
        boolean colIsVaild = false;//입력한 열의 유효한지에 대한 값을 저장해줄 변수 colIsVaild를 선언하고 false로 초기화한다.   
          
        Scanner keyboard = new Scanner(System.in);//Scanner 객체 keyboard를 생성한다.

        while(insertIsVaild == false)//insertIsVaild가 false이면 반복하는 while문을 선언한다.
        {
            System.out.println("Round : " + round);//현재가 몇라운드인지를 출력한다.
            System.out.println("Turn of " + player);//현재 누구의 턴인지를 출력한다.
            
            System.out.println("Please enter row number(1~3)");
            insertRow = keyboard.nextInt();//사용자가 입력한 정수값을 insertRow에 저장한다.
            
            while(rowIsVaild == false)//rowIsVaild가 false이면 반복하는 while문을 선언한다.
            {
            	if(insertRow < 1 || insertRow > 3)//만약 insertRow가 1 미만이고 3 초과이면
            	{
            		System.out.println("Row values range from 1 to 3.");//입력을 반복한다.
            		System.out.println("Please enter row number(1~3)");
                    insertRow = keyboard.nextInt();
            	}
            	else//아니라면
            		rowIsVaild = true;//rowIsVaild의 값을 true로 변경한다.
            }
            
            System.out.println("Please enter column number(1~3)");
            incertCol = keyboard.nextInt();//사용자가 입력한 정수값을 incertCol에 저장한다.
        
            while(colIsVaild == false)//colIsVaild가 false이면 반복하는 while문을 선언한다.
            {
            	if(incertCol < 1 || incertCol > 3)//만약 incertCol이 1 미만이고 3 초과이면
            	{
            		System.out.println("Column values range from 1 to 3.");//입력을 반복한다.
            		System.out.println("Please enter column number(1~3)");
                    incertCol = keyboard.nextInt();
            	}
            	else//아니라면
            		colIsVaild = true;//colIsVaild의 값을 true로 변경한다.
            }
  
            System.out.println(player + " insert (" + insertRow + "," + incertCol + ")");//사용자가 입력한 좌표를 출력한다. 

            if (board[insertRow - 1][incertCol - 1] == 'O' || board[insertRow - 1][incertCol - 1] == 'X')
            //만약 사용자가 입력한 좌표에 이미 O나 X가 있다면
            {
                System.out.println("This place already inserted.\n Please insert another place");
            }

            else//아니라면
            {
                insertIsVaild = true;//insertIsVaild의 값을 true로 변경한다.
                board[insertRow - 1][incertCol - 1] = player;//board[insertRow - 1][incertCol - 1]에 player를 저장한다.
                round++;//round에 1을 더한다.
            }
        }
    }
    
    private static void gameBoard()//게임보드를 출력해줄 메소드 gameBoard를 정의한다.
    {
 
        System.out.println("  ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        for(row = 0; row < 3; row++)//row의 크기만큼 반복하는 for문을 선언한다.
        {
            
            System.out.println( " | " + board[row][0] // board[row][0] 출력
                              + " | " + board[row][1] // board[row][1] 출력
                              + " | " + board[row][2] // board[row][2] 출력
                              + " |");
            System.out.println("  ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        }
    }

    private static boolean win()//게임의 승리 여부를 판별해줄 메소드 win을 정의한다.
    {
        for(row = 0; row < 3; ++row)//row의 크기만큼 반복하는 for문을 선언한다.
        {
        	if(board[row][0] == player && board[row][1] == player && board[row][2] == player)
        	//만약 행 한줄이 모두 player의 값과 같다면
            {
                System.out.println ("Winner is " + player);//승자를 출력             
                return true;//true를 리턴한다.
            }   
        }//행으로 인한 승리의 경우
        
  
        for(col = 0; col < 3; ++col)//col의 크기만큼 반복하는 for문을 선언한다.
        {
        	if(board[col][0] == player && board[col][1] == player && board[col][2] == player)
        	//만약 열 한줄이 모두 player의 값과 같다면	
            {
        	     System.out.println ("Winner is " + player);//승자를 출력             
                 return true;//true를 리턴한다.
            }   
        }//열로 인한 승리의 경우

       
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
        //만약 \ 방향 대각선이 모두 player의 값과 같다면
        {
        	 System.out.println ("Winner is " + player);//승자를 출력             
             return true;//true를 리턴한다.
        }//대각선으로 인한 승리의 경우
        
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
        //만약 / 방향 대각선이 모두 player의 값과 같다면
        {
        	 System.out.println ("Winner is " + player);//승자를 출력             
             return true;//true를 리턴한다.
        }//대각선으로 인한 승리의 경우2

        if(round >= 10)//만약 round의 값이 10 이상이면 
        {
            System.out.println("Draw");
            return true;//true를 리턴한다.
        }//비긴 경우

        else//아니라면
        	return false;//false를 리턴한다.
        
    }
    
    private static void changeTurn()//턴마다 플레이어를 바꿔줄 메소드 changeTurn을 정의한다.
    {
    
    	 if(player == 'X')//만약 player가 X라면
             player = 'O';//player에 O를 저장한다.
         else//아니라면
             player = 'X';//player에 X를 저장한다.
    }

    private static void reinitialize()//게임 초기화를 해줄 메소드 reinitialize를 정의한다.
    {
        System.out.println("The first turn is X");

        for(row = 0; row < 3; ++row)//row의 크기만큼 반복하는 for문을 선언한다.
        {
            for(col = 0; col < 3; ++col)//col의 크기만큼 반복하는 for문을 선언한다.
                board[row][col] = ' ';// board[row][col]에 공백을 저장한다.(보드 초기화)
        }
        round = 1;//round의 값에 1을 저장한다.
        gameBoard();//메소드 gameBoard를 실행한다.
    }
    
    public static void main(String[] args)
    {
        while(true)//무한 반복 while문을 선언한다.
        {
            reinitialize();//메소드 reinitialize를 실행한다.
            player = 'O';//player의 값에 O를 저장한다.
            
            while(!win())//win의 리턴값이 false이면 반복하는 while문을 선언한다.
            {      
            	changeTurn();//메소드 changeTurn를 실행한다.
                move();//메소드 move를 실행한다.   
                gameBoard();//메소드 gameBoard를 실행한다.               
            }
            
        }
    }

}