//https://www.youtube.com/watch?v=7i41gZLXe5k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=31
package PepcodingLevel1.Recursion;
import java.util.*;

class MazePath
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> paths = getMazePath (1 , 1 , n , m );
        System.out.println (paths);
    }

    public static ArrayList<String> getMazePath (int src_r , int src_c , int dest_r , int dest_c)
    {
        if (src_r == dest_r && src_c == dest_c)
        {
            ArrayList<String> base = new ArrayList<String>();
            base.add ("");
            return base;
        }

        ArrayList<String> hpaths = new ArrayList<String> ();
        ArrayList<String> vpaths = new ArrayList<String> ();

        if (src_r < dest_r)
        {
            vpaths = getMazePath (src_r+1 , src_c , dest_r , dest_c);
        }
        if (src_c < dest_c)
        {
            hpaths = getMazePath (src_r , src_c+1 , dest_r , dest_c);
        }

        ArrayList<String> paths = new ArrayList<String> ();

        for (String path : hpaths)
        {
            paths.add ('H' + path);
        }

        for (String path : vpaths)
        {
            paths.add ('V' + path);
        }

        return paths;

    }
}
