import java.io.*;
import java.util.*;
class testequali
{
  public static void main(String args[])
  {
    int a[]=new int[27];
int[] al;
    int i,b,c=0,q=0,k=0;
  String s="xxxxxxxxxxxxyyzz";
  for(i=0;i<s.length();i++)
  {
    b=(int)s.charAt(i);

     b=b-97;

      if(a[b]==0){
       k++;
      a[b]=1;
    }
      else
      {
        ++a[b];
      }
  }
  al=new int[k];
  //new ArrayList to add only non blank numbers
for(i=0;i<26;i++)
{
  if(a[i]!=0)
  {
  al[q]=a[i];
    q++;
}
}
    for(i=0;i<al.length-1;i++)
  {
    int z=al[i]-al[i+1];
    int z1=al[i+1]-al[i];
    //System.out.println(z+"......."+z1);
if(al[i]!=al[i+1])
{
  if(z==1 || z1==-1)
  {
    c++;
  }
  else{
    c=10;
    break;
  }
  }
}
  if(c<=1)
  {
  System.out.println("yes");
}
  else
  System.out.println("No");
  }
}
