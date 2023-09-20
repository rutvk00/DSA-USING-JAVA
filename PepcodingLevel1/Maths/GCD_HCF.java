package PepcodingLevel1.Maths;
import java.util.*;
import java.io.*;

public class GCD_HCF {

    public static void main(String[] args)  throws Exception{
        System.out.println(gcd (9 , 18));
        System.out.println(lcm (2 , 7));
    }

    private static int lcm(int a, int b) {

        return a * b / gcd (a , b);
    }

    private static int gcd(int a, int b) {
        if (a == 0){
            return b;
        }

        return gcd (b%a , a);
    }


}
