package PepcodingLevel1.BitManipulation;
import java.util.*;
import java.io.*;

public class Power {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int base = Integer.parseInt(br.readLine());
        int power = Integer.parseInt(br.readLine());
        int ans = 1;
        while (power > 0){
            int digit = power & 1;
            if (digit == 1){
                ans *= base;
            }
            power = power >> 1;
            base = base * base;
        }
        System.out.println(ans);
    }

}
