/*
- Constructor is a special method in a class.
- It is the method that is implicitly called by the compiler when an object is created.
- Constructor methods have the same name as the class
- It is not mandatory that you define a constructor for a class. If the constructor is not defined,
  then the compiler will supply the class with one. This constructor called default constructor is used
  creating objects.
- If there is at least one user  defined constructor, the compiler will not create the default constructor.
- You can define multiple constructors by changing the number and type of input arguments.This is called
    CONSTRUCTOR OVERLOADING
 */

class Employee
{
    int age;
    String name;
    String employeeCode;
    String organization;
     //CONSTRUCTOR - 1
    //Constructor without arguments
    Employee()
    {
        System.out.println("In constructor 1");
        age = -1;
        name = "unknown";
        employeeCode = "unknown";
        organization = "unknown";
    }
    //CONSTRUCTOR - 2
    //Constructor with arguments
    Employee(int age, String name, String organization)
    {
        System.out.println("In constructor 2");
        this.age = age;
        this.name = name;
        this.employeeCode = "not yet assigned";
        this.organization = organization;
    }
    //CONSTRUCTOR - 3
    //another constructor with a different set of arguments
    Employee(int age, String name, String organization, String employeeCode)
    {
        System.out.println("In constructor 3");
        this.age = age;
        this.name = name;
        this.employeeCode = employeeCode;
        this.organization = organization;
    }
    void AboutMe()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Code :"+employeeCode);
        System.out.println("Organization :"+organization);
    }





}

//OBSERVE CONSTRUCTOR OVERLOADING IN THE ABOVE CLASS

public class Constructor {
    public static void main(String[] args)
    {
        Employee e1 = new Employee();//Using constructor - 1
        Employee e2 = new Employee(30,"Aravind","Infosys");//Using constructor -2
        Employee e3 = new Employee(32,"Binoy","TCS","TCS234");//Using constructor -3
        System.out.println("------------------------------------------");
        e3.AboutMe();
        System.out.println("------------------------------------------");
        e2.AboutMe();
        System.out.println("------------------------------------------");
        e1.AboutMe();
    }
}
