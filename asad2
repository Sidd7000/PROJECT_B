import java.util.*;
class Spiral_Matrix
{
    static void main()
    {
        Scanner in =new Scanner(System.in);
        int n;
        System.out.println("Enter value of n : ");
        n=in.nextInt();
        int i,j,rf=0,rl=n-1,cf=0,cl=n-1,x=1;
        int a[][]=new int[n][n];
        while(x<n*n && rf<=rl && cf<=cl)
        {
            //Traverse the top row from left to right
            for(j=cf;j<=cl;j++)
            {
                a[rf][j]=x;
                x++;
            }
            rf++;
            //Traverse the right column from top to bottom
            for(i=rf;i<=rl;i++)
            {
                a[i][cl]=x;
                x++;
            }
            cl--;
            //Traverse the bottom row from right to left
            for(j=cl;j>=cf;j--)
            {
                a[rl][j]=x;
                x++;
            }
            rl--;
            //Traverse the left column from bottom to top
            for(i=rl;i>=rf;i--)
            {
                a[i][cf]=x;
                x++;
            }
            cf++;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
               System.out.print(a[i][j]+"\t");
            System.out.println();
   
        }
        
    }
}
