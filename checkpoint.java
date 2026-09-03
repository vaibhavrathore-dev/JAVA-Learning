import java.util.Scanner;

public class checkpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1=0 ;
        int count2=0;
        int count3=0;

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for(int i = 1 ; i <=n ; i++)
        {
            if(i % 5 == 0 && i % 3 == 0 )
            {
                System.out.print("Fizz" + " " + "Buzz" + " " + i);
                count2 ++ ;
            }
            else if(i % 3 == 0)
            {
                System.out.print("Fizz" + " " + i);
                count1 ++;
            }
            else if(i % 5 == 0)
            {
                System.out.print("Buzz" + " " + i);
                count3 ++;
            }
            else
            {
                System.out.print(i);
            }
        }
           System.out.println("\n--- Final Counts ---");
        System.out.println("Divided by 3 & 5 (FizzBuzz): " + count2);
        System.out.println("Divided by 3 only (Fizz): " + count1);
        System.out.println("Divided by 5 only (Buzz): " + count3);

        sc.close();
        
        
    }
    
}
