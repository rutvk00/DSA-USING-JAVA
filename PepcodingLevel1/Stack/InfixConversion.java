// https://www.youtube.com/watch?v=Nfui0rgbQe8&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=17

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class InfixConversion
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String exp = scn.next();

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character>ops = new Stack<>();

        for (int i = 0 ; i < exp.length() ; i++)
        {
            char ch = exp.charAt(i);
            if (ch == '(')
            {
                ops.push(ch);
            }
            else if ( (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') )
            {
                prefix.push(ch+"");
                postfix.push(ch+"");
            }
            else if (ch == ')')
            {
                while (ops.peek() != '(')
                {
                    process (ops , prefix , postfix);
                }
                ops.pop();
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                while ( ops.size() > 0 && ops.peek() != '('  && precedence (ops.peek()) >= precedence(ch) )
                {
                    process (ops , prefix , postfix);
                }
                ops.push(ch);
            }
        }

        while (ops.size() > 0 )
        {
            process (ops , prefix , postfix);
        }

        System.out.println(prefix.pop());
        System.out.println(postfix.pop());
    }

    public static int precedence (char op)
    {
        if (op == '+' || op =='-')
        {
          return 1;
        }
        else if (op == '*' || op == '/')
        {
            return 2;
        }
        else {
            return 0;
        }
    }

    public static void process (Stack<Character> ops ,Stack<String> prefix , Stack<String> postfix )
    {
        char op = ops.pop();
        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postv = postv1 + postv2 + op;
        postfix.push (postv);

        String prev2 = prefix.pop();
        String prev1 = prefix.pop();
        String prev = op + prev1 + prev2 ;
        prefix.push(prev);
    }
}