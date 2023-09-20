package PepcodingLevel1.Getting_Pattern_Fun_Array;//inverted number  = digit replace by it's position
//Pepcoding : https://www.youtube.com/watch?v=O7PlWc9lOzg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=24

import java.util.*;
class InvertedNumber
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        int inv = 0;
        int op = 1;
        while (n != 0)
        {
            int od = n%10 ;
            int id = op;
            int ip = od;

            inv = inv + id * (int) Math.pow(10 , ip-1);
            n = n/10;
            op++;
        }
        System.out.println(inv);
    }
}