// https://www.youtube.com/watch?v=GOCbsY7Arw4&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=26

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class SmallestNumber
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        Stack<Integer> st = new Stack<Integer>();
        int num = 1;

        for (int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if (ch == 'd')
            {
             st.push(num);
             num++;
            }else {
                st.push(num);
                num++;
                while (st.size() > 0)
                {
                    System.out.print(st.pop()+" ");
                }
            }
        }

        st.push(num);
        while(st.size() > 0)
        {
            System.out.print(st.pop()+" ");
        }
    }
}