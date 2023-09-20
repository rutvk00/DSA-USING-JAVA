//https://www.youtube.com/watch?v=uuE2pEjLiEI&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=5

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class BalancedBracket
{
    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0 ; i< str.length() ; i++)
        {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);
            }
            else if (ch == ')')
            {
                if ( st.size() == 0 || st.peek() != '(')
                {
                    System.out.println("False");
                    return;
                }
                else {
                    st.pop();
                }

            }
            else if (ch == ']')
            {
                if ( st.size() == 0 || st.peek() != '[')
                {
                    System.out.println("False");
                    return;
                }
                else {
                    st.pop();
                }
            }
            else if (ch == '}' )
            {
                if ( st.size() == 0 || st.peek() != '{')
                {
                    System.out.println("False");
                    return;
                }
                else {
                    st.pop();
                }
            }
        }

        if (st.size() == 0)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}