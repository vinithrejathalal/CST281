/*
Just as constructors are overloaded, any method can be overloaded too.
You can use the same method name with different types and number of arguments.
At the time of invocation, compiler compares the arguments list and calls the function with
the best match.

Below we have a Greeter class that is used to print a message to the user. Message is printed
through the function greet. Three different version of the same method can be seen in the class

This is a special case of an important concept in Object Oriented Programming called POLYMORPHISM
(A method taking different forms). We will see this in more detail later.
 */


class Greeter
{
    String message;

    Greeter()
    {
        message = "Hello Good Morning";
    }
    //Version 1 : Prints the default message
    void greet()
    {
        System.out.println(message);

    }

    //Version 2 : Prints a user provided message
    void greet(String newmessage)
    {
        System.out.println(newmessage);
    }

    //Version 3 : Prints the user provided message numOfTimes times
    void greet(String newmessage, int numOfTimes)
    {
        for (int i=0; i<numOfTimes; i++)
        {
            System.out.println(newmessage);
        }
    }



}




public class MethodOverloading {
    public static void main(String [] args)
    {
        Greeter g = new Greeter();
        System.out.println("---------Version 1-------------");
        g.greet();
        System.out.println("---------Version 2-------------");
        g.greet("Hai, Wish You Great Day ");
        System.out.println("---------Version 3-------------");
        g.greet("Hai, All Wish You All Success ",3);


    }

}
