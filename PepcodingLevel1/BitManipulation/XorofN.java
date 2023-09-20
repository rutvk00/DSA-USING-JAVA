package PepcodingLevel1.BitManipulation;
import java.util.*;
import java.io.*;
public class XorofN {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt(br.readLine());

        int mod = N % 4;

        switch (mod) {
            case 0 -> System.out.println(N);
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(N + 1);
            case 3 -> System.out.println(0);
        }
    }
}
/*
0 ---> 0^0 = 0 ---> N ----> N%4 == 0
1 ---> 0^1 = 1 ---> 1 ----> N%4 == 1
2 ---> 0^1^2 = 3 ---> N+1 ----> N%4 == 2
3 ---> 0^1^2^3 = 0 ---> 0 ----> N%4 == 3
4 ---> 0^1^2^3^4 = 4 ---> N ---> N%4 == 0
5 ---> 0^1^2^3^4^5 = 1 ---> 1 ---> N%4 == 1
repeat this pattern


 */