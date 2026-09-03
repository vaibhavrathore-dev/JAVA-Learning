import java.util.Scanner;

public class checkpoint2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float greatest = 0;
        float smallest = 0;

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Marks of Physics: ");
        float phy = sc.nextFloat();
        System.out.println("Enter Your Marks of Chemistry: ");
        float chem = sc.nextFloat();
        System.out.println("Enter Your Marks of Mathematics: ");
        float maths = sc.nextFloat();
        System.out.println("Enter Your Marks of OOPS: ");
        float oops = sc.nextFloat();
        System.out.println("Enter Your Marks of ETCS: ");
        float etcs = sc.nextFloat();

        float total = phy + chem + maths + oops + etcs;
        float percentage = (total /500) * 100 ;
        float average = total / 500;
        float marks [] = {phy , chem ,maths ,oops ,etcs};
        for (int i = 0 ; i < marks.length;i++)
        {
            if (marks[0] < marks[i])
            {
                greatest = marks[i];
                i++;

            }
            else
            {
                greatest = marks[0];
            }
        }
        for (int i = 0 ; i < marks.length;i++)
        {
            if (marks[0] > marks[i])
            {
                smallest = marks[i];
                i++;

            }
            else
            {
                smallest = marks[0];
            }
        }





    }
}