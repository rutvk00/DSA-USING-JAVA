// https://www.youtube.com/watch?v=NEuYcztalew&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=37

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class PrintStairPath
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        printStairPaths(n, "");
    }

    public static void printStairPaths (int n , String ans)
    {
     if (n<0)
     {
         return ;
     }
     if (n == 0)
     {
         System.out.println( ans );
         return ;
     }
        printStairPaths (n-1 ,ans + "1");
        printStairPaths (n-2 ,ans + "2");
        printStairPaths (n-3 , ans + "3");
    }
}