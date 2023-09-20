package PepcodingLevel1.Getting_Pattern_Fun_Array;//https://www.youtube.com/watch?v=hGWoXqF1qC8&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=44

import java.util.*;

class Pattern5
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        int spc = n/2;
        int str = 1 ;

        for(int i = 1; i<=n ; i++)
        {
            for (int j = 1 ; j<=spc ; j++)
                System.out.print ("\t");

            for (int j = 1 ; j<=str ; j++)
                System.out.print ("*\t");
            if (i <= n/2)
            {
                spc--;
                str += 2;
            }
            else
            {
                str -= 2;
                spc++;
            }
            System.out.println ();
        }
    }
}