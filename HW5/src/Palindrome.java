
/**
 Program to determine whether a word or phrase is a Palindrome.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem6
 Last changed: May 31, 2020.
 */

import java.util.Scanner;//Scanner 함수 사용을 위해 Scanner 클래스를 포함시킨다.

public class Palindrome// 단어나 구절이 회문인지 판별해줄 클래스 Palindrome을 정의한다.
{
	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);// Scanner 객체 keyboard를 생성한다.
		
		boolean repeat = true;

		while (repeat) 
		{
			System.out.println("Enter a word or phrase(Only letters and spaces).");

			String wordNphrase = keyboard.nextLine();
			// String 변수 wordNphrase를 선언하고 사용자가 엔터키 입력전까지 입력한 값을 wordNphrase에 저장한다.

			if (wordNphrase.length() > 80)// 만약 wordNphrase의 길이가 80 초과라면
			{
				System.out.println("character's maximum is 80.(Include spaces)");
				// 초과했다고 표기한다.
			} 
			else// 아니라면
			{
				String wordNphraseUpper = wordNphrase.toUpperCase();
				// String 변수 wordNphraseUpper를 선언하고 String 변수 wordNphrase를 모두 대문자로 바꾼 String을
				// wordNphraseUpper에 저장한다.

				char[] noSpaceLetter = new char[80];
				// wordNphraseUpper의 각 문자열을 저장해줄 char형 array noSpaceLetter를 선언하여 new로 0~79번의
				// 인덱스를 할당하여준다.
				int k = 0;// noSpaceLetter의 인덱스를 설정할 때 사용할 변수 k를 선언하고 초기화한다.

				for (int i = 0; i < wordNphrase.length(); i++)// wordNphrase의 길이만큼 반복하는 for문을 선언한다.
				{

					if (wordNphraseUpper.charAt(i) != ' ' && wordNphraseUpper.charAt(i) != '.')
					// 만약 wordNphraseUpper를 i번째 문자열이 공백과 마침표가 아니라면
					{
						noSpaceLetter[k] = wordNphraseUpper.charAt(i);
						// noSpaceLetter[k]의 값에 wordNphraseUpper.charAt(i)의 값을 저장한다.
						k++;// k에 1을 더한다.
					}
				}

				if (isPalindrome(noSpaceLetter, k))// 만약 isPalindrome의 리턴값이 true이면
					System.out.println("Yes, this is a palindrome.");// 회문이 맞다고 표기한다.
				else// 아니라면
					System.out.println("No, this is not a palindrome.");// 회문이 아니라고 표기한다.
				
				Scanner keyboard1 = new Scanner(System.in);// Scanner 객체 keyboard1을 생성한다.
				//choice 받으면 wordNphrase도 같이 받아버려서 Scanner 객체를 하나 더 생성했습니다
				
				System.out.println("You want retry? If you want retry, write 1. Don't want retry write 0");
				//사용자의 반복 여부를 묻는다.
				int choice = keyboard1.nextInt();//int형 변수 choice 선언 및 사용자가 입력한 정수값을 choice에 저장한다.
				
				if(choice == 1)//만약 choice 가 1이면
					repeat = true;//repeat의 값에 true를 저장한다.
				else if(choice == 0)//만약 choice 가 0이면
					repeat = false;//repeat의 값에 false를 저장한다.
				else//모두 아니라면
				{
					System.out.println("If you want retry, write 1. Don't want retry, write 0");
					//다시 choice의 값을 받는다.
					choice = keyboard1.nextInt();
				}
	

			}
		}
	}

	public static boolean isPalindrome(char[] a, int used)// 회문인지 아닌지 판별해줄 메소드 isPalindrome을 정의한다.
	{
		int i = 0;// 반복문에 사용할 배열의 인덱스 값을 저장할 변수 i를 선언하고 0으로 설정한다.(배열의 첫 인덱스가 0이라서)
		int j = used - 1;
		// 반복문에 사용할 배열의 인덱스 값(뒤에서 부터 시작)을 저장할 변수 i를 선언하고 used -1으로 설정한다.(배열의 마지막 인덱스가
		// used 라서)

		while (i < j)// i가 j보다 작으면 계속 반복하는 while문을 선언한다.
		{
			if (a[i] == a[j])// 만약 a[i]가 a[j]와 같다면
			{
				i++;// i에 1을 더한다.
				j--;// j에 1을 뺀다.
			} else// 아니라면
			{
				return false;// false를 리턴한다.
			}
		}
		return true;// true를 리턴한다.
	}
}
