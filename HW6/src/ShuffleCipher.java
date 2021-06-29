/**
 Program Shuffle the string n times to encode.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW6 Problem3
 Last changed: June 17, 2020.
 */
public class ShuffleCipher implements MessageEncoder 
//MessageEncoder 인터페이스를 상속받은 클래스 ShuffleCipher를 정의한다
//클래스 ShuffleCipher의 목적은 문자열을 n번만큼 셔플하여 암호화하는 것
{  
    private int shuffleNum;//몇번 셔플할건지에 대한 값을 저장할 변수 shuffleNum
     
    public ShuffleCipher(int repeat)//몇번 셔플할건지 값을 받는 생성자 ShuffleCipher을 정의한다 
    {
        shuffleNum = repeat;//shuffleNum에 repeat의 값을 저장한다
    }
    
    private String shuffle(String str)//문자열을 셔플해줄 메소드 shuffle을 정의한다
    {
    	String shuffleStr = "";//셔플한 문자열을 저장해줄 문자열 shuffleStr
    	
    	int middle = str.length()/2;//문자열을 셔플하기 위해 문자열의 분기점의 값을 저장할 변수 middle 선언 및 문자열 str 길이 / 2 의 값을 저장한다
        
        String frontHalfStr = str.substring(0, middle);//반으로 나눈 문자열의 앞 쪽을 저장할 문자열 frontHalfStr
        String rearHalfStr = str.substring(middle);//반으로 나눈 문자열의 뒤 쪽을 저장할 문자열 rearHalfStr
	
     
        for(int i=0; i<frontHalfStr.length(); i++)//frontHalfStr의 길이만큼 반복하는 for문
        {

            	shuffleStr = shuffleStr + frontHalfStr.charAt(i) + rearHalfStr.charAt(i);
            	//shuffleStr 문자열에 shuffleStr 문자열과 frontHalfStr 문자열의 i번 문자와 rearHalfStr 문자열의 i번 문자를 저장한다
        	
        }
        
        if(str.length() % 2 != 0)//만약 문자열 str의 길이가 홀수라면
        	shuffleStr = shuffleStr + rearHalfStr.charAt(rearHalfStr.length()-1);
        	//shuffleStr 문자열에 shuffleStr 문자열과 rearHalfStr 문자열의 마지막 문자를 저장한다
        	//윗 for문은 frontHalfStr 문자열의 길이 기준으로 하였기 때문에 str 문자열의 길이가 홀수이면 rearHalfStr 문자열의 마지막 문자를 출력하지 못하기 때문
        
        return shuffleStr;//shuffleStr 문자열을 리턴한다
    }
    

    
    public String encode(String str)//문자열을 암호화하여 리턴해줄 메소드 encode를 정의한다(인터페이스 MessageEncoder의 encode 메소드 틀 사용)
    {
        String cipherTxt = str;//암호화할 문자열을 저장해줄 문자열 cipherTxt
        
        for(int i=0; i<shuffleNum; i++)//shuffleNum만큼 반복하는 for문
        {
            cipherTxt = shuffle(cipherTxt);//cipherTxt 문자열에 cipherTxt 문자열에 대한 shuffle 메소드의 리턴값을 저장한다
        }
        
        return cipherTxt;//cipherTxt를 리턴한다
    }
    

    
 
    public static void main(String[] args) {
    	ShuffleCipher shuffle3Times = new ShuffleCipher(3);
    	 System.out.println("Demonstrating cipher.");
    	 String plain = "A message to encode";
    	 System.out.println("Plain text: " + plain);
    	 String cipher = shuffle3Times.encode(plain);
    	 System.out.println("Cipher text: " + cipher); 
    	 ShuffleCipher shuffle1 = new ShuffleCipher(1);
    	 ShuffleCipher shuffle2 = new ShuffleCipher(2);
    	 ShuffleCipher shuffle3 = new ShuffleCipher(3);
    	 ShuffleCipher shuffle4 = new ShuffleCipher(4);
    	 String test = "abcd1234";
    	 System.out.println("Shuffling " + test);
    	 System.out.println("1 shuffle: " + shuffle1.encode(test));
    	 System.out.println("2 shuffle: " + shuffle2.encode(test));
    	 System.out.println("3 shuffle: " + shuffle3.encode(test));
    	 System.out.println("4 shuffle: " + shuffle4.encode(test));
    	 test = "abcd12345";
    	 System.out.println("Shuffling " + test);
    	 System.out.println("1 shuffle: " + shuffle1.encode(test));
    	 System.out.println("2 shuffle: " + shuffle2.encode(test));
    	 System.out.println("3 shuffle: " + shuffle3.encode(test));
    	 System.out.println("4 shuffle: " + shuffle4.encode(test)); 
        
        
        
    }
    
}




