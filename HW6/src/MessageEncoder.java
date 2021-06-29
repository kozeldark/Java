/**
 Program Define the interface that will be the framework for encode classes.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW6 Problem3
 Last changed: June 16, 2020.
 */

public interface MessageEncoder//암호화 클래스들의 틀이 되어 줄 인터페이스 MessageEncoder를 정의한다
{
	abstract String encode(String plainText);//encode 추상 메소드를 정의한다
}
