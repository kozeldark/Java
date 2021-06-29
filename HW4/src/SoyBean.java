public class SoyBean

{

    private static int numBeans = 0;

    private int myID;

 

    SoyBean()

    {

        myID = numBeans;

        numBeans++;

    }

    public int id() {return myID;}

 

public static void main(String[] args) {

        SoyBean b0 = new SoyBean();

        SoyBean b1 = b0;

        SoyBean b2 = new SoyBean();

        System.out.println("beans:" + b0.id() + "," + b1.id() +","+ b2.id()); 

}
}