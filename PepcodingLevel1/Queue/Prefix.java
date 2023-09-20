//https://www.youtube.com/watch?v=Q-Nw-dTApjk&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=37

package PepcodingLevel1.Queue;
import java.util.*;
import java.io.*;

class Prefix
{
    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        String exp = scn.nextLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = exp.length()-1 ; i >= 0 ; i--)
        {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation (v1 , v2 , ch);
                vs.push(val);

                String isv1 = is.pop();
                String isv2 = is.pop();
                String isv = "("+isv1+ch+isv2+")";
                is.push(isv);

                String psv1 = ps.pop();
                String psv2 = ps.pop();
                String psv = psv1+psv2+ch;
                ps.push(psv);
            }
            else {
                vs.push(ch-'0');
                is.push(ch+"");
                ps.push(ch+"");
            }
        }

        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }

    public static int operation (int v1 , int v2 , char op)
    {
        if (op == '+')
        {
            return v1+v2;
        }
        else if (op == '-')
        {
            return v1-v2;
        }
        else if (op == '*')
        {
            return v1*v2;
        }
        else
        {
            return v1/v2;
        }
    }

}