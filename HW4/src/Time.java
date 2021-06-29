/**
 Program output time to 12-hour system and 24-hour system.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW4 Problem2
 Last changed: May 16, 2020.
 */

public class Time//시간을 받아와 출력해줄 클래스 Time을 정의한다.
{
    private int hour;//시의 값을 저장할 변수 hour를  선언한다.
    private int minute;//분의 값을 저장할 변수 minute을 선언한다.
    
    public Time()//아무것도 받지 않는 생성자 Time()을 정의한다.
    {
        hour = 0;//hour에 0을 저장한다.
        minute = 0;//minute에 0을 저장한다.
    }
    
    private boolean isValid(int hourValue, int minuteValue)//시와 분의 값이 적절한지를 판별해줄 메소드 isValid를 정의한다.
    {
        return (hourValue>=0 && hourValue<=23) && (minuteValue>=0 && minuteValue<=59);
        //hourValue가 0이상 23이하이고 minuteValue가 0이상 59이하이면 true 아니면 false를 리턴한다.
    }
    
    
    public void setTime(int hourValue, int minuteValue)
    //시와 분의 값을 판별 후 저장해줄 메소드 setTime(int hourValue, int minuteValue)을 정의한다.
    {
        if(isValid(hourValue, minuteValue))//만약 isValid(hourValue, minuteValue)가 true이면
        {
            hour = hourValue;//hour에 hourValue의 값을 저장한다.
            minute = minuteValue;//minute에 minuteValue의 값을 저장한다.
        }
    }
    
    public void setTime(int hourValue, int minuteValue, boolean isAM)//시와 분의 값을 받고 AM기준인지를 판별하여
    {
        if(hourValue >= 1 && hourValue <= 12)//만약 hourValue가 1 이상이고 12 이하이면
        {
            if(hourValue < 12 && !isAM)//만약 hourValue가 12 미만이고 isAM이 false이면
            {
            	hourValue = hourValue + 12;//hourValue에 hourValue + 12의 값을 저장한다.
            }
            else if (hourValue == 12 && isAM)//만약 hourValue가 12이고 isAM이 true이면(윗 if문은 false라는 전제하에)
            {
                hourValue = 0;//hourValue에 0의 값을 저장한다.
            }           
            if(isValid(hourValue, minuteValue))//만약 isValid(hourValue, minuteValue)가 true이면
            {
                hour = hourValue;//hour에 hourValue의 값을 저장한다.
                minute = minuteValue;//minute에 minuteValue의 값을 저장한다.
            }
        }
    }
    
    public Time(int hourValue, int minuteValue)//시와 분의 값을 받아 저장해줄 생성자 Time(int hourValue, int minuteValue)을 정의한다.
    {
    	if(isValid(hourValue, minuteValue))//만약 isValid(hourValue, minuteValue)가 true이면
        {
            hour = hourValue;//hour에 hourValue의 값을 저장한다.
            minute = minuteValue;//minute에 minuteValue의 값을 저장한다.
        }
    }
    
    public Time(int hourValue, int minuteValue, boolean isAM)
    {
    	if(hourValue >= 1 && hourValue <= 12)//만약 hourValue가 1 이상이고 12 이하이면
        {
            if(hourValue < 12 && !isAM)//만약 hourValue가 12 미만이고 isAM이 false이면
            {
            	hourValue = hourValue + 12;//hourValue에 hourValue + 12의 값을 저장한다.
            }
            else if (hourValue == 12 && isAM)//만약 hourValue가 12이고 isAM이 true이면(윗 if문은 false라는 전제하에)
            {
                hourValue = 0;//hourValue에 0의 값을 저장한다.
            }           
            
            if(isValid(hourValue, minuteValue))//만약 isValid(hourValue, minuteValue)가 true이면
            {
                hour = hourValue;//hour에 hourValue의 값을 저장한다.
                minute = minuteValue;//minute에 minuteValue의 값을 저장한다.
            }
        }
    }
      
    public String getTime24()//시간을 24시간제로 리턴해줄 메소드 getTime24를 정의한다.
    {
        String timeValue = "";//24시간제로 바꾼 시간을 저장해줄 String변수 timeValue를 선언한다.
        
        if(hour < 10)//만약 hour가 10 미만이면(시가 한자리수면)
        {
            timeValue = "0" + hour;//timeValue에 0과 hour의 값을 저장한다. 
        }
        else//아니라면
        {
        	timeValue = Integer.toString(hour);//timeValue에 hour를 String형으로 변환한 값을 저장한다.
        }
        
        if(minute < 10)//만약 minute이 10 미만이면(분이 한자리수면)
        {
            timeValue = timeValue + "0" + minute;//timeValue에 timeValue(먼저 들어있던 시)와 0과 minute의 값을 저장한다.
        }
        else//아니라면
        {
            timeValue = timeValue + minute;//timeValue에 timeValue(먼저 들어있던 시)와  minute의 값을 저장한다.
        }
        
        return timeValue;//timeValue를 리턴한다.
    }
    
    public String getTime12()//시간을 12시간제로 리턴해줄 메소드 getTime24를 정의한다.
    {
        String timeValue = "";//12시간제로 바꾼 시간을 저장해줄 String변수 timeValue를 선언한다.
        
        if(hour > 12)//만약 hour의 값이 12 초과라면
        {
            timeValue = Integer.toString(hour - 12);//timeValue에 hour -12를 String형으로 변환한 값을 저장한다.
        }
        else if(hour == 0)//만약 hour의 값이 0이라면(윗 if문은 false라는 전제하에)
        {
            timeValue = "12";//timeValue에 12를 저장한다.
        }       
        else//아니라면
        {
            timeValue = Integer.toString(hour);//timeValue에 hour를 String형으로 변환한 값을 저장한다.
        }
              
        if(minute < 10)//만약 minute의 값이 10 미만이라면(분이 한자리수면)
        {
            timeValue = timeValue + ":0" + minute;//timeValue에 timeValue(먼저 들어있던 시)와 :0과 minute의 값을 저장한다.
        }
        else//아니라면
        {
            timeValue = timeValue + ":" + minute;//timeValue에 timeValue(먼저 들어있던 시)와 :와  minute의 값을 저장한다.
        }
        
        if(hour >= 0 && hour < 12)//만약 hour의 값이 0이상 12미만이라면
        {
            timeValue = timeValue + "am";//timeValue에 timeValue(먼저 들어있던 시와 분)와 am을 저장한다.
        }
        else
        {
            timeValue = timeValue + "pm";//timeValue에 timeValue(먼저 들어있던 시와 분)와 pm을 저장한다.
        }
        
        return timeValue;//timeValue를 리턴한다.
    }
    
    public static void main(String[] args) {
    	 Time time1 = new Time();
    	 System.out.println("Create a default time");
    	 System.out.println("\t should be 0, 0: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 //time1을 "Hour : " + time1.hour + " Minute : " + time1.minute로 변경하였습니다. 아래 모두 같습니다.
    	 System.out.println("Set the time to 12, 12");
    	 time1.setTime(12, 12); 
    	 System.out.println("\t should be 12, 12: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to -1, 12");
    	 time1.setTime(-1, 12);
    	 System.out.println("\t should be 12, 12: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to 12, -1");
    	 time1.setTime(12, -1);
    	 System.out.println("\t should be 12, 12: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to 24, 12");
    	 time1.setTime(24, 12);
    	 System.out.println("\t should be 12, 12: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to 12, 60");
    	 time1.setTime(12, 60);
    	 System.out.println("\t should be 12, 12: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Set the time to 8, 16 am");
    	 time1.setTime(8, 16, true);
    	 System.out.println("\t should be 8, 16: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Set the time to 8, 16 pm");
    	 time1.setTime(8, 16, false);
    	 System.out.println("\t should be 20, 16: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to 0, 17 am");
    	 time1.setTime(0, 17, true);
    	 System.out.println("\t should be 20, 16: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to 13, 17 am");
    	//원래는 Trying to set time to 12, 17 am 이지만 13으로 변경하였습니다.
    	 time1.setTime(13, 17, true);
    	 System.out.println("\t should be 20, 16: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to 0, 17 pm");
    	 time1.setTime(0, 17, false);
    	 System.out.println("\t should be 20, 16: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Trying to set time to 13, 17 pm");
    	 //원래는 Trying to set time to 12, 17 pm 이지만 13으로 변경하였습니다.
    	 time1.setTime(13, 17, false);
    	 System.out.println("\t should be 20, 16: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Set the time to 12, 19 am");
    	 time1.setTime(12, 19, true);
    	 System.out.println("\t should be 0, 19: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("Set the time to 12, 19 pm");
    	 time1.setTime(12, 19, false);
    	 System.out.println("\t should be 12, 19: " + "Hour : " + time1.hour + " Minute : " + time1.minute);
    	 System.out.println("\nTesting the constructors");
    	 System.out.println("Create the time 12, 19");
    	 Time time2 = new Time(12, 19);
    	 System.out.println("\t should be 12:19pm: " + time2.getTime24() + " and " + time2.getTime12());
    	 System.out.println("Create the time 12, 19 with the other constructor");
    	 time2 = new Time(12, 19, false);
    	 System.out.println("\t should be 12:19pm: " + time2.getTime24() + " and " + time2.getTime12());
    	 System.out.println("Create the time 0, 19");
    	 time2 = new Time(0, 19);
    	 System.out.println("\t should be 12:19am: " + time2.getTime24() + " and " + time2.getTime12()); 
    	 System.out.println("Create the time 12, 19 with the other constructor");
    	 time2 = new Time(12, 19, true);
    	 System.out.println("\t should be 12:19am: " + time2.getTime24() + " and " + time2.getTime12());
    	 //원래는 should be 12:19pm 이였지만 am으로 변경하였습니다. 
    	 System.out.println("Create the time 3, 19");
    	 time2 = new Time(3, 19);
    	 System.out.println("\t should be 3:19am: " + time2.getTime24() + " and " + time2.getTime12());
    	 System.out.println("Create the time 3, 19 with the other constructor");
    	 time2 = new Time(3, 19, true);
    	 System.out.println("\t should be 3:19am: " + time2.getTime24() + " and " + time2.getTime12());
    	 System.out.println("Create the time 15, 19");
    	 time2 = new Time(15, 19);
    	 System.out.println("\t should be 3:19pm: " + time2.getTime24() + " and " + time2.getTime12());
    	 System.out.println("Create the time 3, 19 with the other constructor");
    	 time2 = new Time(3, 19, false);
    	 System.out.println("\t should be 3:19pm: " + time2.getTime24() + " and " + time2.getTime12());

    	 } 
}
