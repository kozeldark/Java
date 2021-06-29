/**
 Program print each number of numbers in the phone number.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem2
 Last changed: May 27, 2020.
 */

import java.util.Scanner;//Scanner 함수 사용을 위해 Scanner 클래스를 포함시킨다.

public class CharacterFrequency//전화번호에 있는 숫자들의 각 개수를 출력해줄 CharacterFrequency 클래스를 정의한다.
{

	public static void main(String[] args) 
	{

		int[] digit = new int[10];//각 숫자들의 개수의 값을 저장해줄 int형 array digit을 선언하여 new로 0~9번의 인덱스를 할당하여준다.

		Scanner Keyboard = new Scanner(System.in);//Scanner 객체 keyboard를 생성한다.

		System.out.println("Write a phone number: ");
		String phoneNumber = Keyboard.next();//String 변수 phoneNumber를 선언하고 사용자가 스페이스키 입력전까지 입력한값을 phoneNumber에 저장한다.

		for (int i = 0; i < phoneNumber.length(); i++)//String 변수 phoneNumber의 길이만큼 반복하는 for문을 선언한다.
		{
			String num = phoneNumber.substring(i,i+1);
			//String 변수 num를 선언하고 String 변수 phoneNumber의 i번째에 해당하는 부분을 num에 저장한다.
			int intNum = Integer.parseInt(num);//int 변수 intNum을 선언하고 String 변수 num의 값을 int형으로 변환하여 intNum에 저장한다.

			if (intNum == 0)//만약 intNum이 0이라면
	            digit[0]++;//digit[0]의 값에 1을 더한다.
	         else if (intNum == 1)//만약 intNum이 1이라면
	            digit[1]++;
	         else if (intNum == 2)//만약 intNum이 2이라면
	            digit[2]++;
	         else if (intNum == 3)//만약 intNum이 3이라면
	            digit[3]++;
	         else if (intNum == 4)//만약 intNum이 4이라면
	            digit[4]++;
	         else if (intNum == 5)//만약 intNum이 5이라면
	            digit[5]++;
	         else if (intNum == 6)//만약 intNum이 6이라면
	            digit[6]++;
	         else if (intNum == 7)//만약 intNum이 7이라면
	            digit[7]++;
	         else if (intNum == 8)//만약 intNum이 8이라면
	            digit[8]++;
	         else if (intNum == 9)//만약 intNum이 9이라면
	            digit[9]++;
		}

		System.out.println("The count of each digits that the phone numbers : ");

		for (int i = 0; i < 10; i++)//10번 반복하는 for문을 선언한다.(array 크기가 10이므로) 
		{
			System.out.println("Count of digit " + i + " is " + digit[i]);//digit[i] 출력
		}

	}

}