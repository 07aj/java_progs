import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class four
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
    String s=sc.next();
    System.out.println("enter the second name");
    String s1=sc.next();
     char[] a=s.toCharArray();
     char[] a1=s1.toCharArray();
     Arrays.sort(a);
     Arrays.sort(a1);
    if(Arrays.equals(a,a1)==true)
    System.out.println("Anagram");
    else
    System.out.println("Not Anagram");
  }
}
