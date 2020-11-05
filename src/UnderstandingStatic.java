class Worker
{
    static int numWorkers;//static variable
    String name;

    Worker(String name)
    {
        ++numWorkers;//increment the count every time a worker is created
        this.name = name;
    }

}


public class UnderstandingStatic {
    public static void main(String [] args)
    {
        Worker.numWorkers = 0;//initializing the static variable
        Worker w1 = new Worker("Ajay");
        Worker w2 = new Worker("Anand");
        Worker w3 = new Worker("Priya");
        System.out.println("The number of workers created is : "+w1.numWorkers);
        System.out.println("The number of workers created is : "+w2.numWorkers);
        System.out.println("The number of workers created is : "+w3.numWorkers);
        System.out.println("The number of workers created is : "+Worker.numWorkers);
    }
}

/*
=======================STATIC VARIABLE===================================
  We want to have a variable in Worker that shows the number of instances (workers) created.
  Since it should reflect the number of objects created by the program it cannot be
  the property of each instance. It should be globally applicable. That is, all the instances
  should share the same copy of the variable.

  Such a variable can be created using the static key word. It is common to all the objects of the
  class. Here in the code every time a worker is created the variable numWorkers is incremented.
  Initially the variable is set to zero in line 17. Note that no object is created to access the
  variable and make it 0. This is possible because static variables are global. Every instance shares
  the same variable.

  That is why the output is 3 for all the print statements.


 */
