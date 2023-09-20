package PepcodingLevel1.Getting_Pattern_Fun_Array;// Optimize code for checking given number is Prime or not ...
import java.util.*;
class IsPrime
{
    public static void main (String []args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter Number of Testcase : \n");
        int test_case = scn.nextInt();

        for (int i = 0 ; i < test_case ; i++)
        {
            int number = scn.nextInt();
            int count = 0 ;
            for (int div = 2 ; div*div <= number ; div++)
            {
                if (number % div ==0 ) {
                    count++;
                    break;
                }
            }
           if (count == 0)
               System.out.println ("Prime");
           else
               System.out.println ("Non Prime");

        }
    }
}