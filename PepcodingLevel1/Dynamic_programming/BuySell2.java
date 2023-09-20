//https://www.youtube.com/watch?v=HWJ9kIPpzXs&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=31

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class BuySell2
{
    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []price = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            price[i] = scn.nextInt();
        }

        int bd = 0 ;
        int sd = 0;
        int profit = 0;

        for (int i = 1 ; i < n ; i++)
        {
            if (price[i] >= price[i-1])
            {
                sd++;
            }
            else {
                profit = price[sd] - price[bd];
                sd = bd = i;
            }
        }
        profit = price[sd] - price[bd];
        System.out.println(profit);
    }
}