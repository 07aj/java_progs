import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class seven
{
  public static void main(String args[])
  { String s=" ";
     int i,j,k,m=0,o=0;
       int[] row=new int[3];
     int[] col=new int[3];
    /*123
    456
    789
  */
  /*after 90 deg rotation
    741
    852
    963
  */
  int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,0}};
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      if(a[i][j]==0)
      {
      row[i]=1;
      col[i]=1;
      }
     }
   }

  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      if(row[i]==1||col[j]==1)
      {
        a[i][j]=0;
      }
    }
  }
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      System.out.print(a[i][j]+"  ");
    }
    System.out.println("  ");
  }
}
}
