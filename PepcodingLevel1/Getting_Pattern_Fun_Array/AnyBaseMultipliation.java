package PepcodingLevel1.Getting_Pattern_Fun_Array;// In given base b ==> n1 * n2
//https://www.youtube.com/watch?v=gB7H8BQ1s1w&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=89

import java.util.*;
class AnyBaseMutiplication
{
    public static int GetAddition (int n1 , int n2 , int b)
    {
        int addition = 0 ;
        int power = 1 ;
        int carry = 0 ;

        while (n1 > 0 || n2 > 0 || carry > 0)
        {
            int d1 = n1 % 10 ;
            int d2 = n2 % 10 ;
            n1 = n1 / 10 ;
            n2 = n2 / 10;

            int d = d1 + d2 + carry ;
            carry = d / b ;
            d = d % b ;

            addition += d * power ;
            power *= 10;

        }
        return addition ;
    }

    public static int GetMulWithSingleDigit (int n1 , int n2_digit , int b)
    {
        int mul = 0 ;
        int carry = 0;
        int power = 1;

        while (n1 > 0 || carry >0)
        {
            int d1 = n1 % 10 ;
            n1 = n1 / 10;

            int d = d1 * n2_digit + carry;
            carry = d / b ;
            d = d % b ;

            mul += d*power ;
            power *= 10;

        }
        System.out.println (mul);
        return mul ;

    }
    public static int GetAnyBaseMul (int n1 , int n2 , int b)
    {
        int multiplication = 0 ;
        int power = 1 ;

        while (n2 > 0)
        {
            int d2 = n2 % 10;
            n2 = n2 / 10 ;

            int single_mul = GetMulWithSingleDigit (n1 , d2 , b);

            multiplication = GetAddition (multiplication , (single_mul*power) , b );
            power *= 10 ;
        }


        return multiplication ;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();

        int multiplication = GetAnyBaseMul (n1 ,n2 ,b);
        System.out.println ("For base : " + b + "---" + n1 +" * " + n2 + " = " + multiplication);

    }
}