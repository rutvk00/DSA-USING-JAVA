//https://www.youtube.com/watch?v=IV9pbZsi5cc&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=21
package PepcodingLevel1.Dynamic_programming;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;
import java.io.*;

class CountSubSequencesABC
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();

        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a')
            {
                a = 2 * a + 1;
            }
            else if (ch == 'b')
            {
                ab = 2 * ab + a;
            }
            else {
                abc = 2 * abc + ab ;
            }
        }

        System.out.println(abc);

    }
}