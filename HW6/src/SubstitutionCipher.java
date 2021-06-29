/**
 Program encode the string by shift it n times(use ASCII code).
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW6 Problem3
 Last changed: June 17, 2020.
 */

public class SubstitutionCipher implements MessageEncoder
//MessageEncoder 인터페이스를 상속받은 클래스 SubstitutionCipher를 정의한다
//클래스 SubstitutionCipher의 목적은 문자열을 n번만큼 이동시켜 암호화하는 것
{   
    private int shift;//문자열들의 문자들을 다음 몇번째 문자로 바꿀건지에 대한 수의 값을 저장해줄 변수 shift (아스키코드 원리 이용)

    public SubstitutionCipher(int num)//몇번째 문자로 바꿀건지 값을 받는 생성자 SubstitutionCipher을 정의한다
    {
        shift = num;//shift에 num의 값을 저장한다
    }
    
    public char charShiftASCII(char ch)//문자를 다음 shift번째 문자로 이동시켜줄 메소드 charShiftASCII를 정의한다
    {
        return (char)(ch + shift);//ch + shift의 값을 char형으로 변환하여 리턴한다
    }
    
    public String encode(String str)//문자열을 암호화하여 리턴해줄 메소드 encode를 정의한다(인터페이스 MessageEncoder의 encode 메소드 틀 사용)
    {
        String encodeStr = "";//암호화한 문자열을 저장해줄 문자열 변수 encodeStr를 선언 및 초기화 
        
        for(int i=0; i<str.length(); i++)//str 문자열의 길이만큼 반복하는 for문
        {
            char strCh = str.charAt(i);//char형 변수 strCh을 선언 및 str 문자열의 i번째 문자를 저장한다
            
            encodeStr = encodeStr + charShiftASCII(strCh);//encodeStr에 encodeStr + charShiftASCII(strCh)의 값을 저장한다
        }
        return encodeStr;//encodeStr 문자열을 리턴한다
    }
    
 
    

    public static void main(String[] args) 
    {
    	SubstitutionCipher shiftBy3 = new SubstitutionCipher(3);
    	 System.out.println("Demonstrating cipher.");
    	 String plain = "A message to encode";
    	 System.out.println("Plain text: " + plain);
    	 String cipher = shiftBy3.encode(plain);
    	 System.out.println("Cipher text: " + cipher);       
    }
    
}



