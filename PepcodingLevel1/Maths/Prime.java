package PepcodingLevel1.Maths;
import java.util.*;
import java.io.*;

public class Prime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++; 
        }
        return true;
    }
}
