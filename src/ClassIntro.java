/*
In this file see the syntax of defining a class.
Also see how an object (instance) of the class is created
Moreover you can see how the variables and methods are accessed from
object variable using . operator
 */


class Student
{
    //state
    int age;
    String name;
    //behavior
    void AboutMe()
    {
        System.out.println("My name is "+name );
        System.out.println("I am "+age+" years");
    }
}
/*
The variables in the class form what we call the state of the class and the methods form the behavior
of the class. Bringing together the data (variables) and methods that act on them together is called
ENCAPSULATION
 */


public class ClassIntro {
    public static void main(String [] args)
    {
        Student s = new Student();//this is how you create an object
        s.age = 20; //setting the variables
        s.name = "Ajay";//setting the variables
        s.AboutMe();//call a method
    }

}
