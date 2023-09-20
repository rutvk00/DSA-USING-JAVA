package PepcodingLevel1.Getting_Pattern_Fun_Array;

import java.io.*;
import java.util.*;

public class Bar {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int max = arr[0];

        for (int i = 0 ; i<arr.length ; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        for (int floor = max ; floor>= 1 ; floor--)
        {
            for (int building = 0 ; building<arr.length ; building++)
            {
                if (arr[building] >= floor)
                {
                    System.out.print ("*\t");
                }
                else
                {
                    System.out.print ("\t");
                }
            }
            System.out.println ();
        }
    }

}