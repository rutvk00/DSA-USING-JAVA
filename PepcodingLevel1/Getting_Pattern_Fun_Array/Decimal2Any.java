package PepcodingLevel1.Getting_Pattern_Fun_Array;// Convert Given  Decimal number into Any Base
// https://www.youtube.com/watch?v=lOsmPMihcTM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=80

import java.util.*;


class Decimal2Any
{
    public static int GetBaseNumber (int n , int b)
    {
        int new_n = 0 ;
        int power = 1;
        while (n>0)
        {
            int digit = n % b ;
            n = n/b;
            new_n  +=  (power * digit) ;
            power *= 10;
        }
        return new_n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        int new_n = GetBaseNumber( n  ,  b);
        System.out.println (n +" in  Base in " + b + " is : "+ new_n);
    }
}