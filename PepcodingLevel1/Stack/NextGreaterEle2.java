//https://www.youtube.com/watch?v=XP8iEi9Aa8c&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=8
// Alternative approach for next greater element to the right

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class NextGreaterEle2
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Stack<Integer> st = new Stack<Integer>();
        int []nge = new int[n];
        st.push(0);

        for (int i = 1 ; i < n ; i++)
        {
            while (st.size() != 0 && arr[i] > arr[st.peek()])
            {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
           st.push(i);
        }

        while (st.size()>0)
        {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();

        }


        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(nge[i]+" ");
        }
    }
}