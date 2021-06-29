/**
 Program sell the flowers in the array.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem1
 Last changed: May 27, 2020.
 */

import java.util.Scanner;//Scanner 함수 사용을 위해 Scanner 클래스를 포함시킨다.

public class FlowerCounter//꽃들의 구매 가격 정보를 출력해줄 클래스 FlowerCounter를 정의한다.
{
	private static String[] flowerName = {"petunia",  "pansy", "rose", "violet", "carnation"};
	//각 꽃들의 이름을 저장해줄 String형 array flowerName을 선언하고 각 꽃들의 이름을 저장한다.
	private static double[] price = {0.50, 0.75, 1.50, 0.50, 0.80};
    //각 꽃들의 가격을 저장해줄 double형 array price을 선언하고 각 꽃들의 가격을 저장한다.
	private static int choice;//사용자가 선택한 꽃의 array의 위치의 값을 저장해줄 변수 choice를 선언한다.
	
	public static boolean isFlower(String[] flowername, String flower)
	//사용자가 선택한 꽃이 있는지를 판별해줄 메소드 isFlower를 정의한다.
	{
		boolean result = false;//리턴값 result를 정의하고 false로 초기화한다.
		
		 for(int i=0; i<flowername.length; i++)//array 개수만큼 반복하는 for문을 선언한다.
	        {
	            if(flowername[i].equals(flower))//만약 flowername[i]이 flower와 같다면
	            {
	            	choice = i;//choice에 i의 값을 저장한다.
	            	result = true;//result에 true의 값을 저장한다.
	            }
	            
	        }
		 
		 return result;//result를 리턴한다.
	}
	
    public static void main(String[] args) 
    {

        Scanner Keyboard = new Scanner(System.in);//Scanner 객체 keyboard를 생성한다.
               
        System.out.println("Enter the flowers you want to buy.");
        String flower = Keyboard.next();//String 변수 flower를 선언하고 사용자가 스페이스키 입력전까지 입력한값을 flower에 저장한다.
        

        if(isFlower(flowerName, flower) == false) //만약  isFlower메소드의 리턴값이 false라면    
            System.out.println("There is no such flower.");
        else//아니라면
        {
            System.out.println("How many will you buy?");
            int num = Keyboard.nextInt();//int 변수 num을 선언하고 사용자가 입력한 정수값을 변수 num에 저장한다.
            double totalCost = num * price[choice];
            //최종 가격을 나타내줄 double형 변수 totalCost를 선언하고 num * price[choice]의 값을 저장한다.
            
            if(price[choice] >= 1)//만약 price[choice]이 1 이상이면(1달러 이상이면)
            	System.out.println(flower  + " " + num + " for " + price[choice] + "$");//달러형으로 출력
            else//아니라면
            	System.out.println(flower  + " " + num + " for " + price[choice] * 100 + "¢");//센트형으로 출력
            
            if(totalCost >= 1)//만약 price[choice]이 1 이상이면(1달러 이상이면)            	
            	System.out.println("Price : " + totalCost + "$");//달러형으로 출력
            else
            	System.out.println("Price : " + totalCost * 100 + "¢");//센트형으로 출력
        }    
    }    
}