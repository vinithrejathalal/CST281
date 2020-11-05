class Rational
{
    int numerator;
    int denominator;
    Rational(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    void Print()
    {
        System.out.println(numerator+"/"+denominator);
    }

}

class Swapper
{
    void swap(int x, int y)
    {
        int temp;
        temp = x;
        x = y;
        y = temp;
    }
    void swap(Rational r1, Rational r2)
    {
        int temp_numerator = r1.numerator;
        int temp_denominator = r1.denominator;
        r1.numerator = r2.numerator;
        r1.denominator = r2.denominator;
        r2.numerator = temp_numerator;
        r2.denominator = temp_denominator;
    }
}


public class ObjectReference {
    public static void main(String [] args)
    {
        Swapper s = new Swapper();
        Rational t1 = new Rational(1,2);
        Rational t2 = new Rational(4,5);
        int n1 = 10;
        int n2 = 20;
        System.out.println("================PRIMITIVE TYPES=======================");
        System.out.println("Before Swap");
        System.out.println("n1 : "+n1+" n2 : "+n2);
        s.swap(n1,n2);
        System.out.println("After Swap");
        System.out.println("n1 : "+n1+" n2 : "+n2);
        System.out.println("================OBJECT REFERENCES=======================");
        System.out.println("Before Swap");
        System.out.print("t1 : ");
        t1.Print();
        System.out.print("t2 : ");
        t2.Print();
        s.swap(t1,t2);
        System.out.println("After Swap");
        System.out.print("t1 : ");
        t1.Print();
        System.out.print("t2 : ");
        t2.Print();
    }
}

/*
Explanation of the output observed:
--------------------------------------
You should have observed that when we tried to swap two integers using swapper it did not materialize,
whereas when two rational number objects were passed it resulting swapping of the numerators and
denominators. Now let us try to understand what is happening here.

First you should remind yourself of the fact that a variable is actually a handle to a memory location.
For instance int x = 10; implies there is a memory location which houses a value 10 and you can access it
using the variable name x. In java when you call a method with x as the input argument, what happens is that
the value referred to by the variable is copied to the formal argument say y, in the method definition.
It should be noted that while y and x have the same value they are different in that they occupy different
memory locations.   THIS IS CALLED CALL BY VALUE.

Now let us come to case of swapping the integers: here the value of n1 gets copied to the location referred
to by x. Similarly value of n2 gets copied to the memory location referred to by y. (but n1 is not same as
x, and n2 is not same as y). Inside the function a swapping happens between the values referred to by x
and y. But since they are not same as n1 and n2 the change does not reflect in the values of n1 and n2.

But why then a swapping happens in the case of rationals.... Let us look into it. Here the actual arguments
are objects of class instances. They are references the memory location where the object is stored. For
instance, when r is created using Rational r = new Rational(5,6);, r is variable with a location say P.
At P what is stored is the address of the new object created. (That is the value referred to by r is
another address). It is the addresses referred to by t1 and t2 that are copied to the formal arguments
r1 and r2. Though r1 and t1 are different, they point to the same object and hence r1.numerator and t1.numerator
are the same. Similar is the case with r1.denominator and t1.denominator. The same thing applies to r2 and t2
This is the reason why we observing swapping in the case of rationals.

 */