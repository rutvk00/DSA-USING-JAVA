//https://www.youtube.com/watch?v=0BsPlzqksZQ&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=10

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class StockSpan
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i<n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int span[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for(int i = 1; i<n ; i++)
        {
            while (st.size() > 0 && arr[i] > arr[st.peek()])
            {
               st.pop();
            }
           if (st.size() == 0)
           {
               span[i] = i+1;
           }
           else {
               span[i] = i - st.peek();
           }

           st.push(i);
        }

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print (span[i]+" ");
        }
    }
}