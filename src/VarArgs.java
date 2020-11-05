/*
Typically the number of input arguments of a method is fixed (as we have seen in all the cases till now)
But there may be cases where we do not know the number of arguments in advance. This situation is
handled in Java using varargs.
if a method arg is preceded by ... (three periods) then the variable can capture variable number of arguments of
the datatype specified in the declaration.

See the computeRunAvg method of the RunningAverage class below the variable can take any number of arguments of
type double as shown in the method calls in main. v is interpreted as an and array of type double whose length and
content are decided at run time. all array operations are possible on v.


If a method has any argument other than vararg then, they should all precede the vararg in the method declaration.
as in the method


!!!!!! WARNING USING VARARGS
Varargs if not carefully used can lead to ambiguity which compiler cannot resolve. Consider the cases below:
   CASE 1: suppose there is a method
                  void func(int ...v)
                  {
                   ------
                   ------
                  }
         which is overloaded as :
                  void func(int x, int ...v)
                  {
                  -------
                  -------
                  }

         if a call is made as func(3,4,5) which version will have to be called. compiler has no way to make out.

  CASE 2: suppose there is a method
                  void func(int ...v)
                  {
                   ------
                   ------
                  }
         which is overloaded as :
                  void func(double ...v)
                  {
                  -------
                  -------
                  }

         if a call is made as func() which version will have to be called. compiler has no way to make out.
  The best practice therefore in the case varargs is not to overload but define a function (with a different name)
  for each case.


 */



class RunningAverage
{
    public double computeRunAvg(double ...v)
    {
        double avg = 0;
        for (int i=0; i<v.length; i++)
        {
            avg = avg + v[i];
        }

        return avg/v.length;
    }

    public double computeRunAvg(boolean scale, double ...v)
    {
        double avg;
        if (scale)
        {
            double sum = 0;
            for (int i = 0; i<v.length; i++)
            {
                sum = sum + 0.5*v[i];

            }
            avg =  sum/v.length;
        }
        else
            {
                avg = computeRunAvg(v);

        }

        return avg;

    }
}



public class VarArgs {
    public static void main(String [] args)
    {
        RunningAverage avg = new RunningAverage();
        System.out.println("Average of 3 input numbers : "+avg.computeRunAvg(1,2,3));
        System.out.println("Average of 4 input numbers : "+avg.computeRunAvg(1,2,3,4));
        System.out.println("Average of 5 input numbers : "+avg.computeRunAvg(1,2,3,4,5));
        System.out.println("=============Scaled averages============ ");
        System.out.println("Average of 5 input numbers : "+avg.computeRunAvg(true,1,2,3,4,5));
        System.out.println("Average of 5 input numbers : "+avg.computeRunAvg(false,1,2,3,4,5));

    }

}
