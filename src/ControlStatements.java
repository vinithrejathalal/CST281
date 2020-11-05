public class ControlStatements {
    public static void main(String[] args)
    {
        //--------------------------------------------------------
        //if and if else
        /*
          Syntax:
            if (condition which evaluates to true or false)
            {
            if block of statements
            }
            else
            {
            else block
            }
         */

        if (1 < 2)
        {
            System.out.println("One is less than two");
        }
        //if else
        int x = 10;
        int y = 20;
        if (x > y)
        {
            System.out.println("x is larger");
        }
        else {
            System.out.println("y is larger");
        }
        //-------------------------------------------------------------------
        //Loops
        /*
        for loops
        Syntax :
            for(datatype var = initial_value; condition ; update_var)
            {
              for block
            }
            initially var has initial_value. condition is checked if true then for block is executed
            then var is updated using the expression update_var. then condition is again checked.
         */
        //initilization;condition;update
        for( int i=0;  i<5;  i++)
        {
            //for block
            System.out.println("Hello");
        }
        //initilization;condition;update
        for(int i=10;  i>5;  i--)
        {
            //for block
            System.out.println("Hai");
        }
        for(double t = 1.1; t<2; t=t*t)
        {
            System.out.println("t : "+t);
        }

        //while loop
        /*
        Syntax:
          while(boolean condition)
          {
             while block
          }
         */
        int counter = 10;
        while(counter > 0)
        {
            System.out.println("The counter is decrementing to 0");
            counter = counter - 2; //without this it will be an infinite loop
        }
    }

}
