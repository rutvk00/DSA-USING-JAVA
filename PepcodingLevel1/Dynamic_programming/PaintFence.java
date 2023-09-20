//https://www.youtube.com/watch?v=ju8vrEAsa3Q&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=25

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.*;

class PaintFence
{
    public static void main(String[] args)  throws Exception{
        Scanner scn =  new Scanner (System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int same = k * 1;
        int diff = k * (k-1);
        int total = same + diff ;
        for (int i = 3 ; i <= n ; i++)
        {
            same = diff * 1 ;
            diff = total * (k-1);
            total = same + diff;
        }

        System.out.println(total);
    }
}