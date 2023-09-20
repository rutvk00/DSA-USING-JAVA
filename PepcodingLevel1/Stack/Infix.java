//https://www.youtube.com/watch?v=IY0nZLEg6MA&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=16

package PepcodingLevel1.Stack;
import java.util.*;
import java.io.*;

class Infix
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        String exp = scn.nextLine();

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optor = new Stack<>();

        for (int i = 0 ; i < exp.length() ; i++)
        {
            char ch = exp.charAt(i);
            if (ch == '(')
            {
                optor.push(ch);
            }
            else if (Character.isDigit(ch))
            {
                opnds.push(ch-'0');
            }
            else if (ch == ')')
            {
                while (optor.peek() != '(')
                {
                    char operator = optor.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int res = operation (v1 , v2 , operator);
                    opnds.push(res);
                }
                optor.pop();
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                while (optor.size() > 0 && optor.peek() != '(' && precedence (optor.peek()) >= precedence(ch))
                {
                    char operator = optor.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int res = operation (v1 , v2 , operator);
                    opnds.push(res);
                }
                optor.push(ch);
            }
        }

        while (optor.size() != 0)
        {
            char operator = optor.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int res = operation (v1 , v2 , operator);
            opnds.push(res);
        }
        System.out.println(opnds.peek());
    }

    public static int precedence (char operator)
    {
        if (operator == '+')
        {
            return 1;
        }
        else if(operator == '-')
        {
            return 1;
        }
        else if (operator == '*')
        {
            return 2;
        }else {
            return 2;
        }
    }

    public static int operation(int val1 , int val2 , char operator)
    {
        if (operator == '+')
        {
            return val1 + val2;
        }
        else if(operator == '-')
        {
            return val1 - val2;
        }
        else if (operator == '*')
        {
            return val1 * val2;
        }else {
            return val1 / val2;
        }
    }
}