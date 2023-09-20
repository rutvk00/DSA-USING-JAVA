package PepcodingLevel1.Getting_Pattern_Fun_Array;// Remove Prime element from Arraylist
//https://www.youtube.com/watch?v=jj90JZ_wLoo&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=6

import java.util.*;
import java.io.*;

class RemovePrimeArrayList
{
    public static boolean isPrime (int val)
    {


        for (int i = 2 ; i*i <= val ; i++)
        {
            if (val % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void solution (ArrayList <Integer> a1)
    {
        for (int i = a1.size()-1 ; i>=0 ; i--)
        {
            int val = a1.get(i);
            if (isPrime(val) == true)
            {
                a1.remove(i);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        ArrayList <Integer> a1 = new ArrayList<>();

        for (int i =0 ;i<n ; i++)
        {
            a1.add(scn.nextInt());
        }

        solution(a1);
        System.out.println (a1);

    }
}