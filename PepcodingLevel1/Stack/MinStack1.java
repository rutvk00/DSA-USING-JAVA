//https://www.youtube.com/watch?v=Trz7JM610Uc&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=46

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class MinStack1
{
    public static  class StackMin1
    {
        Stack<Integer> allData;
       int min ;

        public StackMin1 ()
        {
            allData = new Stack<>();

        }

        int size()
        {
            return allData.size();
        }
        void push (int val)
        {
            if (allData.size() == 0)
            {
                allData.push(val);
                min = val;
            }
            else
            {
                if (val>= min)
                {
                    allData.push(val);
                }
                else {
                    allData.push(val + val - min);
                    min = val;
                }
            }
        }
        int pop()
        {
            if (allData.size() == 0)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else {
              if (allData.peek() >= min)
              {
                  return allData.pop();
              }
              else {
                  int val = min;
                  min =  2*min - allData.peek() ;
                  return min ;
              }

            }
        }

        int top()
        {
            if (allData.size() == 0)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else {
                if (allData.peek() < min)
                {
                    return min;
                }
                else {
                    return allData.peek();
                }
            }
        }

        int min()
        {
            if (allData.size() == 0)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else {
                return min;
            }
        }
    }

    public static void main(String[] args) {
        StackMin1 st = new StackMin1();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //st.push(1);

        System.out.println(st.min());

    }

}