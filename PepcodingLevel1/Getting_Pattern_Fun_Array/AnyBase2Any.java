package PepcodingLevel1.Getting_Pattern_Fun_Array;// Given a number with Base b1 And convert into Number in other given base b2
//https://www.youtube.com/watch?v=2-d3DcBFzug&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=83

import java.util.*;

class AnyBase2Any
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
    public static int GetB2baseNumber (int n , int b1 , int b2)
    {
        int decimal = GetDecimal (n , b1);
        int final_number = GetBaseNumber (decimal , b2);
        return final_number;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int new_number = GetB2baseNumber (n , b1 , b2);
        System.out.println (n + " in base "+ b1 + " ---> " + new_number +" in base " + b2);
    }
}
