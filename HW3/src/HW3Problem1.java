import java.util.Scanner;

public class HW3Problem1 
{

	private double quiz1, quiz2, midExam, finExam, percent, totalPercent;
	private boolean active;
	Scanner sc = new Scanner(System.in);

	private void Grade(double getGrade) 
	{
		percent = getGrade;

		if (percent >= 90) 
		{
			System.out.println("A");
		} 
		else if (percent >= 80) 
		{
			System.out.println("B");
		} 
		else if (percent >= 70) 
		{
			System.out.println("C");
		} 
		else if (percent >= 60) 
		{
			System.out.println("D");
		} 
		else 
		{
			System.out.println("F");
		}
	}

	private void QuizOne() 
	{
		active = true;
		System.out.println("Input the first quiz points." + "\n[Points are out of 10]");
		quiz1 = sc.nextInt();
		do {
			if (quiz1 > 10) 
			{
				System.out.println("Points can't exceed 10 points");
				System.out.println("Input the first quiz points." + "\n[Points are out of 10]");
				quiz1 = sc.nextInt();
			} 
			else 
			{
				active = false;
			}
		} while (active);

		totalPercent = (quiz1 / 10) * 100;
		System.out.println("Final grade for first quiz is:");
		Grade(totalPercent);
		System.out.println("");
	}

	private void QuizTwo() {
		active = true;
		System.out.println("Input the second quiz points." + "\n[Points are out of 10]");
		quiz2 = sc.nextInt();
		do {
			if (quiz2 > 10) {
				System.out.println("Points can't exceed 10 points");
				System.out.println("Input the second quiz points." + "\n[Points are out of 10]");
			} else {
				active = false;
			}
		} while (active);

		totalPercent = (quiz2 / 10) * 100;
		System.out.println("Final grade for second quiz is:");
		Grade(totalPercent);
		System.out.println("");
	}

	private void MidtermExam() 
	{
		active = true;
		System.out.println("Input the midterm points." + "\n[Points are out of 100]");
		midExam = sc.nextInt();
		do {
			if (midExam > 100) 
			{
				System.out.println("Points can't exceed 100 points");
				System.out.println("Input the midterm points." + "\n[Points are out of 100]");
			} 
			else 
			{
				active = false;
			}
		} while (active);

		totalPercent = (midExam / 100) * 100;
		System.out.println("Final grade for midterm quiz is:");
		Grade(totalPercent);
		System.out.println("");
	}

	private void FinalExam() {
		active = true;
		System.out.println("Input the final points." + "\n[Points are out of 100]");
		finExam = sc.nextInt();
		do {
			if (finExam > 100) {
				System.out.println("Points can't exceed 100 points");
				System.out.println("Input the final points." + "\n[Points are out of 100]");
			} else {
				active = false;
			}
		} while (active);

		totalPercent = (finExam / 100) * 100;
		System.out.println("Final grade for final quiz is:");
		Grade(totalPercent);
		System.out.println("");
	}

	public void setScore() 
	{
		QuizOne();
		QuizTwo();
		MidtermExam();
		FinalExam();

		double qFinal = (((quiz1 + quiz2) / 20) * 100) / 4;
		double mtFinal = ((midExam / 100) * 100) / 4;
		double fFinal = ((finExam / 100) * 100) / 2;
		double finalScore = qFinal + mtFinal + fFinal;
		System.out.println("Final grade for final quiz is:");
		Grade(finalScore);
	}
}