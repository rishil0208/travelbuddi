public class v {
    
}
// You are using Java
import java.util.*;

class in
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] l=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                l[i][j]=sc.nextInt();
            }
        }
        int inserttype=sc.nextInt();
        int insertindex=sc.nextInt();
        int[][] l1;
        if(inserttype==0)
        {
            l1=new int[a+1][b];
            for(int i=0;i<insertindex;i++)
            {
                for(int j=0;j<b;j++)
                {
                    l1[i][j]=l[i][j];
                }
            }
            for(int j=0;j<b;j++)
            {
                l1[insertindex][j]=sc.nextInt();
            }
            for(int i=insertindex;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    l1[i+1][j]=l[i][j];
                }
            }
        }
        else
        {
            l1=new int[a][b+1];
            int[] newcol= new int[a];
            for(int i=0;i<a;i++)
                newcol[i]=sc.nextInt();
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<insertindex;j++)
                {
                    l1[i][j]=l[i][j];
                }
                l1[i][insertindex]=newcol[i];
                for(int j=insertindex;j<b;j++)
                {
                    l1[i][j+1]=l[i][j];
                }
            }
        }
        System.out.println("After insertion");
        for(int i=0;i<l1.length;i++)
        {
            for(int j=0;j<l1[0].length;j++)
            {
                System.out.print(l1[i][j]+" ");
            }
            System.out.println();
        }
        int delt=sc.nextInt();
        int deli=sc.nextInt();
        int[][] af;
        if(delt==0)
        {
            af = new int[l1.length-1][l1[0].length];
            int ni=0;
            for(int i=0;i<l1.length;i++)
            {
                if(i==deli)
                {
                    continue;
                }
                for(int j=0;j<l1[0].length;j++)
                {
                    af[ni][j]=l1[i][j];
                }
                ni++;
            }
        }
        else
        {
            af = new int[l1.length][l1[0].length-1];
            
            for(int i=0;i<l1.length;i++)
            {
                int nj=0;
                for(int j=0;j<l1[0].length;j++)
                {
                    if(j==deli)
                        continue;
                    af[i][nj]=l1[i][j];
                    nj++;
                }
            }
        }
        System.out.println("After deletion");
        for(int i=0;i<af.length;i++)
        {
            for(int j=0;j<af[0].length;j++)
            {
                System.out.print(af[i][j]+" ");
            }
            System.out.println();
        }
    }
}
