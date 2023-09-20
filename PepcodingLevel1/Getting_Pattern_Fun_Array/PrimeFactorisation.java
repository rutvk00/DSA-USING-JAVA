package PepcodingLevel1.Getting_Pattern_Fun_Array;//Print all Prime factors
//https://www.youtube.com/watch?v=5gFC-ayyQMk&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=30

import java.util.*;
class PrimeFactorisation
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        for (int div = 2 ; div*div <= n ; div++)
        {
            while (n % div == 0)
            {
                n = n / div ;
                System.out.println (div);
            }
        }

        if (n != 1)
                System.out.println(n);
    }
}