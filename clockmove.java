import java.io.*;
class cloclmove //this program is to check if two strings are rotated clockwise or not
{
  public static void main(String args[])
  {
    String a="amazon";
    String b="azonanb";
    int l=a.length();
    if(l%2==0)
    {
      //anti
      String s=a.substring(l-2);//on remove
      String s1=a.substring(l-2,l);//on
      s1=s1+s;
      //clockwise
      String s2=a.substring(2,l);//am remove
      String s3=a.substring(0,2);//am
      s2=s2+s3;
      //check
      if(s1.equals(b) || s2.equals(b))
      {
        System.out.println("s1"+s1+"s2"+s2+"...."+"yes");
      }
      else System.out.println("s1"+s1+"s2"+s2+"...."+"no");
    }
    else
        System.out.println("no");
  }
}
