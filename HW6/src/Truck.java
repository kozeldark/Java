/**
 Program add truck's information based on the Vehicle class.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW6 Problem1
 Last changed: June 16, 2020.
 */

public class Truck extends Vehicle//클래스 Vehicle을 상속받은 클래스 Truck을 정의한다
{
    private double load;//톤 단위의 하중용량의 값을 저장해줄 double형 변수 load
    private double towing;//톤 단위의 견인용량의 값을 저장해줄 double형 변수 towing

    public Truck()//디폴트 생성자
    {
        super();//클래스 Vehicle의 디폴트 생성자 호출
        load = 0;//load의 값을 0으로 초기화
        towing = 0;//towing의 값을 0으로 초기화
    }

    public Truck(String aBrand)//트럭의 브랜드 문자열을 받는 생성자
    {
        super(aBrand);//클래스 Vehicle의 Vehicle(String aBrand) 생성자 호출
        load = 0;//load의 값을 0으로 초기화
        towing = 0;//towing의 값을 0으로 초기화
    }

    public Truck(String aBrand, int banger)//트럭의 브랜드 문자열과 사용년도를 받는 생성자
    {
        super(aBrand, banger);//
        load = 0;//load의 값을 0으로 초기화
        towing = 0;//towing의 값을 0으로 초기화
    }
        
    public Truck(Person theOwner)
    //트럭의 주인을 받는 생성자(클래스 Person의 객체 theOwner를 생성하고 레퍼런스를 복사하여 값을 전달)
    {
        super(theOwner);//Vehicle 클래스의 Vehicle(Person theOwner) 생성자 호출
        load = 0;//load의 값을 0으로 초기화
        towing = 0;//towing의 값을 0으로 초기화
    }

    public Truck(Person theOwner, int banger)
    //트럭의 주인과 사용년도를 받는 생성자(클래스 Person의 객체 theOwner를 생성하고 레퍼런스를 복사하여 값을 전달)
    {
        super(theOwner, banger);//Vehicle 클래스의 Vehicle(Person theOwner, int banger) 생성자 호출
        load = 0;//load의 값을 0으로 초기화
        towing = 0;//towing의 값을 0으로 초기화
    }

    public Truck(Person theOwner, String brand)
    //트럭의 주인과 트럭의 브랜드를 받는 생성자(트럭의 주인에 대한 값은 클래스 Person의 객체 theOwner를 생성하고 레퍼런스를 복사하여 값을 전달)
    {
        super(theOwner, brand);//Vehicle 클래스의Vehicle(Person theOwner, String brand) 생성자 호출
        load = 0;//load의 값을 0으로 초기화
        towing = 0;//towing의 값을 0으로 초기화
    }

    public Truck(Person theOwner, String brand, int banger)
    //트럭의 주인과 트럭의 브랜드와 사용년도를 받는 생성자(트럭의 주인에 대한 값은 클래스 Person의 객체 theOwner를 생성하고 레퍼런스를 복사하여 값을 전달)
    {
        super(theOwner, brand, banger);//Vehicle 클래스의 Vehicle(Person theOwner, String brand, int banger) 생성자 호출
        load = 0;//load의 값을 0으로 초기화
        towing = 0;//towing의 값을 0으로 초기화
    }

    public Truck(Person theOwner, String brand, int banger, double loadValue, double towingValue)
    //트럭의 주인과 트럭의 브랜드와 사용년도와 톤 단위의 하중 및 견인 용량을 받는 생성자(트럭의 주인에 대한 값은 클래스 Person의 객체 theOwner를 생성하고 레퍼런스를 복사하여 값을 전달)
    {
        super(theOwner, brand, banger);//Vehicle 클래스의 Vehicle(Person theOwner, int banger) 생성자 호출
        load = loadValue;//load에 loadValue의 값을 저장한다
        towing = towingValue;//towing에 towingValue의 값을 저장한다
    }

 
    @Override
    public void writeOutput()//트럭의 정보를 써 줄 메소드 writeOutput을 정의한다(오버라이딩)
    {
        super.writeOutput();//Vehicle 클래스의 writeOutput 메소드 실행
        System.out.println("The load capacity in : " + load + " tons.");//load의 값 출력
        System.out.println("Towing capacity in : " + towing + " tons.");//towing의 값 출력
    }
    
    public void writeLoad()//톤 단위의 하중용량의 값을 출력해줄 메소드 writeLoad
    {
    	System.out.println("The load capacity in : " + load + " tons.");//load의 값 출력
    }
    
    public void writeTowing()//톤 단위의 견인용량의 값을 출력해줄 메소드 writeLoad
    {
    	System.out.println("Towing capacity in : " + towing + " tons.");//towing의 값 출력
    }


    public void set(Person newOwner, String newBrand, int newCylinders, double newLoad, double newTowing)
    //트럭의 주인과 트럭의 브랜드와 사용년도와 톤 단위의 하중 및 견인 용량을 설정해줄 메소드 set을 정의한다
    {
        super.set(newOwner, newBrand, newCylinders);//Vehicle 클래스의 newOwner, newBrand, newCylinders 값에 대한 set 메소드 실행
        load = newLoad;//load에 newLoad의 값을 저장한다
        towing = newTowing;//towing에 newTowing의 값을 저장한다
    }

    public void setLoad(double newLoad)//톤 단위의 하중용량의 값을 설정해줄 메소드 setLoad
    {
        load = newLoad;//load에 newLoad의 값을 저장한다
    }

    public void setTowing(double newTowing)//톤 단위의 견인용량의 값을 설정해줄 메소드 setLoad
    {
        towing = newTowing;//towing에 newTowing의 값을 저장한다
    }
    

    
    public double getLoad()//톤 단위의 하중용량의 값을 리턴해줄 메소드 getLoad
    {
        return load;//load의 값을 리턴한다
    }
    
    public double getTowing()//톤 단위의 견인용량의 값을 리턴해줄 메소드 getTowing
    {
        return towing;//towing의 값을 리턴한다
    }

    
    public boolean equals(Truck otherTruck)//다른 트럭 정보와 같은지를 판별해줄 메소드 equals를 정의한다
    //(비교할 트럭의 대한 값들은 클래스 Truck의 객체 otherTruck를 생성하고 레퍼런스를 복사하여 값을 전달)
    {
        return (super.equals(otherTruck)
                    && this.load == otherTruck.getLoad() && this.towing == otherTruck.getTowing());
      //Vehicle 클래스의 otherTruck 값에 대한 equals 메소드를 실행하고 그 equals 메소드가 true를 리턴하고
      //otherTruck 객체의 load의 값이 현재 객체의 load의 값과 같고
      //otherTruck 객체의 towing의 값이 현재 객체의 towing의 값과 같으면 true를 리턴 셋 중 하나라도 false면 false를 리턴한다
   
    }
}