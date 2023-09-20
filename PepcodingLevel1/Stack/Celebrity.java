 //https://www.youtube.com/watch?v=CiiXBvrX-5A&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=20

 package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class Celebrity
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for (int i = 0 ; i<arr.length ; i++)
        {
            for (int j= 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < arr.length ; i++)
        {
            st.push(i);
        }

        while (st.size() >= 2)
        {
           int i = st.pop();
           int j = st.pop();
           if (arr[i][j] == 1)
           {
               st.push(j);
           }
           else {
               st.push(i);
           }
        }

        int pot = st.pop();
        boolean flag = true;
        for (int i = 0 ; i < n ; i++)
        {
            if (i != pot)
            {
               if (arr[i][pot] == 0 || arr[pot][i] == 1)
               {
                   flag = false;
                   break;
               }
            }
        }

        if (flag)
        {
            System.out.println(pot + " is celebrity. ");
        }
        else {
            System.out.println("None of them is celebrity");
        }
    }
}