//https://www.youtube.com/watch?v=nqrXHJWMeBc&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=18
// Count binary string of length n which does not contain consecutive zeros

package PepcodingLevel1.Dynamic_programming;
import java.util.*;
import java.io.* ;

class Count_BinaryString
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        int prev_0 = 1;
        int prev_1 = 1 ;
        int cur_0 ;
        int cur_1;

        for (int i = 2 ; i<=n ; i++)
        {
            cur_1 = prev_0 + prev_1;
            cur_0 = prev_1;
            prev_0 = cur_0;
            prev_1 = cur_1;

        }
        System.out.println(prev_0 + prev_1);

    }
}