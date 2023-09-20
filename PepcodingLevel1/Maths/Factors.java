package PepcodingLevel1.Maths;
import java.util.*;
import java.io.*;
public class Factors {
    public static void main(String[] args) throws Exception {
        int n = 20;
        factor1 (n);
    }

    private static void factor(int n) {
        for (int i = 1 ; i*i <= n ; i++){
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    private static void factor1(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1 ; i*i <= n ; i++){
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
