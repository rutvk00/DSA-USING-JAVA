package PepcodingLevel1.Getting_Pattern_Fun_Array;// this code print all prime number in the range of low and high number given by the user

import java.util.*;
class PrintAllPrime
{
    public static void main (String []args)
    {
        Scanner scn = new Scanner (System.in);
        //int test_case = scn.nextInt();
        int low = scn.nextInt();
        int high = scn.nextInt();


        for (int n = low ; n<=high ; n++)
        {
            int count = 0;
            for (int div = 2 ; div*div <= n ; div++)
            {
                if (n%div == 0)
                {
                    count++;
                    break;
                }
            }
            if (count == 0)
                    System.out.println (n);

        }
    }
}