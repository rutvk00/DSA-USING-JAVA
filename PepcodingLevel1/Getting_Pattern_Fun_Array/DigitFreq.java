package PepcodingLevel1.Getting_Pattern_Fun_Array;// count the frequency of given digit in given number
// https://www.youtube.com/watch?v=U3VZNsMJpD4&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=77

import java.util.*;

class DigitFreq
{
    public static int GetDigitFrequency (int n , int freq)
    {
        int count = 0;
        while (n != 0)
        {
            int digit = n % 10 ;
            if (freq == digit)
                    count++;
            n = n/10;
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int freq = scn.nextInt();

        int count  = GetDigitFrequency (n,freq);
        System.out.println ("Frequency of "+freq +" in the "+n+" is : "+count);
    }
}