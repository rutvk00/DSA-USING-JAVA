// https://www.youtube.com/watch?v=SP880DBRJ_8&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=53

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;
class KnightTour
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int row = scn.nextInt();
        int col = scn.nextInt();
        int chess [][] = new int [n][n];

        printKnightTour (chess , row , col , 1);
    }
     public static void printKnightTour (int chess[][] , int row , int col , int move)
     {
         if (row<0 || col<0 || row >=chess.length || col >=chess.length || chess[row][col] >0)
         {
             return;
         }
         else if (move == chess.length * chess.length)
         {
             chess[row][col] = move;
             displayBoard (chess);
             chess[row][col] = 0;
             return;
         }

         chess[row][col] = move;
         printKnightTour(chess , row-2 , col+1 , move+1);
         printKnightTour(chess , row-1 , col+2 , move+1);
         printKnightTour(chess , row+1 , col+2 , move+1);
         printKnightTour(chess , row+2 , col+1 , move+1);
         printKnightTour(chess , row+2, col-1 , move+1);
         printKnightTour(chess , row+1 , col-2 , move+1);
         printKnightTour(chess , row-1 , col-2 , move+1);
         printKnightTour(chess , row-2 , col-1 , move+1);

         chess[row][col] = 0 ;
     }

     public static void displayBoard (int chess[][])
     {
         for (int i = 0 ; i < chess.length ; i++)
         {
             for (int j = 0 ; j < chess[0].length ; j++)
             {
                 System.out.println (chess[i][j]);
             }
             System.out.println ();
         }
     }
}