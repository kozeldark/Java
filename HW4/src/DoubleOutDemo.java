/**
 * Program enter the required double value for the DoubleOut class.
 * Author: Oh ChanHee
 * E-mail Address: dhcksgml98@gc.gachon.ac.kr 
 * HW4 Problem1 
 * Last changed: May 16,2020.
 */
import java.util.Scanner;//Scanner 함수 사용을 위해 Scanner 클래스를 포함시킨다.

public class DoubleOutDemo//DoubleOut 클래스에 필요한 double값을 입력해줄 클래스 DoubleOutDemo를 정의한다.
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);//Scanner 객체 keyboard를 생성한다.

        double number;//사용자가 입력할 double형 수를 저장할 변수 number를 선언한다.
        int choice = 1;//사용자가 프로그램의 재시작 여부를 선택할 선택의 값을 저장할 변수 choice를 선언한다.        
                
        while(choice == 1)
        {
            System.out.println("Enter a value of type double:");//Enter a value of type double:를 출력한다.          
            number = keyboard.nextDouble();//사용자가 입력한 double형 수를 number에 저장한다.
            
            System.out.println("Outputs in dollar up to the third decimal place by rounding it out.");
            //Outputs in dollar up to the third decimal place by rounding it out.을 출력한다.
            DoubleOut.writeln(number);//DoubleOut클래스의 static 메소드 writeln(double amount)을 number의 값에 대하여 실행시킨다.

            System.out.println("Outputs up to the fifth decimal place by rounding it out.");
            //Outputs up to the fifth decimal place by rounding it out.을 출력한다.
            DoubleOut.writeln(number, 5);
            //DoubleOut클래스의 static 메소드 (double number, int digitsAfterPoint)을 number와 5의 값에 대하여 실행시킨다.

            System.out.println("Outputs exponential marking results until decimal point becomes fifth.");
            //Outputs exponential marking results until decimal point becomes fifth.를 출력한다.
            DoubleOut.scienceWriteln(number, 5);
            //DoubleOut클래스의 static 메소드 scienceWriteln(double number, int digitsAfterPoint)을 number와 5의 값에 대하여 실행시킨다.

            System.out.println("\nGet choice(Enter a number)\n1. retry \n2. exit");
            //한줄 띄고 Get choice(Enter a number)한줄 띄고1. retry 한줄 띄고2. exit 를 출력한다.
            choice = keyboard.nextInt();//사용자가 입력한 정수값을 choice에 저장한다.
        }     
        System.out.println("Exit Program.");//Exit Program.을 출력한다.
    }
}