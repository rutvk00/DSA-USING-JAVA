package PepcodingLevel1.Getting_Pattern_Fun_Array;// Given three integers We have to find that right angle triangle possible or not ?
//https://www.youtube.com/watch?v=w4bRrZCEz6o&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=32

import java.util.*;
class PythagorenTriplet
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int max = n1 ;
        if (n2 >= max)
            max = n2;
        if (n3 >= max)
            max = n3;

        if(n1 == max)
        {
            boolean flag = ((n3*n3) + (n2*n2) == (n1*n1));
            System.out.println (flag);

        }
        else if(n2 == max)
        {
            boolean flag = ((n3*n3) + (n1*n1) == (n2*n2));
            System.out.println (flag);
        }
        else
        {
            boolean flag = ((n1*n1) + (n2*n2) == (n3*n3));
            System.out.println (flag);
        }
    }
}