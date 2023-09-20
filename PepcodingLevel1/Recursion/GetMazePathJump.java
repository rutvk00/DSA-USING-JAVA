//https://www.youtube.com/watch?v=VaGBRiSdtFI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=33

package PepcodingLevel1.Recursion;
import java.util.*;

class MazePathJump
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> paths = getMazePathWithJump (1 , 1 , n, m);
        System.out.println (paths);
    }

    public static ArrayList<String> getMazePathWithJump (int src_r ,int src_c , int dest_r , int dest_c)
    {
        if (src_r == dest_r && src_c == dest_c)
        {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        ArrayList<String> paths = new ArrayList<String>();
        for (int ms = 1 ; ms <= dest_c - src_c ; ms++)
        {
            ArrayList<String> hpaths = getMazePathWithJump (src_r , src_c + ms , dest_r , dest_c);

            for (String path : hpaths)
            {
                paths.add ("H" + ms +path);
            }
        }
        for (int ms = 1 ; ms <= dest_r - src_r ; ms++)
        {
            ArrayList<String> vpaths = getMazePathWithJump (src_r + ms , src_c  , dest_r , dest_c);

            for (String path : vpaths)
            {
                paths.add ("V" + ms +path);
            }
        }
        for (int ms = 1 ; ms <= dest_c - src_c && ms <= dest_r - src_r; ms++)
        {
            ArrayList<String> dpaths = getMazePathWithJump (src_r+ms , src_c + ms , dest_r , dest_c);

            for (String path : dpaths)
            {
                paths.add ("D" + ms +path);
            }
        }
        return paths;
    }
}
