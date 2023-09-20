//https://www.youtube.com/watch?v=GY0O57llkKQ&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=33

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class BuySell4
{
    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int price[] = new int [n];

        for (int i = 0 ; i < n ; i++)
        {
            price[i] = scn.nextInt();
        }
        int obsp = -price[0];
        int ossp = 0;
        int ocsp = 0;

        for (int i = 1 ; i < n ; i++ )
        {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if (ocsp - price[i] > obsp )
            {
                nbsp = ocsp - price[i];
            }
            else {
                nbsp = obsp;
            }

            if (obsp + price[i] > ossp)
            {
                nssp = obsp + price[i] ;
            }
            else {
                nssp = ossp;
            }

            if (ossp > ocsp)
            {
                ncsp = ossp;
            }
            else {
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }

        System.out.println(ossp);
    }
}