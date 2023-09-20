package PepcodingLevel1.BitManipulation;
import java.util.*;
import java.io.*;
public class RangeXOR {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int ans = calculateXOR(b) ^ calculateXOR(a-1) ;
        System.out.println(ans);
    }

    private static int calculateXOR(int n) {
        int ans = 0;
        switch (n % 4){
            case 0 -> ans = n;
            case 1 -> ans = 1;
            case 2 -> ans = n+1;
            case 3 -> ans = 0;
        }
        return ans;
    }
}



// find Xor of number between a to b inclusive a and b