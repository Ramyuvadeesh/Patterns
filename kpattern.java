//K pattern
class kpattern
{
    static void printpattern(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
           if(i==n-1)
           {
                
           }
           else
            System.out.println();
        }
        for(i=n-2;i>=1;i--)
        {
             for(j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
           
             System.out.println();
        }
    }
    public static void main(String[] args)
    {
        printpattern(10);
    }
}