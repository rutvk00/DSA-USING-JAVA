//https://www.youtube.com/watch?v=4YjEHmw1MX0&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=30

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class BuySell1
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int price[] = new int[n];

        for (int i = 0 ; i < n ; i++)
        {
            price[i] = scn.nextInt();
        }

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int i = 0 ; i < n ; i++)
        {
            if (lsf > price[i])
            {
                lsf = price[i];
            }
            pist = price[i] - lsf;
            if (op < pist)
            {
                op = pist ;
            }
        }
        System.out.println(op);
    }
}
