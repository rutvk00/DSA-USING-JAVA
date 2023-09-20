package PepcodingLevel1.Getting_Pattern_Fun_Array;//https://www.youtube.com/watch?v=jKyuWD8XKjw&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=102
import java.io.*;
import java.util.*;

class DiffArray
{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int [n1];
        for (int i = 0 ;i<a1.length ; i++)
        {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int [n2];
        for (int i = 0 ;i<a2.length ; i++)
        {
            a2[i] = scn.nextInt();
        }

        int diff[] = new int[n2];
        int carry = 0 ;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        while (k>= 0)
        {
            int a1var = i>=0 ? a1[i] : 0 ;
            int d = 0 ;
            if (a2[j]+carry >= a1var)
            {
                d = a2[j] - a1var + carry;
                carry = 0;
            }
            else
            {
                 d = a2[j]+10-a1var+carry;
                 carry = -1 ;
            }

            diff[k] = d;
            i-- ; j--; k--;
        }
        int index = 0 ;
        while (index < diff.length)
        {
            if (diff[index] == 0)
                index++;
            else
                break;
        }

        while (index < diff.length)
        {
            System.out.println (diff[index]);
            index++;
        }
    }
}