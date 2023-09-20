package PepcodingLevel1.Getting_Pattern_Fun_Array;// print upper triangle diagonal wise
//https://www.youtube.com/watch?v=lvRdFCMD_Ew&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=15
import java.util.*;
import java.io.*;
class UpperDiagonalTraversal
{


    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int gap = 0; gap < arr.length ; gap++)
        {
            for (int i = 0 , j = gap ; j < arr.length ; i++ , j++)
            {
                System.out.print (arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // display
//    public static void display (int arr[][])
//    {
//        // Display
//        for (int i = 0 ; i < arr.length ; i++)
//        {
//            for (int j = 0 ; j < arr[0].length ; j++)
//            {
//                System.out.print (arr[i][j] + " ");
//            }
//            System.out.println ();
//        }
//    }
}