package PepcodingLevel1.Getting_Pattern_Fun_Array;// Pattern-15 : https://www.youtube.com/watch?v=lKhGlVXdD2c&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=64

import java.util.*;
class Pattern15
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int spc = n/2;
        int str = 1;

        int val = 1  ;
        for (int i = 1 ; i<=n ; i++)
        {

            for (int j = 1; j<=spc ; j++)
            {
                System.out.print("\t");
            }
            int cval = val;
            for(int j =1 ; j<=str ; j++)
            {
                System.out.print(cval +"\t");
                if (j <= str/2)
                {
                    cval++;
                }
                else
                {
                    cval--;
                }
            }
            if (i<= n/2)
            {
                spc--;
                str += 2;
                val++;
            }
            else {
                spc++;
                str -= 2;
                val--;
            }
            System.out.println();
        }
    }
}