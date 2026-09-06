class Student
{
    private String name;
    private int marks;

    Student (String name  )
    {
        this.name = name;
    }

    public void display_name()
    {
        System.out.println("Student name : " + name);
    }
    public  void set_marks(int marks)
    {
        if (marks >=0 && marks <=100)
        {
            this.marks = marks;
        }
    }

    public int get_marks()
    {
        return marks;
    }


}

public class encapsulation1
{
    public static void main(String[] args) {
        Student s1 = new Student("Vaibhav");
        s1.display_name();
        s1.set_marks(78);
        s1.get_marks();
    }
}