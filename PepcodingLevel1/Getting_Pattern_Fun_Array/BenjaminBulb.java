package PepcodingLevel1.Getting_Pattern_Fun_Array;//https://www.youtube.com/watch?v=7IbWTFOUP1U&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=34
import java.util.*;
class BenjaminBulb
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1 ; i*i <= n ; i++)
        {
            System.out.println(i*i);
        }
    }
}