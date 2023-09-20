//https://www.youtube.com/watch?v=pTQB9wbIpfU&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=32

package PepcodingLevel1.Dynamic_programming;
import java.io.*;
import java.util.*;

class BuySell3
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] price = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            price[i] = scn.nextInt();
        }
        int fee = scn.nextInt();

        int obsp = -price[0];
        int ossp = 0;

        for (int i = 1 ; i < n ; i++)
        {
            int nbsp = 0;
            int nssp = 0;
            if (ossp-price[i] > obsp)
            {
                nbsp = ossp - price[i];
            }
            else {
                nbsp = obsp;
            }

            if (obsp + price[i] - fee > ossp )
            {
                nssp = obsp + price[i] - fee;
            }
            else {
                nssp = ossp;
            }

            ossp = nssp;
            obsp = nbsp;
        }

        System.out.println(ossp);
    }
}