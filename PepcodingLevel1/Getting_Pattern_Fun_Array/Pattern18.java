package PepcodingLevel1.Getting_Pattern_Fun_Array;//Pattern-18 : https://www.youtube.com/watch?v=y-b-8ddRFR4&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=70
import java.util.*;
class Pattern18
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        int str = n;
        int spc = 0;
        for (int i = 1 ; i<=n ; i++)
        {
            for (int j = 1 ; j<=spc ; j++)
            {
                System.out.print("\t");
            }
            for (int j = 1 ; j<=str ; j++)
            {
                if(i>1 && i<=n/2 && j>1 && j<str)
                {
                    System.out.print("\t");
                }else
                {
                    System.out.print("*\t");
                }
            }

            if (i <=n/2)
            {
                str-=2;
                spc++;
            }
            else {
                str+=2;
                spc--;
            }

            System.out.println();
        }
    }
}