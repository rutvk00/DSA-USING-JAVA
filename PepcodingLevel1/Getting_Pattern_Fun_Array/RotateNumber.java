package PepcodingLevel1.Getting_Pattern_Fun_Array;// Rotate given number 273516 ----->162735 rotate with 2
//https://www.youtube.com/watch?v=lt8oCGqYMGg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=26

import java.util.*;
class RotateNumber
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int number = scn.nextInt();
        int k = scn.nextInt();

        // Find no. digits in number
        int temp = number ;
        int digits = 0;
        while (temp != 0)
        {
             temp = temp/10;
            digits++;
        }
        k = k % digits;
        if (k < 0)
        {
            k = k + digits ;
        }
        // find multiplier ans divisor
        int div = 1 ;
        int mul = 1 ;
        for (int i = 1 ; i<= digits ; i++)
        {
            if (i <= k)
            {
                div = div * 10;
            }
            else {
                mul = mul * 10;
            }
        }
        int q = number / div ;
        int r = number % div;

        int rotated = r * mul + q ;
        System.out.println (rotated);
    }
}