import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

class five
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
    String s=sc.nextLine();
    String s2=s.replace(" ","%20");
    System.out.println(s2);
  }
}
