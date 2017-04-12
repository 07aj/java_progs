import java.util.Scanner;
import java.util.*;
class rem_mul_char
{
  int k=0;
  public  static String a[];
  public void removeit(String s)
  {
    LinkedHashSet<Character> hl=new LinkedHashSet<>();
     String s1=" ";
    for(int i=0;i<s.length();i++)
    {
      hl.add(s.charAt(i));
    }
       for(Character ch: hl)
       s1+=ch;
       a[k]=s1;
       k++;
    }

  public static void main(String args[])
  {
    rem_mul_char ob=new rem_mul_char();

    Scanner sc=new Scanner(System.in);
    int n,i,j;
    n=sc.nextInt();
    a=new String[n];
    for(i=0;i<n;i++)
    {
       String s=sc.next();
           ob.removeit(s);
         }
         for(i=0;i<a.length;i++)
         {
           System.out.println(a[i]);
         }
       }
  }
