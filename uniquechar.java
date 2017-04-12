import java.util.Scanner;
import java.util.*;
class uniquechar
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
    String s=sc.next();
    HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
    for(int i=0;i<s.length();i++)
    {
      if(hmap.get(s.charAt(i))!= null)
      {
        System.out.print("not unique char string");
        break;
      }
      else
      {
        hmap.put(s.charAt(i),1);
      }
      if(i==s.length()-1)
      {
        System.out.println("unique string");
      }
    }

  }
}
