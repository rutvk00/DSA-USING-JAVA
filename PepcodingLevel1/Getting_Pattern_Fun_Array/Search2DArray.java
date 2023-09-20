package PepcodingLevel1.Getting_Pattern_Fun_Array; // Search in Sorted 2D array
 //https://www.youtube.com/watch?v=5vP0-g94xEA&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=19

 import java.util.*;
 import java.io.*;
 class Search2DArray {


     public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         int r = scn.nextInt();
         int c = scn.nextInt();
         int arr[][] = new int[r][c];

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[0].length; j++) {
                 arr[i][j] = scn.nextInt();
             }
         }

         int x =scn.nextInt();
         int i = 0;
         int j = arr[0].length-1;

         while (i < arr.length && j >= 0)
         {
             if (x == arr[i][j])
             {
                 System.out.println (i +" "+j);
                 return;
             }
             else if (x > arr[i][j])
             {
                 i++;
             }else
             {
                 j--;
             }
         }
        System.out.println ("-1");

     }
 }