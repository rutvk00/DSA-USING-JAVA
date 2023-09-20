// https://www.youtube.com/watch?v=rSf9vPtKcmI&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=7

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class NextGreaterEle
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Stack<Integer> st = new Stack<Integer>();
        int nge[] = new int[n];
        st.push(arr[n-1]);
        nge[n-1] = -1;

        for (int i = arr.length-2 ; i >=0 ; i--)
        {
            while (st.size() > 0 && arr[i] >= st.peek())
            {
                st.pop();
            }
            if (st.size() == 0)
            {
                nge[i] = -1;
            }
            else {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(nge[i] +" ");
        }

    }
}