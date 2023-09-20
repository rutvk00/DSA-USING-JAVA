package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;
public class Skip {
    public static void main(String[] args)  throws Exception{
        skip ("" , "baccddaf");
    }

    public static void skip(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip (p , up.substring(1));
        }else{
            skip (p + ch , up.substring(1));
        }
    }
}
