/**
 * Program using scientific notation to indicate double type numbers.(Include DollarFormat.java and OutputFormat.java) 
 * Author: Oh ChanHee
 * E-mail Address: dhcksgml98@gc.gachon.ac.kr 
 * HW4 Problem1 
 * Last changed: May 16,2020.
 */
public class DoubleOut {
	/**
	 Displays amount in dollars and cents notation. 
     Rounds after two decimal places. 
     Does not advance to the next line after output.
	 */
	public static void write(double amount) 
	{
		if (amount >= 0)
		{
			System.out.print('$');
			writePositive(amount);
		} else 
		{
			double positiveAmount = -amount;
			System.out.print('$');
			System.out.print('-');
			writePositive(positiveAmount);
		}
	}

	// Precondition: amount >= 0;
	// Displays amount in dollars and cents notation. Rounds
	// after two decimal places. Omits the dollar sign.
	private static void writePositive(double amount) 
	{
		int allCents = (int) (Math.round(amount * 100));
		int dollars = allCents / 100;
		int cents = allCents % 100;
		System.out.print(dollars);
		System.out.print('.');

		if (cents < 10)
			System.out.print('0');
				System.out.print(cents);
	}

	/**
	 Displays amount in dollars and cents notation. 
     Rounds after two decimal points. 
     Advances to the next line after output.
	 */
	public static void writeln(double amount) 
	{
		write(amount);
		System.out.println();
	}
	
//여기까지  DollarFormat.java의 메소드들 입니다.
	
	/**
	 Displays a number with digitsAfterPoint digits after
     the decimal point. Rounds any extra digits.
     Does not advance to the next line after output.
	 */
	public static void write(double number, int digitsAfterPoint) 
	{
		if (number >= 0)
			writePositive(number, digitsAfterPoint);
		else 
		{
			double positiveNumber = -number;
			System.out.print('-');
			writePositive(positiveNumber, digitsAfterPoint);
		}
	}

	/**
	 Displays a number with digitsAfterPoint digits after
     the decimal point. Rounds any extra digits.
     Advances to the next line after output.
	 */
	public static void writeln(double number, int digitsAfterPoint) 
	{
		write(number, digitsAfterPoint);
		System.out.println();
	}

	// Precondition: number >= 0
	// Displays a number with digitsAfterPoint digits after
	// the decimal point. Rounds any extra digits.
	private static void writePositive(double number, int digitsAfterPoint) 
	{
		int mover = (int) (Math.pow(10, digitsAfterPoint));
		// 1 followed by digitsAfterPoint zeros
		int allWhole; // number with the decimal point
						// moved digitsAfterPoint places
		allWhole = (int) (Math.round(number * mover));
		int beforePoint = allWhole / mover;
		int afterPoint = allWhole % mover;
		System.out.print(beforePoint);
		System.out.print('.');
		writeFraction(afterPoint, digitsAfterPoint);
	}

	// Displays the integer afterPoint with enough zeros
	// in front to make it digitsAfterPoint digits long.
	private static void writeFraction(int afterPoint, int digitsAfterPoint) 
	{
		int n = 1;
		while (n < digitsAfterPoint) 
		{
			if (afterPoint < Math.pow(10, n))
				System.out.print('0');
			n = n + 1;
		}
		System.out.print(afterPoint);
	}

//여기까지 OutputFormat.java 메소드들 입니다.
	

	private static void scienceWrite(double number, int digitsAfterPoint)
	//지수 표기 실수 e를 사용해 double형 변수를 출력해줄 static 메소드 scienceWrite를 정의한다.
	{
		if (number >= 0)//만약의 number가 0 이상이면(양수이면)
			scienceWritePositive(number, digitsAfterPoint);//scienceWritePositive메소드를 실행한다.
		else//아니라면(음수라면)
		{
			double positiveNumber = -number;//positiveNumber에 -number의 값을 저장한다.
			System.out.print('-');//-를 출력한다.
			scienceWritePositive(positiveNumber, digitsAfterPoint);//scienceWritePositive메소드를 실행한다.
		}
	}

	private static void scienceWritePositive(double number, int digitsAfterPoint)
	//지수 표기 실수 e를 사용해 양수 double형 변수를 출력해줄 static 메소드 scienceWritePositive를 정의한다.
	{
		int whole = (int) number;//int형 변수 whole을 선언하고 number를 int형으로 변환한 값을 저장한다.(소수점을 제외한 정수부분만 저장.)
		int e = 0;//지수 표기 실수 e를 선언 및 초기화한다.

		if(whole > 0)//만약 정수부분이 0 초과이면
		{
			while (whole >= 10)//whole이 10이상일때까지 반복한다.(정수 부분은 한자리수여야 하므로)
			{
				e++;//e에 1을 더한다.
				whole = whole / 10;//whole에 whole / 10의 값을 저장한다.
				//e1당 10을 곱하는것이기 때문에
			}
		} 
		else//아니라면(정수부분이 0이면)
		{
			double doubleNumber = number;//double형 변수 doubleNumber를 선언하고 number의 값을 저장한다.
			
			while ((int) doubleNumber < 1)//whole이 1 미만일때까지 반복한다.(정수 부분은 한자리수여야 하므로) 
			{
				e--;//e에 1을 뺀다.
				doubleNumber = doubleNumber * 10;//doubleNumber에 doubleNumber * 10의 값을 저장한다.
				//e-1당 1/10을 곱하는것이기 때문에
			}
		}
		
		int mover = (int) (Math.pow(10, digitsAfterPoint));
		//int형 변수 mover 선언 및 10의 digitsAfterPoint의 값만큼의 제곱근을 int형으로 변환하여 저장한다.
		int positiveeMover = (int) (Math.pow(10, e));
		//int형 변수 positiveeMover 선언 및 10의 e의 값만큼의 제곱근을 int형으로 변환하여 저장한다.
		int negativeeMover = (int) (Math.pow(10, -e));
		//int형 변수 negativeeMover 선언 및 10의 -e의 값만큼의 제곱근을 int형으로 변환하여 저장한다.
		
		int allWhole;//mover를 통해 정수와 소수부분이 변경된 수의 정수부분을 저장해줄 변수 allWhole을 선언한다.
		
		if (e >= 0)//만약 e가 0 이상이면 
		{
			allWhole = (int) (Math.round(number * mover / positiveeMover));
			//allWhole에 number * mover / positiveeMover의 값을 소수 첫째자리에서 반올림하여 정수형으로 저장한다.
			//왜 그런지 예시를 들어 설명하자면
			//앞선 코드를 통해 100.678이라는 값을 넣었을 때 100과 e = 0 -> 10과 e = 1 -> 1과 e = 2 라는 결과를 얻는다.
			//그 후 digitsAfterPoint가 5라고 가정하고 이 코드를 실행하면 number * mover는 10067800이라는 값을 얻는다.
			//여기서 e = 2 이므로 100만큼 나누어주면 100678.00,  int형으로 변환해야 하므로 allwhole은 100678이라는 값을 얻는다.
			//후에 서술할 beforePoint와 afterPoint를 통해 그 후 과정을 서술하겠다.
		} 
		else//아니라면(e가 0 미만이면)
		{
			allWhole = (int) (Math.round(number * mover * negativeeMover));	
			//allWhole에 number * mover * negativeeMoverr의 값을 소수 첫째자리에서 반올림하여 정수형으로 저장한다.
			
		}

		int beforePoint = allWhole / mover;
		//beforePoint를 선언 및 allWhole / mover 값을 저장한다.
		//앞서 설명했던 예시를 이어서 설명하자면
		//100678을 Math.pow(10, digitsAfterPoint) = 10의 5제곱근만큼 나누어야하므로 1.00678, int형으로 변환해야하므로 1이라는 값을 얻는다.
		int afterPoint = allWhole % mover;
		//afterPoint를 선언 및 allWhole % mover 값을 저장한다.
		//앞서 설명했던 예시를 이어서 설명하자면
		//100678을 Math.pow(10, digitsAfterPoint) = 10의 5제곱근만큼 나눈 나머지의 값은 678이다
		//다음 일어날 과정은 밑에 코드의 주석을 통해 설명하겠다.
		
		//후에 실행할 writeFraction 메소드를 통해 digitsAfterPoint의 수(5)와 afterPoint의 자릿수(3)차이만큼 앞에 0을 추가하여준다.
		//그러면 
		
		System.out.print(beforePoint);//beforePoint의 값을 출력한다.
		System.out.print('.');//.을 출력한다.
		writeFraction(afterPoint, digitsAfterPoint);
		//writeFraction 메소드를 실행시킨다.
		//앞서 설명했던 예시를 이어서 설명하자면
		//digitsAfterPoint의 수(5)와 afterPoint의 자릿수(3)차이만큼(5 - 3 = 2) afterPoint 앞에 0을 추가하고 출력한다.
		//그리하면 00678을 출력하는 것이다.
		System.out.print("e" + e);
		//e와 e의 값을 출력한다.	
		
		//예시를 든 값을 기준으로
		//beforePoint = 1, 그리고 '.' 
		//그리고 writeFraction(afterPoint, digitsAfterPoint)의 출력값 00678
		//그리고 e와 e의 값 = e2
		//이 모든 출력을 한번에 보면  1.00678e2 가 되는것이다.
	}

	public static void scienceWriteln(double number, int digitsAfterPoint)
	//지수 표기 실수 e를 사용해 double형 변수를 출력해주고 한줄 띄어줄 static 메소드 scienceWriteln를 정의한다.
	{
		scienceWrite(number, digitsAfterPoint);//메소드 scienceWrite을 실행한다.
		System.out.println();//한줄 띈다.
	}

}
