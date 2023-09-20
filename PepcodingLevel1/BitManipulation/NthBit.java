package PepcodingLevel1.BitManipulation;
import java.util.*;
import java.io.*;
public class NthBit {

    public static void main(String[] args)  throws Exception{
//        Scanner scn = new Scanner (System.in);
//        int n = scn.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int number = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int ans = (number >> n-1) & 1;

        System.out.println(ans  );
    }
}
