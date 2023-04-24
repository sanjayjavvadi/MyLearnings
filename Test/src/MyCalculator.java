import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    
    public int power(int a, int b) throws Exception
    {
        if(a>0 && b > 0 || (a==0 || b==0 ))
        {
            return (int) Math.pow(a, b);
        }

         else if(a<0 || b < 0)
        {
            throw new java.lang.Exception("n or p should not be negative.");
        }

        else if(a<0 && b < 0)
        {
             throw new java.lang.Exception("n or p should not be negative.");
        }
        else if(a==0 && b == 0 )
        {
            throw new java.lang.Exception("n and p should not be zero.");
        }
        return 0;

            

    }
}

