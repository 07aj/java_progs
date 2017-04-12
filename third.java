import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class third
{
  public static void main(String args[])
  { int i,j,k=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
    String s=sc.next();
    TreeMap<Character,Integer> hmap=new TreeMap<Character,Integer>();
    for(i=0;i<s.length();i++)
    {
      if(hmap.get(s.charAt(i))==null)
      {
        hmap.put(s.charAt(i),1);
      }
    }
    for(Map.Entry m:hmap.entrySet())
    {
      System.out.print(m.getKey());
    }
  }
}
