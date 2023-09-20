// Count the number of way to climb a stair
//https://www.youtube.com/watch?v=A6mOASLl2Dg&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=2

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class CountPath
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int count_path = countPath (n , new int[n+1]);
        int count_path_tab = countPathTab(n);
        System.out.println (count_path);
        System.out.println (count_path_tab);
    }

    public static int countPath (int n ,int dp_array[] )
    {
        if (n == 0) return 1;
        if (n<0) return 0;

        if (dp_array[n] > 0) return dp_array[n];
        int cpnm1 = countPath (n-1 , dp_array);
        int cpnm2 = countPath (n-2 , dp_array);
        int cpnm3 = countPath (n-3 , dp_array);
        int cpn = cpnm1 + cpnm2 + cpnm3;
        dp_array[n] = cpn;
        return cpn ;
    }

    public static int countPathTab (int n)
    {
        int tab_array[] = new int[n+1];
        tab_array[0] = 1;
        for (int i = 1 ; i <tab_array.length ; i++ )
        {
            if (i == 1)
            {
                tab_array[i] = tab_array[i-1] ;
            }
            else if (i == 2)
            {
                tab_array[i] = tab_array[i-1] + tab_array[i-2] ;
            }
            else
            {
                tab_array[i] = tab_array[i-1] + tab_array[i-2] + tab_array[i-3];
            }
        }
        return tab_array[n];
    }
}