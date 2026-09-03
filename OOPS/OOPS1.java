class Student{
String name = "Vaibhav";
int percentage = 78;

void display() {
    System.out.println("Name: " + name);
    System.out.println("Percentage: " + percentage);
}
}
class College extends Student{
    void show()
    {
        System.out.println("Student is now in College");
    }
}

public class OOPS1{
    public static void main(String[] args) {
        College c = new College();
        c.show();
        c.display();
    }
}

