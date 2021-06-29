/**
 Program calculation of polynomial function.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem3
 Last changed: May 29, 2020.
 */

public class Polynomial//다항식 함수의 계산을 수행할 클래스 polynomial을 정의한다.
{
	private int degree;//최대 차수의 값을 저장할 변수 degree를 선언한다.
    private double[] coefficients;//계수를 저장할 array coefficients를 선언한다.
    
    public Polynomial(int max)//계수가 모두 0인 최대 차수의 다항식을 생성해줄 생성자 Polynomial를 정의한다.
    {
        degree = max;//degree에 max의 값을 저장한다.
        coefficients = new double[degree+1];//array coefficients를 new로 0~degree번의 인덱스를 할당하여준다.
    }
    
    public void setConstant(int i, double value)//i번째 계수를 value로 설정해줄 메소드 setConstant를 선언한다.
    {
        if(i >= 0 && i <= degree)//만약 i가 0 이상이고 degree 이하이면(degree는 최대 지수이기 때문)
        {
            coefficients[i] = value;//coefficients[i]에 value의 값을 저장한다.
        }
    }
    
    public double evaluate(double x)//값 x에 대한 다항식의 연산을 하여 값을 리턴해줄 메소드 evaluate를 정의한다.
    {
        double sum = 0;//총합의 값을 저장할 변수 sum을 선언 및 초기화한다.
        double n = 1;//차수의 값을 저장할 변수 n을 선언 및 1로 초기화한다.
        
        for(int i=0; i <= degree; i++)//degree(최대차수)까지 반복하는 for문을 선언한다.
        {
            sum = sum + coefficients[i] * n;//sum에 sum + coefficients[i] * n의 값을 저장한다.
            n = n * x;//n에 n * x의 값을 저장한다.
        }
        
        return sum;//sum의 값을 리턴한다.
    }
    

    public static void main(String[] args) {
        System.out.println("Constructing a polynomial");
        //a0 = 3, a1 = 5, a2 = 0, and a3 = 2
        Polynomial p = new Polynomial(5);
        p.setConstant(0, 3);
        p.setConstant(1, 5);
        p.setConstant(2, 0);
        p.setConstant(3, 2);
        
        System.out.println("Evaluating the polynomial at 0 should give 3");
        System.out.println("\tGot: " + p.evaluate(0));
        
        System.out.println("Evaluating the polynomial at 1 should give 10");
        System.out.println("\tGot: " + p.evaluate(1));
        
        System.out.println("Evaluating the polynomial at 7 should give 724");
        System.out.println("\tGot: " + p.evaluate(7));

        System.out.println("Evaluating the polynomial at 1/2 should give 5.75");
        System.out.println("\tGot: " + p.evaluate(0.5));

        
        
    }
    
}