/* Inner class is a non-static class defined within another class.
   Inner class can access all the variables of the outer class just as any method of
   the outer class can.

   For instance in the code below we create a student database class which stores marks, names and
   roll numbers of students. The arrays studentMarks, studentNames and rollNos are part of the outer
   class. But they are populated by creating a Reader that reads from the console. Reader as you can
   see is an inner class. In constructor of the outer class the a Reader instance is created and is
   used to populate the arrays from the console input. Note that it can access all the variable
   belonging to the outer class and able to populate them.
 */
import java.util.Scanner;

class StudentDB
{
    private double [] studentMarks;
    private String [] studentNames;
    private String [] rollNos;
    //Inner class
    class Reader
    {
       void readData()
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the class Strength");
           int numStudents = in.nextInt();
           studentMarks  = new double[numStudents];
           studentNames = new String[numStudents];
           rollNos = new String[numStudents];
           for(int i=0; i<numStudents; i++)
           {
               in.nextLine();
               System.out.print("Student's Name : ");
               studentNames[i] = in.nextLine();
               System.out.println("Roll Number :");
               rollNos[i] = in.nextLine();
               System.out.println("Mark :");
               studentMarks[i] = in.nextDouble();
           }

       }


    }

    StudentDB()
    {
        Reader rin = new Reader();
        rin.readData();
    }

    void PrintDB()
    {
        int numStudents = rollNos.length;
        System.out.println("Name       RollNo      Marks");
        for (int indx = 0; indx<numStudents; indx++)
        {
            System.out.println(studentNames[indx]+"  "+rollNos[indx]+"  "+ studentMarks[indx]);
        }
    }

}



public class InnerClasses {
    public static void main(String [] args)
    {
        StudentDB stdb = new StudentDB();
        stdb.PrintDB();

    }

}
