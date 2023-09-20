package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print all Subset of Given Array
//https://www.youtube.com/watch?v=iKSI_9NHR1M&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=38

import java.util.*;
import java.io.*;

class SubsetArray
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i<n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int limit = (int)Math.pow (2 , arr.length);

        for (int i = 0 ; i <limit ; i++)
        {
            int temp = i ;
            String set = "";
            for (int j = 0 ; j < arr.length ; j++)
            {
                int r = temp%2 ;
                temp = temp / 2 ;

                if (r == 0)
                {
                    set = "-\t" + set;
                }
                else
                {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println (set);
        }
        
    }
}