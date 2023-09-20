package PepcodingLevel1.BitManipulation;
import java.io.*;

public class SetBits {
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
//
//        while (n > 0){
//            count++;
//            n -= (n & -n);
//        }
//        return count;

        while (n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
