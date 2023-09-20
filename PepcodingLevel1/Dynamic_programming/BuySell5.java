//https://www.youtube.com/watch?v=wuzTpONbd-0&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=34

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class BuySell5
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int price[] = new int [n];
        for (int i = 0 ; i < n ; i++)
        {
            price[i] = scn.nextInt();
        }

       int  mpist = 0;
        int leastsf = price[0];
        int [] dpmpist = new int[n];

        for(int i = 1 ; i < n ; i++)
        {
            if (price[i] < leastsf)
            {
                leastsf = price[i];
            }
            mpist = price[i] - leastsf;
            if (mpist > dpmpist[i-1])
            {
                dpmpist[i] = mpist;
            }
            else {
                dpmpist[i] = dpmpist[i-1];
            }
        }

        int mpibt = 0;
        int maxsf = price[n-1];
        int dpmpibt [] = new int[n];
        for (int i = n-2 ; i >= 0 ; i--)
        {
            if (price[i] > maxsf)
            {
                maxsf = price[i];
            }

            mpibt = maxsf - price[i];
            if (dpmpibt[i+1] < mpibt)
            {
                dpmpibt[i] = mpibt;
            }
            else {
                dpmpibt[i]= dpmpibt[i+1];
            }
        }

        int op = 0;

        for (int i = 0 ; i < n ; i++)
        {
            if (dpmpibt[i] + dpmpist[i] > op)
            {
                op = dpmpibt[i] + dpmpist[i];
            }
        }

        System.out.println(op);
    }
}