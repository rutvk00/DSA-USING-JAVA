//https://www.youtube.com/watch?v=4bjCEJmiPZA&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=44

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class MinStack
{
    public static  class StackMin
    {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public StackMin ()
        {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size()
        {
            return allData.size();
        }
        void push (int val)
        {
            allData.push(val);
            if (minData.size() == 0 || val <= minData.peek())
            {
                minData.push(val);
            }
        }
        int pop()
        {
            if (minData.size() == 0)
            {
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else {
               int val = allData.pop();
               if (val == minData.peek())
               {
                   minData.pop();
               }
               return val ;
            }
        }

        int top()
        {
            if (allData.size() == 0)
            {
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else {
                return allData.peek();
            }
        }

        int min()
        {
            if (minData.size() == 0)
            {
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else {
                return minData.peek();
            }
        }
    }

    public static void main(String[] args) {
        StackMin st = new StackMin();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(1);

        System.out.println(st.min());

    }

}