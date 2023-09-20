package PepcodingLevel1.Maths;
import java.util.*;
import java.io.*;
public class NewtonSQRT {
    public static void main(String[] args) throws Exception{
        int n = 40;
        System.out.println(sqrt(n));
    }

    private static double sqrt(int n) {

        double root;
        double x = n;

        while (true){

            root = 0.5 * (x + (n/x));          // formula for newton square root
            if (Math.abs (root - x) < 0.5){    // check precision error
                break;
            }
            x = root;
        }
        return root;
    }
}
