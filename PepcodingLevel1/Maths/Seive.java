package PepcodingLevel1.Maths;
import java.util.*;
import java.io.*;
public class Seive {

    public static void main(String[] args) throws Exception {
        int n = 37;
        boolean [] prime = new boolean[n+1];
        seive (prime , n);
    }

    private static void seive(boolean[] prime, int n) {

        for (int i = 2; i * i <= n ; i++){
            if (!prime[i]){
                for (int j = 2*i ; j<=n ; j+=i){
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }

}
