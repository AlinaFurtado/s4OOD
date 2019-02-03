public class pattern
{
    public static void main(String args[])
    {
        int n=5;int i,j;
        int space;
        for(i=1;i<=n;i++)
        {
            for(space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            j=0;
            while(j!=(2*i-1))
            {
                if(j==0||j==(2*i-2))
                {
                    System.out.print(" 1");
                }
                else
                {
                    System.out.print(" ");
                }j=j+1;
                
            }
            j=0;
            System.out.println();
        }n=n-1;
        for(i=n;i>=1;i--)
        {
            for(space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }j=0;
            while(j!=(2*i-1))
            {
                if(j==0||j==(2*i-2))
                {
                    System.out.print(" 1");
                }
                else
                {
                    System.out.print(" ");
                }
                j=j+1;
            }System.out.println();
            j=0;
        }
    }    
}
