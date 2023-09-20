package PepcodingLevel1.Getting_Pattern_Fun_Array;// For given Base Do addition in that base
//https://www.youtube.com/watch?v=YVpTjZRShqo&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=86

import java.util.*;

class AnyBaseAddition
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

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();

        int addition = GetAddition (n1 , n2 , b);
        System.out.println (n1 + " + " + n2 +" = "+ addition);
    }
}