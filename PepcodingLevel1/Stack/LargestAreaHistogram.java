//https://www.youtube.com/watch?v=0do2734xhnU&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=12

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class LargestAreaHistogram
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int rb[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rb[arr.length-1] = arr.length;

        for (int i = arr.length-2 ; i >= 0 ; i--)
        {
            while(st.size() > 0 && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            if (st.size() == 0)
            {
                rb[i] = arr.length;
            }
            else {
                rb[i] = st.peek();
            }
            st.push(i);
        }
        int lb[] = new int[n];
        st = new Stack<>();

        st.push(0);
        rb[0] = -1;

        for (int i = 1 ; i < n ; i++)
        {
            while(st.size() > 0 && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            if (st.size() == 0)
            {
                lb[i] = -1;
            }
            else {
                lb[i] = st.peek();
            }
            st.push(i);
        }



        int maxArea = 0;
        for (int i = 0 ; i < n ; i++)
        {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea)
            {
              maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}