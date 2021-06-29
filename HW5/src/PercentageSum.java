/**
 Program print the percentage of each number to the sum.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem4
 Last changed: May 30, 2020.
 */

import java.util.Scanner;//Scanner 함수 사용을 위해 Scanner 클래스를 포함시킨다.

public class PercentageSum//숫자들의 합의 각 숫자의 비율을 나타내줄 클래스 PercentageSum을 정의한다.
{
	private 
	static int number[];//각 숫자들을 저장해줄 int형 array number를 선언한다.
	
	private static int Sum(int[] array)//숫자들의 합을 리턴해줄 메소드 Sum을 정의한다.
	{
		int sum = 0;//숫자들의 합을 저장해줄 변수 sum을 선언 및 초기화한다.
		
		for (int i = 0; i < array.length; i++)//array의 길이만큼 반복하는 for문을 선언한다.
		{
			sum = sum + array[i];//sum에 sum + array[i]의 값을 저장한다.
		}
		return sum;//sum의 값을 리턴한다.
	}

	public static void main(String args[]) 
	{
		float percent;//각 숫자의 비율을 나타내줄 float형 변수 percent를 선언한다.
		
		System.out.println("How many numbers will you enter?");
		
		Scanner Keyboard = new Scanner(System.in);//Scanner 객체 keyboard를 생성한다.
		int num = Keyboard.nextInt();//int 변수 num을 선언하고 사용자가 입력한 정수값을 변수 num에 저장한다.
		
		System.out.println("Enter " + num + " integers, one per line:");
		
		number = new int[num];//array number를 new로 0~num-1번의 인덱스를 할당하여준다.

		for (int i = 0; i < num; i++)//num의 값만큼 반복하는 for문을 선언한다. 
		{
			number[i] = Keyboard.nextInt();//사용자가 입력한 정수값을 변수 number[i]에 저장한다.
		}

		float arrSum = Sum(number);//숫자들의 합을 저장해줄 변수 arrSum을 선언하여 메소드 Sum의 값을 저장한다.

		System.out.println("The Sum is " + (int)arrSum + ".\n" + "The numbers are:");//합계 출력

		for (int i = 0; i < num; i++)//num의 값만큼 반복하는 for문을 선언한다. 
		{
			percent = (float)(int)((number[i]) / arrSum * 100 * 10000) / 10000;
			//percent에 (float)(int)((number[i]) / arrSum * 100 * 10000) / 10000의 값을 저장한다.
			//소수 넷째짜리까지 나타내기 위해서 10000을 곱하고 int형 변환 후 float형으로 변환  후 10000을 나눔
			System.out.println(number[i] + ", which is " + percent + "% of the sum");//각 숫자들의 비율 출력

		}
	}
}
