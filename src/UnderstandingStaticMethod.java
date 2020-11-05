class Machine
{
    private static int numOfMachines;
    String name;
    //Below is a static block
    //It is executed exclusively when the class is loaded (not when an object (instance) is created)
    static
    {
        numOfMachines = 0;
        System.out.println("Number of Machines set to "+numOfMachines+" in the Static Block");

    }
    Machine(String name)
    {
        this.name = name;
        ++numOfMachines;
    }

    static int getNumOfMachines()//static method
    {
        return numOfMachines;
        //System.out.println(name); This is illegal since the static method accesses a non-static variable name
    }



}


public class UnderstandingStaticMethod {
    public static void main(String [] args)
    {
        //Machine.numOfMachines = 0; //Illegal since numOfMachines is a private variable.
        Machine m1 = new Machine("Lathe");
        Machine m2 = new Machine("3D Printer");
        Machine m3 = new Machine("Grinder");
        System.out.println("The number of machines is : "+Machine.getNumOfMachines());
        //System.out.println("The number of machines is : "+Machine.numberOfMachines); Illegal because it
                                                                              // is a private variable

    }

}

/*
=====================================STATIC METHODS=======================================
  Methods can also be declared static. Static methods can also be accessed just like static variable
  using class name. But since a static method can be called before an object is created it can access
  only static variables of the class. More it does not have "this" reference(Since there is no object
  to refer to).
=====================================STATIC BLOCKS========================================
A static block is executed when the class is first loaded. It is used to initialize all static
variables in the class. Note that in the program static block is executed only once in spite of
three objects having been created.

 */
