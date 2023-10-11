class A
{
    int ar[][],add,c;
    void init(int a[][])
    {
        ar=a;
    }
    void display()
    {
        for (int i=0;i<3;i++)
        for (int j=0;j<3;j++)
        {
            if(i==j)
            {
                add=add+ar[i][j];
            }
        }
        System.out.println("The addition of left diagonal is = "+add);
        add=0;
        for (int k=0;k<3;k++)
        for (int l=0;l<3;l++)
        {
            c=k+l;
            if(c==2)
            {
                add=add+ar[k][l];
            }
        }
        System.out.println("The addition of right diagonal is = "+add);
        
        
    }
}
class Matrix
{
    public static void main(String[] args)
    {
        A obj=new A();
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        obj.init(a);
        obj.display();
    }
}