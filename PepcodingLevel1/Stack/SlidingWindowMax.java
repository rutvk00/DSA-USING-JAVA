//https://www.youtube.com/watch?v=tCVOQX3lWeI&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=14

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;
class SlidingWindowMax
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int window = scn.nextInt();

        Stack<Integer> st = new Stack<>();
        int nge[] = new int[n];
        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;

        for (int i = arr.length-2 ; i>=0 ; i--)
        {
            while (st.size()>0 && arr[st.peek()] <= arr[i])
            {
                st.pop();
            }
            if (st.size() == 0)
            {
                nge[i] = arr.length;
            }
            else {
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int j = 0;
        for (int i = 0 ; i <=arr.length-window ; i++)
        {
            j = i;
            while (nge[j] < i+window)
            {
                j = nge[j];
            }
            System.out.print(arr[j]+" ");
        }
    }
}