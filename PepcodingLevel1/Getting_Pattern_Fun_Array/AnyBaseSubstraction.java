package PepcodingLevel1.Getting_Pattern_Fun_Array;// Given Base b And Do n1 - n2
//https://www.youtube.com/watch?v=TJtXba11yNU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=88&t=2s

import java.util.*;
class AnyBaseSubstraction
{
    public static int GetAnyBaseSub (int b , int n1 , int n2)
    {
        int substraction = 0;
        int power = 1 ;
        int carry = 0;
        while (n2 >0)                           // Consider n2 should be larger
        {
            int d1 = n1 % 10;
            n1 = n1 / 10 ;
            int d2 = n2 % 10;
            n2 = n2 / 10 ;

            int digit = 0;
            d2 = d2 + carry;

            if (d2 >= d1)
            {
                carry = 0;
                digit = d1 - d2 ;
            }
            else
            {
                carry = -1;
                digit = d2 - d1 + b ;
            }

            substraction += digit * power ;
            power *= 10 ;

        }
        return substraction ;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();

        int substraction = GetAnyBaseSub (b , n1 , n2);
        System.out.println ("in Base "+b+ " : "+n1+" - "+n2+" = "+substraction);
    }
}