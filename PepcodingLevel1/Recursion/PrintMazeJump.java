// https://www.youtube.com/watch?v=zri_tftYphE&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=41

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class PrintMazeJump
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in) ;
        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazeJump (1 , 1, n , m ,"");
    }

    public static void printMazeJump (int src_r ,int src_c ,int dest_r ,int dest_c , String path)
    {
        if (src_r == dest_r && src_c == dest_c)
        {
            System.out.println (path);
            return ;
        }

        for (int i = 1 ; i <= dest_c - src_c ; i++)
        {
            printMazeJump (src_r , src_c+i ,dest_r , dest_c , path + "H" + i);
        }

        for (int i = 1 ; i <= dest_r - src_r ; i++)
        {
            printMazeJump (src_r+i , src_c ,dest_r , dest_c , path + "V" + i);
        }

        for (int i = 1 ; i <= dest_c - src_c && i <= dest_r - src_r ; i++)
        {
            printMazeJump (src_r+i , src_c+i,dest_r , dest_c , path + "D" + i);
        }
    }
}