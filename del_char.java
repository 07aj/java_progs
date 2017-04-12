//this program is used to delete multiple occurence of char consecutively
import java.util.Scanner;
class del_char
{
  public static void main(String args[])
  {int i;
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String s1="";
    for(i=0;i<s.length()-1;i++)
    {
      if(s.charAt(i)!=s.charAt(i+1))
      {
                 s1+=s.charAt(i);
      }
    }
    s1=s1+s.charAt(s.length()-1);
    System.out.println(s1);
  }
}
