//https://www.youtube.com/watch?v=hMJAlbJIS7E&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=29

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class GetStairPath
{
    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        ArrayList<String> path = getPath (n);
        System.out.println (path);
    }

    public static ArrayList<String> getPath (int n)
    {
        if (n == 0)
        {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        if (n < 0)
        {
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }

        ArrayList<String> path1 = getPath(n-1);
        ArrayList<String> path2 = getPath(n-2);
        ArrayList<String> path3 = getPath(n-3);

        ArrayList<String> paths = new ArrayList<String> ();

        for(String path : path1)
        {
            paths.add(1 + path);
        }
        for(String path : path2)
        {
            paths.add(2 + path);
        }
        for(String path : path3)
        {
            paths.add(3 + path);
        }

        return paths;
    }
}