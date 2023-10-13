import java.util.Scanner;
class Sparse
{
    public static void main(String [] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of M ");
        int m=sc.nextInt();
        System.out.println("Enter the size of N ");
        int n=sc.nextInt();
        int [][]a=new int[m][n];
        System.out.println("Enter the Numbers ");
        
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is  ");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("The Triplet format is - ");
        for (int i=0;i<a.length;i++)
            {
                 for (int j=0;j<a[0].length;j++)
                 {
                     if(a[i][j]!=0)
                     System.out.printf("'%d , %d '--> %d \n",i,j,a[i][j]);
                 }
            }

    }
}