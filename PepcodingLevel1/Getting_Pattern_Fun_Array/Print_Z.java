package PepcodingLevel1.Getting_Pattern_Fun_Array;

class Print_Z
{
    public static void main (String []args)
    {
        int n = 5 ;
        int i = 1 ;
        System.out.println("*****");
        while (i<n-1)
        {
           int j = 0 ;
            while(j < n - i -1)
            {
                System.out.print(" ");
                j++;
            }
            System.out.print("*");
            while(j<n-1)
            {
                System.out.print(" ");
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println("*****");
    }
}