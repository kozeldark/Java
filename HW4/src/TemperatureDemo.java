/**
 Program enter a value and type of temperature for the Temperature class.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW4 Problem4
 Last changed: May 18, 2020.
 */
public class TemperatureDemo//Temperature 클래스에 온도의 값과 종류를 입력해줄 클래스 TemperatureDemo를 정의한다
{
	public static void main(String[] args) 
	{
		System.out.println("Set T1 is 0.0 degree of Celcius and T2 is 32.0 degree of Fahrenheit.");
		//Set T1 is 0.0 degree of Celcius and T2 is 32.0 degree of Fahrenheit.를 출력한다.
		Temperature t1 = new Temperature();//new 연산자를 통해 Temperature 클래스의  인스턴스 t1을 생성한다.(생성자Temperature() 기반.)
		//아무 값도 입력하지 않으면 온도는 0, 종류는 Celcius로 설정되므로 이렇게 선언하였다.
		Temperature t2 = new Temperature(32.0, 'F');
		//new 연산자를 통해 Temperature 클래스의  인스턴스 t2를 생성한다.(생성자 Temperature(double degreeValue, char scaleValue) 기반.)
		//온도는 32.0, 종류는 Fahrenheit로 선언하였다.
		System.out.println("T1 is 0.0 degree of Celcius.");//T1 is 0.0 degree of Celcius.를 출력한다.
		System.out.println("T2 is 32.0 degree of Fahrenheit.");//T2 is 32.0 degree of Fahrenheit.를 출력한다.
		
		System.out.println("Outputs two temperatures to Celsius.");//Outputs two temperatures to Celsius.를 출력한다.
		System.out.print("T1's ");//T1's 를 출력한다.
		t1.writeC();//Temperature 클래스의  인스턴스 t1의 메소드 writeC를 실행한다.
		System.out.print("T2's ");//T2's 를 출력한다.
		t2.writeC();//Temperature 클래스의  인스턴스 t2의 메소드 writeC를 실행한다.
		
		System.out.println("Outputs two temperatures to Fahrenheit.");//Outputs two temperatures to Fahrenheit.를 출력한다.
		System.out.print("T1's ");//T1's 를 출력한다.
		t1.writeF();//Temperature 클래스의  인스턴스 t1의 메소드 writeF를 실행한다.
		System.out.print("T2's ");//T2's 를 출력한다.
		t2.writeF();//Temperature 클래스의  인스턴스 t2의 메소드 writeF를 실행한다.
		
		if(t1.getF() == t2.getF())
		//만약 Temperature 클래스의  인스턴스 t1의 메소드 getF의 값이 Temperature 클래스의  인스턴스 t2의 메소드 getF와 같다면
		{
			System.out.println("Are the two temperatures the same?");//Are the two temperatures the same?를 출력한다.
			System.out.println(t1.equals(t2));//Temperature 클래스의  인스턴스 t1의 메소드 equals의 t2의 값에 대한 값을 출력한다.
		}
		else if(t1.getF() > t2.getF())
		//만약 Temperature 클래스의  인스턴스 t1의 메소드 getF의 값이 Temperature 클래스의  인스턴스 t2의 메소드 getF보다 크다면
		{
			System.out.println("Is the temperature of T1 greater than T2?");//Is the temperature of T1 greater than T2?를 출력한다.
			System.out.println(t1.isGreaterThan(t2));//Temperature 클래스의  인스턴스 t1의 메소드 isGreaterThan의 t2의 값에 대한 값을 출력한다.
		}
		else if(t1.getF() < t2.getF())
		//만약 Temperature 클래스의  인스턴스 t1의 메소드 getF의 값이 Temperature 클래스의  인스턴스 t2의 메소드 getF보다 작다면
		{
			System.out.println("Is the temperature of T1 less than T2?");//Is the temperature of T1 less than T2?를 출력한다.
			System.out.println(t1.isLessThan(t2));//Temperature 클래스의  인스턴스 t1의 메소드 isLessThan의 t2의 값에 대한 값을 출력한다.
		}
		
		System.out.println("\n\n");//다음 테스트와의 구분을 위해 줄을 띄었습니다.
		
		System.out.println("Set T1 is -40.0 of Celcius and T2 is -40.0 of Fahrenheit.");
		//Set T1 is -40.0 of Celcius and T2 is -40.0 of Fahrenheit.를 출력한다.
		t1.set(-40.0);//Temperature 클래스의  인스턴스 t1의 메소드 set(double degreeValue)을 -40.0도의 값을 넣어 실행한다.
		//종류의 값을 넣지않으면 Celcius로 되기 때문에 이렇게 선언하였다.
		t2.set(-40.0, 'F');
		//Temperature 클래스의  인스턴스 t2의 메소드 set(double degreeValue, char scaleValue)을 -40.0와 F값을 넣어 실행한다.
		System.out.println("T1 is -40.0 degree of Celcius.");//T1 is -40.0 degree of Celcius.를 출력한다.
		System.out.println("T2 is -40.0 degree of Fahrenheit.");//T2 is -40.0 degree of Fahrenheit.를 출력한다.
		
		System.out.println("Outputs two temperatures to Celsius.");//Outputs two temperatures to Celsius.를 출력한다.
		System.out.print("T1's ");//T1's 를 출력한다.
		t1.writeC();//Temperature 클래스의  인스턴스 t1의 메소드 writeC를 실행한다.
		System.out.print("T2's ");//T2's 를 출력한다.
		t2.writeC();//Temperature 클래스의  인스턴스 t2의 메소드 writeC를 실행한다.
		
		System.out.println("Outputs two temperatures to Fahrenheit.");//Outputs two temperatures to Fahrenheit.를 출력한다.
		System.out.print("T1's ");//T1's 를 출력한다.
		t1.writeF();//Temperature 클래스의  인스턴스 t1의 메소드 writeF를 실행한다.
		System.out.print("T2's ");//T2's 를 출력한다.
		t2.writeF();//Temperature 클래스의  인스턴스 t2의 메소드 writeF를 실행한다.
		
		if(t1.getF() == t2.getF())
		//만약 Temperature 클래스의  인스턴스 t1의 메소드 getF의 값이 Temperature 클래스의  인스턴스 t2의 메소드 getF와 같다면
		{
			System.out.println("Are the two temperatures the same?");//Are the two temperatures the same?를 출력한다.
			System.out.println(t1.equals(t2));//Temperature 클래스의  인스턴스 t1의 메소드 equals의 t2의 값에 대한 값을 출력한다.
		}
		else if(t1.getF() > t2.getF())
		//만약 Temperature 클래스의  인스턴스 t1의 메소드 getF의 값이 Temperature 클래스의  인스턴스 t2의 메소드 getF보다 크다면
		{
			System.out.println("Is the temperature of T1 greater than T2?");//Is the temperature of T1 greater than T2?를 출력한다.
			System.out.println(t1.isGreaterThan(t2));//Temperature 클래스의  인스턴스 t1의 메소드 isGreaterThan의 t2의 값에 대한 값을 출력한다.
		}
		else if(t1.getF() < t2.getF())
		//만약 Temperature 클래스의  인스턴스 t1의 메소드 getF의 값이 Temperature 클래스의  인스턴스 t2의 메소드 getF보다 작다면
		{
			System.out.println("Is the temperature of T1 less than T2?");//Is the temperature of T1 less than T2?를 출력한다.
			System.out.println(t1.isLessThan(t2));//Temperature 클래스의  인스턴스 t1의 메소드 isLessThan의 t2의 값에 대한 값을 출력한다.
		}
		
		System.out.println("\n\n");//다음 테스트와의 구분을 위해 줄을 띄었습니다.
		
		//아래 코드부터는 앞에 코드들의 주석으로 모두 이해가 가능하므로 달지 않았습니다.
		
		System.out.println("Set T3 is 100.0 of Celcius and T4 is 212.0 of Fahrenheit.");
		
		Temperature t3 = new Temperature(100.0, 'C');
		Temperature t4 = new Temperature(212.0, 'F');

		System.out.println("T3 is 100.0 degree of Celcius.");
		System.out.println("T4 is 212.0 degree of Fahrenheit.");
		
		System.out.println("Here are the two temperatures converted to degrees C:");
		
		System.out.print("T3's ");
		t3.writeC();
		System.out.print("T4's ");
		t4.writeC();
		
		System.out.println("Here are the two temperatures converted to degrees F:");
		
		System.out.print("T3's ");
		t3.writeF();
		System.out.print("T4's ");
		t4.writeF();
		
		if(t3.getF() == t4.getF())
		{
			System.out.println("Are the two temperatures the same?");
			System.out.println(t3.equals(t4));
		}
		else if(t3.getF() > t4.getF())
		{
			System.out.println("Is the temperature of T3 greater than T4?");
			System.out.println(t3.isGreaterThan(t4));
		}
		else if(t3.getF() < t4.getF())
		{
			System.out.println("Is the temperature of T3 less than T4?");
			System.out.println(t3.isLessThan(t4));
		}
		
		System.out.println("\n\n");
		
		System.out.println("Set T5 is 135.678 of Celcius and T6 is 222.345 of Fahrenheit.");
		
		Temperature t5 = new Temperature(135.678, 'C');
		Temperature t6 = new Temperature(222.345, 'F');

		System.out.println("T5 is 135.678 degree of Celcius.");
		System.out.println("T6 is 222.345 degree of Fahrenheit.");
		
		System.out.println("Here are the two temperatures converted to degrees C:");
		
		System.out.print("T5's ");
		t5.writeC();
		System.out.print("T6's ");
		t6.writeC();
		
		System.out.println("Here are the two temperatures converted to degrees F:");
		
		System.out.print("T5's ");
		t5.writeF();
		System.out.print("T6's ");
		t6.writeF();
		
		if(t5.getF() == t6.getF())
		{
			System.out.println("Are the two temperatures the same?");
			System.out.println(t5.equals(t6));
		}
		else if(t5.getF() > t6.getF())
		{
			System.out.println("Is the temperature of T5 greater than T6?");
			System.out.println(t5.isGreaterThan(t6));
		}
		else if(t5.getF() < t6.getF())
		{
			System.out.println("Is the temperature of T5 less than T6?");
			System.out.println(t5.isLessThan(t6));
		}
		
		System.out.println("\n\n");
		
		System.out.println("Set T7 is 34.5 of Celcius and T8 is 345.6 of Fahrenheit.");
		
		Temperature t7 = new Temperature(34.5, 'C');
		Temperature t8 = new Temperature(345.6, 'F');

		System.out.println("T7 is 34.5 degree of Celcius.");
		System.out.println("T8 is 345.6 degree of Fahrenheit.");
		
		System.out.println("Here are the two temperatures converted to degrees C:");
		
		System.out.print("T7's ");
		t7.writeC();
		System.out.print("T8's ");
		t8.writeC();
		
		System.out.println("Here are the two temperatures converted to degrees F:");
		
		System.out.print("T7's ");
		t7.writeF();
		System.out.print("T8's ");
		t8.writeF();
		
		if(t7.getF() == t8.getF())
		{
			System.out.println("Are the two temperatures the same?");
			System.out.println(t7.equals(t8));
		}
		else if(t7.getF() > t8.getF())
		{
			System.out.println("Is the temperature of T7 greater than T8?");
			System.out.println(t7.isGreaterThan(t8));
		}
		else if(t7.getF() < t8.getF())
		{
			System.out.println("Is the temperature of T7 less than T8?");
			System.out.println(t7.isLessThan(t8));
		}
		
	}
}