package PepcodingLevel1.Getting_Pattern_Fun_Array;

import java.util.*;
import java.io.*;

class ShellRotate
{
    public static void display (int arr[][])
    {
        // Display
        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print (arr[i][j] + " ");
            }
            System.out.println ();
        }
    }

    public static void rotateshell (int arr[][], int shell , int rotation)
    {
        int[] oned = fillOnedFromShell (arr , shell);
        rotate (oned , rotation);
        fillShellFromOned (oned , arr , shell);
    }

    public static int[] fillOnedFromShell (int arr[][] , int shell)
    {
        int minr = shell-1;
        int minc = shell-1;
        int maxr = arr.length-shell;
        int maxc = arr[0].length-shell ;
        int sz = 2 * (maxr - minr) + 2 * (maxc - minc) ;

         int oned[] = new int[sz];
         int idx = 0;
         //lw
        for (int i = minr , j = minc ; i <= maxr ; i++)
        {
            oned[idx] = arr[i][j];
            idx++;
        }
        //bw
        for (int i = maxr , j = minc+1 ; j <= maxc ; j++)
        {
            oned[idx] = arr[i][j];
            idx++;
        }

        //rw
        for (int i = maxr-1 , j = maxc ; i >= minr ; i--)
        {
            oned[idx] = arr[i][j];
            idx++;
        }

        //tw
        for (int i = minr , j = maxc-1 ; j > minc ; j--)
        {
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned ;
    }

    public static void fillShellFromOned (int oned[] , int arr[][] , int shell)
    {
        int minr = shell-1;
        int minc = shell-1;
        int maxr = arr.length-shell;
        int maxc = arr[0].length-shell ;

        int idx = 0;
        //lw
        for (int i = minr , j = minc ; i <= maxr ; i++)
        {
            arr[i][j] = oned[idx];
            idx++;
        }
        //bw
        for (int i = maxr , j = minc+1 ; j <= maxc ; j++)
        {
            arr[i][j] = oned[idx];
            idx++;
        }

        //rw
        for (int i = maxr-1 , j = maxc ; i >= minr ; i--)
        {
            arr[i][j] = oned[idx];
            idx++;
        }

        //tw
        for (int i = minr , j = maxc-1 ; j > minc ; j--)
        {
            arr[i][j] = oned[idx];
            idx++;
        }
    }

    public static void rotate (int [] oned , int rotation)
    {
        rotation = rotation % oned.length;
        if (rotation < 0)
        {
            rotation = rotation + oned.length ;
        }

        reverse (oned , 0 , oned.length - rotation - 1);
        reverse (oned ,oned.length - rotation , oned.length-1);
        reverse (oned , 0 , oned.length -1);
    }

    public static void reverse (int oned [] , int li , int ri)
    {
        while (li < ri)
        {
            int temp =  oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp ;
            li++;
            ri--;
        }
    }

    public static void main(String[] args) throws Exception {
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

        int shell = scn.nextInt();
        int rotation = scn.nextInt();

        rotateshell (arr , shell , rotation);
        display (arr);

    }
}