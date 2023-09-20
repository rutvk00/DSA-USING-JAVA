package PepcodingLevel1.Getting_Pattern_Fun_Array;// Pattern - 7 : https://www.youtube.com/watch?v=ewBilX1an5A&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=48

import java.util.*;
class Pattern7
        {
            public static void main(String[] args) {
                Scanner scn = new Scanner (System.in);
                int n = scn.nextInt();

                for (int i = 1 ; i<=n ; i++)
                {
//                    for (int j = 1 ; j<i ; j++)
//                    {
//                        System.out.print("\t");
//                    }
//                    System.out.println("*\t");
                    for (int j = 1 ; j<= n ; j++)
                    {
                        if (i == j)
                        {
                            System.out.print("*\t");
                        }
                        else
                        {
                            System.out.print("\t");
                        }
                    }
                    System.out.println();
                }
            }
        }