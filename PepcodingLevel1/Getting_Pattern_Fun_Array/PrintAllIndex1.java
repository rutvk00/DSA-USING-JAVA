package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print last occurance of given element in the array
//https://www.youtube.com/watch?v=bQkwHBaNioE&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=24

import java.util.*;

class PrintALlIndex1
{
    public static int[] print_all_index (int arr[] , int i , int fsf , int x)
    {
        if (i == arr.length)  return new int[fsf];

        if (arr[i] == x)
        {
            int allidx[] = print_all_index (arr , i+1, fsf+1 , x);
            allidx[fsf] = i;
            return allidx;
        }
        else {
            int allidx[] = print_all_index (arr , i+1, fsf , x);
            return allidx;
        }

    }

    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in) ;
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        int allidx[] = print_all_index (arr , 0 , 0 , x );

        if (allidx.length == 0)
        {
            System.out.println();
            return ;
        }

        for (int i = 0 ; i<allidx.length ; i++)
        {
            System.out.print (allidx[i] +" ") ;
        }
    }
}
