/**
 Program .
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW6 Problem1
 Last changed: June 14, 2020.
 */

public class Square extends DrawableShape
//DrawableShape 추상 클래스를 상속받은 클래스 Square를 정의한다
//클래스 Square의 목적은 정사각형을 *을 이용하여 그리는것 
{
	private int length;//변의 길이의 값을 저장할 변수 length

	public Square(int num)//정사각형의 길이의 값을 받는 생성자 Square
	{
		super(0, 0, "theColor");
		//기본값으로 추상 클래스  DrawableShape의  DrawableShape(int x, int y, String theColor) 생성자를 호출한다
		length = num;//length에 num의 값을 저장한다
	}
	
	public int getLength()//변의 길이의 값을 리턴해줄 메소드 getLength를 정의한다
	{
		return length;//length의 값을 리턴한다
	}
	
	public void setLength(int num)//변의 길이의 값을 설정해줄 메소드 setLength를 정의한다
	{
		length = num;//length에 num의 값을 저장한다
	}

	public int getArea()//변의 길이의 값을 리턴해줄 메소드 getLength를 정의한다
	{
		return length * length;//length의 값을 리턴한다
	}
	
	public int getPerimeter()//변의 길이의 값을 리턴해줄 메소드 getLength를 정의한다
	{
		return length * 4;//length의 값을 리턴한다
	}
	
	@Override
	public void draw()//도형을 그릴 메소드 draw를 정의한다(DrawableShape 추상 클래스의 draw 추상 메소드를 사용)
	{
		int xPoint = getX();//추상 클래스  DrawableShape의 getX 메소드의 리턴 값을 xPoint에 저장한다
		//getX()의 리턴값 만큼 이동한 x좌표 위치에서 도형 그리기 시작하기 위해
        int yPoint = getY();//추상 클래스  DrawableShape의 getY 메소드의 리턴 값을 yPoint에 저장한다
        //getY()의 리턴값 만큼 이동한 y좌표 위치에서 도형 그리기 시작하기 위해
        
        for(int i=0; i<yPoint; i++)//yPoint의 크기만큼 반복하는 for문
        {
            System.out.println();//한줄씩 띈다(y좌표 이동)
        }
        
        String xSpace = "";//x좌표 이동을 위한 문자열 xSpace 선언 및 초기화
        for(int i=0; i<xPoint; i++)//xPoint의 크기만큼 반복하는 for문
        {
        	xSpace = xSpace + " ";//xSpace 문자열에 xSpace + 공백 을 저장한다
        }
        
        System.out.print(xSpace);//xSpace 문자열을 출력한다(x좌표 이동)
        
        for(int i=0; i<length; i++)//length만큼 반복하는 for문(윗변 출력)
        {   	
            System.out.print("*");//한줄 띄지않고 *을 출력한다
        }      
        System.out.println();//한줄 띈다
        
        
        for(int i=0; i < length - 2; i++)//length - 2의 값만큼 반복하는 for문(윗변 아랫변을 제외하여야하기 때문)
        {
        	System.out.print(xSpace);//xSpace 문자열을 출력한다(x좌표 이동)
        	System.out.print("*");//한줄 띄지않고 *을 출력한다
        	
        	for(int j=0; j<length - 2; j++)//length - 2의 값만큼 반복하는 for문(윗변 아랫변을 제외하여야하기 때문)
        	{
        		System.out.print(" ");//공백을 출력한다(정사각형의 안은 비어있어서..)
        	}
            
        	 System.out.print("*");//한줄 띄지않고 *을 출력한다
        	 System.out.println();//한줄 띈다
        }
        
        System.out.print(xSpace);//xSpace 문자열을 출력한다(x좌표 이동)
        for(int i=0; i<length; i++)//length만큼 반복하는 for문(아랫변 출력)
        {
            System.out.print("*");//한줄 띄지않고 *을 출력한다
        }
        
        
        

	}
	

	public static void main(String[] args) {
        Square sq = new Square(5);
        sq.moveBy(7, 7);
         
        sq.draw();
    }

}
