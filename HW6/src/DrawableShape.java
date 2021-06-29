/**
 Program define abstract class it will be the frame for shape drawing classes.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW6 Problem1
 Last changed: June 14, 2020.
 */

abstract class DrawableShape//도형 그리기 클래스들의 틀이 되어줄 추상 클래스 DrawableShape를 정의한다
{
	private int xLocation;//x좌표의 값을 저장해줄 변수 xLocation
	private int yLocation;//y좌표의 값을 저장해줄 변수 yLocation
	private String color;//무슨 색인지 문자열을 저장해줄 변수 color

	public DrawableShape(int x, int y, String theColor)//DrawableShape 클래스의 생성자를 정의한다
	{
		xLocation = x;//xLocation에 x의 값을 저장한다
		yLocation = y;//yLocation에 y의 값을 저장한다
		color = theColor;//color에 theColor 문자열을 저장한다
	}

	public int getX()//x좌표의 값을 리턴해줄 메소드 getX를 정의한다
	{
		return xLocation;//xLocation의 값을 리턴한다
	}

	public int getY()//y좌표의 값을 리턴해줄 메소드 getY를 정의한다
	{
		return yLocation;//yLocation의 값을 리턴한다
	}

	public String getColor()//색깔 문자열을 리턴해줄 메소드 getColor를 정의한다
	{
		return color;//color 문자열을 리턴한다
	}

	public void moveBy(int movedX, int movedY)//좌표 이동을 해줄 뮤테이터 메소드 moveBy를 정의한다
	{
		xLocation = xLocation + movedX;//xLocation에 xLocation + movedX의 값을 저장한다
		yLocation = yLocation + movedY;//yLocation에 yLocation + movedY의 값을 저장한다
	}

	abstract void draw();//추상 메소드 draw를 정의한다(draw라는 이름의 메소드를 쓸 수 있도록 틀을 잡아줌)

}
