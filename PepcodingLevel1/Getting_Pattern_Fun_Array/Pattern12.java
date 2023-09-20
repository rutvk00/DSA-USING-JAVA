package PepcodingLevel1.Getting_Pattern_Fun_Array;// pattern 12 : https://www.youtube.com/watch?v=XzIM_xS9bgM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=58

import java.util.*;
class Pattern12
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1 ; i<=n ; i++)
        {
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(a + "\t");
                int c = a+b;
                b = a;
                a = c;
            }
            System.out.println();
        }
    }
}