// https://www.youtube.com/watch?v=4eSFaEOa-l0&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=2
package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class DuplicateBracket
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner  (System.in);
        String str = scn.next();
        Stack<Character> st = new Stack<>();

        for (int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if (ch == ')')
            {
                if (st.peek() == '(')
                {
                    System.out.println("True");
                    return;
                }
                else
                {
                    while (st.peek() != '(')
                    {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }

        System.out.println("False");
    }
}