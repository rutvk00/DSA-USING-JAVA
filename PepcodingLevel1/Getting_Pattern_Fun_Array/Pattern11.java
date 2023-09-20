package PepcodingLevel1.Getting_Pattern_Fun_Array;// Patten11  - https://www.youtube.com/watch?v=Yqq4GUPvWQM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=56

import java.util.*;
class Pattern11
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int val = 1;

        for (int i = 1 ; i<= n ; i++)
        {
          for (int j = 1 ; j<= i ; j++)
          {
              System.out.print(val+"\t");
              val++;
          }
            System.out.println();
        }

    }
}