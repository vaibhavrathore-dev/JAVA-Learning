abstract class Employee{
    String name;
    double salary;
    
    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    abstract void work();
    
    void display (){
        System.out.println( name + " " + salary);
    }

}

class Teacher extends Employee {
    @Override
    void work()
    {
        System.out.println("Teacher is Teaching");
    }

    Teacher(String name , double salary){
        super(name, salary);
    }
}

class Developer extends Employee {
    @Override
    void work()
    {
        System.out.println("Teacher is Teaching");
    }

    Developer(String name , double salary){
        super(name, salary);
    }
}




public class OOPS2 {
    public static void main(String[] args) {
        Employee e1 = new Developer("Naruto" , 89000);
        Employee e2 = new Teacher("Vaibhav" , 90000);
        e1.work();
        e1.display();
        e2.work();
        e2.display();
    }
    
}
