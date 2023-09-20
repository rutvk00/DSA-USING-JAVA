// given n*n chess board and you have to fill n queens into chess board such that they can not kill each other
//https://www.youtube.com/watch?v=05y82cP3bJo&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=51

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class NQueen
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int chess[][] = new int[n][n];

        printNQueen (chess , 0 , "");
    }

    public static void printNQueen (int chess[][] , int row , String ans)
    {
        if (row == chess.length)
        {
            System.out.println (ans + ".");
            return ;
        }
        for (int col = 0 ; col < chess[0].length ; col++)
        {
            if (isQueenSafe (chess , row , col) == true)
            {
                chess[row][col] = 1 ;
                printNQueen (chess , row+1 , ans + row+"-"+col +" , ") ;
                chess[row][col] = 0 ;
            }
        }
    }

    public static boolean isQueenSafe (int chess[][] , int row , int col)
    {
        for (int i = row-1 , j = col ; i>= 0 ; i--)
        {
            if (chess[i][j] == 1)
            {
                return false ;
            }
        }
        for (int i = row-1 , j = col+1 ; i>= 0 && j < chess[0].length ; i-- , j++)
        {
            if (chess[i][j] == 1)
            {
                return false ;
            }
        }
        for (int i = row-1 , j = col-1 ; i>= 0 && j >=0 ; i-- , j--)
        {
            if (chess[i][j] == 1)
            {
                return false ;
            }
        }

        return true;
    }

}