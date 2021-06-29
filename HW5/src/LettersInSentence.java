/**
 Program print how many each alphabets are in sentence.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem5
 Last changed: May 30, 2020.
 */

import java.util.Scanner;//Scanner 함수 사용을 위해 Scanner 클래스를 포함시킨다.

public class LettersInSentence//문장 내에 있는 알파벳이 각 몇개 있는지를 출력해줄 클래스 LettersInSentence를 정의한다.
{
	public static int AlphabetASCII(String letter)//String 변수를 아스키코드로 변환해줄 메소드 AlphabetASCII를 선언한다.
	{
		char letterChar = letter.charAt(0);
		//char형 변수 letterChar 선언 및 letter의 0번째 인덱스 값을 char 형으로 변환하여 letterChar에 저장한다.		
		int letterInt = (int) letterChar - (int) 'A';
		//int형 변수 letterInt 선언 및 letterChar를 int형으로 변환하여 아스키코드 값으로 바꾸고 A의 아스키코드 값만큼 뺀 값을 저장한다.
		
		return letterInt;//letterInt의 값을 리턴한다.
	}
	
	public static void main(String[] args) 
	{
		int[] letter = new int[26];//각 알파벳들의 개수의 값을 저장해줄 int형 array letter를 선언하여 new로 0~25번의 인덱스를 할당하여준다.

		Scanner keyboard = new Scanner(System.in);//Scanner 객체 keyboard를 생성한다.

		System.out.println("Enter a line of text terminated by a period.");

		String sentence = keyboard.nextLine();//String 변수 sentence를 선언하고 사용자가 엔터키 입력전까지 입력한값을 sentence에 저장한다.
		int lineLength = sentence.length();//int형 변수  lineLength를 선언하고 String 변수 sentence의 길이의 값을  lineLength 저장한다.

		String sentenceUpper = sentence.toUpperCase();
		//String 변수 sentenceUpper를 선언하고 String 변수 sentence를 모두 대문자로 바꾼 String을 sentenceUpper에 저장한다.	
		
		for(int i =0; i<lineLength; i++)//lineLength의 크기만큼 반복하는 for문을 선언한다.
		{
			String oneLetter = sentenceUpper.substring(i,i+1);
			//String 변수 oneLetter를 선언하고 String 변수 sentenceUpper의 i번째에 해당하는 부분을 oneLetter에 저장한다.
			if (oneLetter != ".")//만약 oneLetter의 값이 .이 아니라면
			{
				int letterASCII = AlphabetASCII(oneLetter);
				//int형 변수 letterASCII를 선언하고 AlphabetASCII 메소드의 값을 저장한다.
				
				if (letterASCII >= 0 && letterASCII <= 25)//만약 letterASCII의 값이 0이상 25이하라면
				{
					letter[letterASCII]++;//letter[letterASCII]의 값에 1을 더한다.
				}
				
			}
		}
		
		System.out.println("Number of each letters in a sentence.");
		
		for (int i = 0; i < 26; i++)//26번 반복하는 for문을 선언한다. 
		{
			if (letter[i] != 0)//만약 letter[i]가 0이 아니라면
				System.out.println("There is " + letter[i] + " " + (char) (i + 65) +   " in a sentence.");
			    //letter[i]의 값 및 아스키코드를 이용하여 그 letter를 출력한다.
		}

	}

	
}
