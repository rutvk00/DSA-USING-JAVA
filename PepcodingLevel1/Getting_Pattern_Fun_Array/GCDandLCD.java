package PepcodingLevel1.Getting_Pattern_Fun_Array;// GCD ANd LCM
//https://www.youtube.com/watch?v=ZtDeDD1VYLk&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=28
import java.util.*;
class GCDandLCD
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
         int on1 = scn.nextInt();
         int on2 = scn.nextInt();
         int n1 = on1;
         int n2 = on2;
         // GCD
        while (n1 % n2 != 0)
        {
            int rem = n1 % n2 ;
            n1 = n2 ;
            n2 = rem;
        }

        int GCD = n2 ;
        // LCM

        int LCM = (on1 * on2)/ GCD;

        System.out.println ("GCD of "+on1+"and "+on2+" is :"+GCD+" and LCD is :"+ LCM);

    }
}