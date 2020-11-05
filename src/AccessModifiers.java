/*
Here we will see two access modifiers:
   public and private
   - if a variable is declared as public it can be directly using an object instance using the dot operator
     anywhere in the code.
   - if a variable is declared as private then the variable can be accessed only by other member methods
    of the same class
 */


class Individual {
    public String name;
    public int age;
    private int lockerNumber;//can be accessed only by other methods of the same class
    Individual(String name, int age, int lockerNumber)
    {
        this.name = name;
        this.age = age;
        this.lockerNumber = lockerNumber;//legal since the constructor is a method of the same class
    }

    void changeLockerNumber(int newlockerNumber)
    {
        this.lockerNumber = newlockerNumber; //this is valid
    }


}

public class AccessModifiers {
    public static void main(String [] args)
    {
        Individual p = new Individual("Aneesh", 40, 434234);
        System.out.println("Name : "+p.name);//legal since name is public
        System.out.println("Age : "+p.age); //legal since name is public
        //System.out.println("Locker Number  :"+p.lockerNumber); //This is illegal since lockerNumber is
                                                                 //accessed outside the class using an
                                                                 // instance p.
    }
}
