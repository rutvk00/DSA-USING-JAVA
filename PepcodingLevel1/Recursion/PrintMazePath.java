// https://www.youtube.com/watch?v=MHtAA5UE-6Y&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=39

package PepcodingLevel1.Recursion;

import java.util.*;
import java.io.*;

class PrintMazePath
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePath (1 ,1, n , m ,"");
    }

    public static void printMazePath (int src_r , int src_c ,int  dest_r , int dest_c ,String path)
    {
        if (src_r > dest_r || src_c >dest_c)
        {
           return;
        }
        if (src_r == dest_r && src_c == dest_c)
        {
            System.out.println(path);
            return ;
        }
        printMazePath (src_r , src_c+1 , dest_r , dest_c , path + "H");
        printMazePath (src_r+1 , src_c , dest_r , dest_c , path + "V");


    }
}