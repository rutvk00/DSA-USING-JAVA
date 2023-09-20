package PepcodingLevel1.Getting_Pattern_Fun_Array;

import java.io.*;
import java.util.*;


public class Lec100  {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int []a1 = new int [n1];
        for (int i = 0 ; i<a1.length ; i++)
        {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int []a2 = new int [n2];
        for (int i = 0 ; i<a2.length ; i++)
        {
            a2[i] = scn.nextInt();
        }

        int[] sum = new int [n1>n2 ? n1 : n2];
        int carry= 0;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = sum.length-1;

        while (k >= 0)
        {
            int d = carry ;

            if (i >= 0)
                d += a1[i];
            if (j >= 0)
                d += a2[j];

            carry = d / 10 ;
            d = d % 10;

            sum[k] = d ;

            i--;
            if (j == 0)
            {
                j = -1 ;
            }
            else {
                j--;
            }
            k--;
        }

        if (carry != 0)
            System.out.println(carry);

        for (int val : sum)
            System.out.println(val);

    }

}