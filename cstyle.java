import java.util.Scanner;
import java.util.*;
class cstyle
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
    String s=sc.next();
    for(int i=s.length()-1;i>=0;i--)
    {
      System.out.println(s.charAt(i));
    }
}}
