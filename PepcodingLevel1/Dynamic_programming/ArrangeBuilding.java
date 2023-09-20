//https://www.youtube.com/watch?v=0nF-BMYy7tc&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=19

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class ArrangeBuilding
{
    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        long n = scn.nextInt();

        long prev_0 = 1;
        long prev_1 = 1;

        for (int i = 2 ; i <=n ; i++)
        {
            long cur_0 = prev_1 ;
            long cur_1 = prev_1 + prev_0;
            prev_0 = cur_0;
            prev_1 = cur_1;
        }
        long total_ways = (prev_0 + prev_1) * (prev_0 + prev_1);
        System.out.println(total_ways);
    }
}