package PepcodingLevel1.Getting_Pattern_Fun_Array;// Given Any number with Base and Convert into Decimal
// https://www.youtube.com/watch?v=F0aTGc2vS5s&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=82

import java.util.*;

class AnyBase2Decimal
{
    public static int GetDecimal (int n , int b)
    {
        int decimal = 0 ;
        int power = 1 ;

        while (n>0)
        {
            int digit = n%10 ;
            n = n/10 ;
            decimal += digit * power;
            power *= b;
        }
        return decimal ;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        int Decimal_number = GetDecimal (n , b);
        System.out.println (n +" in base "+b+"-->"+" in Decimal "+ Decimal_number);
    }
}