/**
 Program create a person and save the name and age.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW4 Problem3
 Last changed: May 17, 2020.
 */

public class Person//사람의 정보를 입력해줄 클래스 Person을 정의한다. 
{
    private String name;//사람의 이름을 저장해줄 String 변수 name을 선언한다.
    private int age;//사람의 나이를 저장해줄 int 변수 age를 선언한다.
    
    public Person()//아무것도 받지 않는 생성자 Person()을 정의한다.
    {
        name = "No name yet";//name에 No name yet이라는 값을 저장한다.
        age = 0;//age에 0을 저장한다.
    }
    
    public Person(String nameValue, int ageValue)
    //사람의 이름과  나이의 값을 받아 저장할 생성자 Person(String nameValue, int ageValue)를 정의한다.
    {
        name = nameValue;//name에 nameValue의 값을 저장한다.
        age = ageValue;//age에 ageValue의 값을 저장한다.
    }
    
    public String getName()//name의 값을 리턴해줄 메소드 getName을 정의한다.
    {
        return name;//name을 리턴한다.
    }
    
    public int getAge()//age의 값을 리턴해줄 메소드 getAge를 정의한다.
    {
        return age;//age를 정의한다.
    }
    
    public void setName(String first, String last)//사람의 성씨와 이름을 한 문장으로 합쳐 저장해줄 메소드 setName(String first, String last)을 정의한다.
    {
        name = first + " " + last;//name에 first의 값과 공백과 last의 값을 저장한다.
    }
    
    public void setName(String nameValue)//사람의 이름을 저장해줄 메소드 setName(String nameValue)을 저장한다.
    {
        name = nameValue;//name에 nameValue의 값을 저장한다.
    }
    
    public void setAge(int ageValue)//사람의 나이를 저장해줄 메소드 setAge를 저장한다.
    {
        age = ageValue;//age에 ageValue의 값을 저장한다.
    }
    
    public static Person createAdult()//일반적인 성인의 정보를 생산해줄 static 메소드 createAdult를 정의한다.
    {
        Person human = new Person("An Adult", 21);
        //new 연산자를 통해 Person 클래스의  인스턴스 human을 생성한다(생성자 Person(String nameValue, int ageValue) 기반)
        //이름은 An Adult, 나이는 21로 설정한다.
        return human;//인스턴스 human을 리턴한다.
    }
    
    public static Person createToddler()//일반적인 갓난아기의 정보를 생산해줄 static 메소드 createToddler를 정의한다.
    {
        Person human = new Person("A toddler", 2);
        //new 연산자를 통해 Person 클래스의  인스턴스 human을 생성한다(생성자 Person(String nameValue, int ageValue) 기반)
        //이름은 A toddler, 나이는 2로 설정한다.
        return human;//인스턴스 human을 리턴한다.
    }
    
    public static Person createPreschooler()//일반적인 미취학 아동의 정보를 생산해줄 static 메소드 createPreschooler를 정의한다.
    {
        Person human = new Person("A preschooler", 5);
        //new 연산자를 통해 Person 클래스의  인스턴스 human을 생성한다(생성자 Person(String nameValue, int ageValue) 기반)
        //이름은 A preschooler, 나이는 5로 설정한다.
        return human;//인스턴스 human을 리턴한다.
    }


    public static Person createAdolescent()//일반적인 갓난아기의 정보를 생산해줄 static 메소드 createToddler를 정의한다.
    {
        Person human = new Person("An Adolescent", 9);
        //new 연산자를 통해 Person 클래스의  인스턴스 human을 생성한다(생성자 Person(String nameValue, int ageValue) 기반)
        //이름은 A Adolescent, 나이는 9로 설정한다.
        return human;//인스턴스 human을 리턴한다.
    }
    
    public static Person createTeenager()//일반적인 갓난아기의 정보를 생산해줄 static 메소드 createToddler를 정의한다.
    {
        Person human = new Person("A Teenager", 15);
        //new 연산자를 통해 Person 클래스의  인스턴스 human을 생성한다(생성자 Person(String nameValue, int ageValue) 기반)
        //이름은 A Teenager, 나이는 15로 설정한다.
        return human;//인스턴스 human을 리턴한다.
    }
              

    public static void main(String[] args) {
    	 Person y = new Person();
    	 System.out.println("Testing the default constructor");
    	 System.out.println("Oject has name " + y.getName() + " and age " + y.getAge());
    	 System.out.println("\nCreating each of the specialized instances");
    	 Person x;
    	 x = Person.createToddler();
    	 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
    	 x = Person.createPreschooler();
    	 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge()); 
    	 x = Person.createAdolescent();
    	 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
    	 x = Person.createTeenager();
    	 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
    	 x = Person.createAdult();
    	 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
    	 System.out.println("\nTesting set - Name should be Bobby with age 10");
    	 x.setName("Bobby");
    	 x.setAge(10);
    	 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
    	 System.out.println("\nTesting the alternate set method - name change to Jane Doe");
    	 x.setName("Jane", "Doe");
    	 x.setAge(10);
    	 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
    	 }
}