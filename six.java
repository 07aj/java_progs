import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class six
{
  public static void main(String args[])
  { String s=" ";
     int i,j,m=0,o=0;
     int b[]=new int[9];
  /*123
    456
    789
  */
  /*after 90 deg rotation
    741
    852
    963
  */
  int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
for(j=0;j<3;j++)
{
  int k=2;
  for(i=0;i<3;i++)
  {
     b[m]=a[k][j];
     m++;
     k--;
  }
}
for(j=0;j<3;j++)
{
  for(i=0;i<3;i++)
  {
     a[j][i]=b[o];
     o++;
  }
}
for(j=0;j<3;j++)
{
  for(i=0;i<3;i++)
  {
    System.out.print(a[j][i]);
  }
  System.out.println("  ");
}
}
}
