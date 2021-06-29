/**
 Program output both Celsius and Fahrenheit temperatures and compare them.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW4 Problem4
 Last changed: May 18, 2020.
 */
public class Temperature//온도 변환과 비교를 해줄 클래스 Temperature를 정의한다.
{
    private double degree;//온도의 값을 받아와 저장해줄 변수 degree를  선언한다.
    private char scale;//온도의 종류를 받아와 저장해줄 변수 scale을 선언한다.
    private double convertedDegree;//온도를 상황에 맞게 변환하고 그 변환값을 저장해줄 변수 convertedDegree를 선언한다.
    
    public Temperature(double degreeValue)//온도의 값만 받는 생성자 Temperature(double degreeValue)를 정의한다.
    {
        degree = degreeValue;//degree에 degreeValue의 값을 저장한다.
        scale = 'C';//scale의 값을 C로 저장한다.(scale의 값을 받지 않은 경우 Celsius로 설정해야 하기 때문에.) 
    }

    public Temperature(char scaleValue)//온도의 종류만 받는 생성자 Temperature(char scaleValue)를 정의한다.
    {
        degree = 0;//degree의 값을 0으로 저장한다.(degree의 값을 받지 않은 경우 0으로 설정해야 하기 때문에.)
        scale = scaleValue;//scale에 scaleValue의 값을 저장한다.
    }
    
    public Temperature(double degreeValue, char scaleValue)
    //온도와 온도의 종류 모두를 받는 생성자 Temperature(double degreeValue, char scaleValue)를 정의한다.
    {
        degree = degreeValue;//degree에 degreeValue의 값을 저장한다.
        scale = scaleValue;//scale에 scaleValue의 값을 저장한다.
    }

    public Temperature()//아무것도 받지 않는 생성자 Temperature()를 정의한다.
    {
        degree = 0;//degree에 degreeValue의 값을 저장한다.(degree의 값을 받지 않은 경우 0으로 설정해야 하기 때문에.)
        scale = 'C';//scale에 scaleValue의 값을 저장한다.(scale의 값을 받지 않은 경우 Celsius로 설정해야 하기 때문에.) 
    }
    
    public void writeC()//degree를 Celsius 형태로 출력해줄 메소드 writeC를 정의한다.
    {
   
       if(scale =='C' || scale == 'c')//만약 scale의 값이 C이거나 c이면
       {
            System.out.println("Celsius temperature : " + Math.round(degree*10)/10.0);
          //Celsius temperature : 와 Math.round(degree*10)/10.0의 값을 출력한다.
       }

       else if(scale == 'F' || scale =='f')//만약 scale의 값이 F이거나 f이면
       {
           convertedDegree = 5 * (degree -32)/9;//convertedDegree에 5 * (degree -32)/9의 값을 저장한다.(화씨를 섭씨로 변환하는 과정.)
           System.out.println("Celsius temperature : " + Math.round(convertedDegree*10)/10.0);
           //Celsius temperature : 와 Math.round(convertedDegree*10)/10.0의 값을 출력한다.
           //Math.round(convertedDegree*10)/10.0를 하면 convertedDegree의 값을 소수 둘째자리에서 반올림하여 첫째자리까지만 나타내어준다.
       }
       
       else//모두 아니라면
       {
    	   System.out.println("Invalid value for sclae...");//Invalid value for sclae...를 출력한다.
       }
    }
    
    public double getC()//degree를 Celsius 형태로 리턴해줄 메소드 getC를 정의한다.
    {
 
    	if(scale =='C' || scale == 'c')//만약 scale의 값이 C이거나 c이면
        {
            return Math.round(degree*10)/10.0;//Math.round(degree*10)/10.0의 값을 리턴한다.
        }
    	
    	else if(scale == 'F' || scale =='f')//만약 scale의 값이 F이거나 f이면
        {
            convertedDegree = 5 * (degree -32)/9;//convertedDegree에 5 * (degree -32)/9의 값을 저장한다.(화씨를 섭씨로 변환하는 과정.)
            return Math.round(convertedDegree*10)/10.0;//Math.round(convertedDegree*10)/10.0의 값을 리턴한다.
        }

    	else//모두 아니라면
    	{
            return Math.round(degree*10)/10.0;//Math.round(degree*10)/10.0의 값을 리턴한다.
            //scale의 값이 적법하지 않더라도 degree를 출력해야 하기 때문에.
        }
    }

    public void writeF()//degree를 Celsius 형태로 리턴해줄 메소드 getC를 정의한다.
    {
    	if(scale == 'F' || scale =='f')//만약 scale의 값이 F이거나 f이면 
         {
            System.out.println("Fahrenheit temperature : " + Math.round(degree*10)/10.0);
            //Fahrenheit temperature : 와 Math.round(degree*10)/10.0의 값을 출력한다.
         }

    	else if(scale =='C' || scale == 'c')//만약 scale의 값이 C이거나 c이면 
         {
            convertedDegree = degree * 9/5 + 32;//convertedDegree의 값에 degree * 9/5 + 32의 값을 저장한다.(섭씨를 화씨로 변환하는 과정.)
            System.out.println("Fahrenheit temperature : " + Math.round(convertedDegree*10)/10.0);
            //Fahrenheit temperature : 와 Math.round(convertedDegree*10)/10.0의 값을 출력한다.
         }

    	else//모두 아니라면
    	 {
            System.out.println("Invalid value for sclae...");//Invalid value for sclae...를 출력한다.
    	 }
    }


    public double getF()//degree를 Fahrenheit 형태로 리턴해줄 메소드 getF를 정의한다.
    {
    	if(scale == 'F' || scale =='f')//만약 scale의 값이 F이거나 f이면  
        {
            return Math.round(degree*10)/10.0;//Math.round(degree*10)/10.0의 값을 리턴한다.
        }
    	else if(scale =='C' || scale == 'c')//만약 scale의 값이 C이거나 c이면
        {
            convertedDegree = degree * 9/5 + 32;//convertedDegree의 값에 degree * 9/5 + 32의 값을 저장한다.(섭씨를 화씨로 변환하는 과정.)
            return Math.round(convertedDegree*10)/10.0;//Math.round(convertedDegree*10)/10.0의 값을 리턴한다.
        }
    	else//모두 아니라면
    	{
            return Math.round(degree*10)/10.0;//Math.round(degree*10)/10.0의 값을 리턴한다.
            //scale의 값이 적법하지 않더라도 degree를 출력해야 하기 때문에.
        }
    }

    public void set(double degreeValue, char scaleValue)
    //받아온 온도의 값과 온도의 종류의 값을 저장해줄 메소드 set(double degreeValue, char scaleValue)을 정의한다.
    {
    	degree = degreeValue;//degree에 degreeValue의 값을 저장한다.
        scale = scaleValue;//scale에 scaleValue의 값을 저장한다.
    }

    public void set(double degreeValue)//받아온 온도의 값을 저장해줄 메소드 set(double degreeValue)을 정의한다.
    {
        degree = degreeValue;//degree에 degreeValue의 값을 저장한다.
    }

    public void set(char scaleValue)//받아온 온도의 종류를 저장해줄 메소드 set(char scaleValue)을 정의한다.
    {
        scale = scaleValue;//scale에 scaleValue의 값을 저장한다.
    }

    public boolean equals(Temperature compareDegree)//두 온도가 서로 같은지를 판별해줄 메소드 equals를 정의한다.
    {
        return (Math.round(this.getC()*10) == Math.round(compareDegree.getC()*10));
        //Math.round(this.getC()*10) == Math.round(compareDegree.getC()*10)이면 true 아니면 false를 리턴한다.
    }

    public boolean isGreaterThan(Temperature compareDegree)//온도가 비교할 온도의 값보다 큰지를 판별해줄 메소드 isGreaterThan을 정의한다.
    {
        return (Math.round(this.getC()*10) > Math.round(compareDegree.getC()*10));
        //Math.round(this.getC()*10) > Math.round(compareDegree.getC()*10)이면 true 아니면 false를 리턴한다.
    }
 
    public boolean isLessThan(Temperature compareDegree)//온도가 비교할 온도의 값보다 작은지를 판별해줄 메소드 isGreaterThan을 정의한다.
    {
        return (Math.round(this.getC()*10) < Math.round(compareDegree.getC()*10));
        //Math.round(this.getC()*10) < Math.round(compareDegree.getC()*10)이면 true 아니면 false를 리턴한다.
    }
}
 
