//1,2,3,4,5
//6
//1,2,3   .....    2,4  =6
import java.io.*;
import java.util.Arrays;
class combsum
{
  public static void main(String args[])
  { int sum;
    String save=" ",save1=" ";
    int[] a={1,5,4,3,2};
    Arrays.sort(a);
    int i,j;
    for(i=0;i<4;i++)
    { sum=a[i];//2
      save1=save1.concat(Integer.toString(a[i]));//2
      //System.out.println(save);
      for(j=i+1;j<5;j++)//3....4
      { 
        save1=save1.concat(Integer.toString(a[j]));//23.....234.....24
        //System.out.println(save);
        sum+=a[j];
        if(sum==6)
        {
          System.out.println("yes entered");
        save=save1+"  ";
        save1=" ";
        sum=a[i];
         break;
      }
      if(sum>6){
         sum=a[i];
         save1=Integer.toString(a[i]);//2

      }
      }
    }
    System.out.println(save);
  }
}
