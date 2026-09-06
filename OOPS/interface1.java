interface Payment
{
    void payments();
}

class UPI implements Payment
{
    public void payments()
    {
        System.out.println("Paid Rs.500 using UPI");
    }
}

class Credit_Card implements Payment
{
    public  void payments()
    {
        System.out.println("Paid Rs.1500 using UPI");
    }
}

public class interface1
{
     public static void main(String[] var0)
     {
        Payment c1 = new UPI();
        Payment c2 = new Credit_Card();
        c1.payments();
        c2.payments();


     }
}