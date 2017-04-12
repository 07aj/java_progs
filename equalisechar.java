import java.util.*;
class equalisechar
{
  public static void main(String args[])
  {  int i,k=0;

    String s="xxxyyzz",q=" ";
    HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
    for(i=0;i<s.length();i++)
    {
      if(hmap.get(s.charAt(i))!=null){
        int num=hmap.get(s.charAt(i));
      hmap.put(s.charAt(i),++num);}
      else{hmap.put(s.charAt(i),1);}
//hash map done
    }
      for(Map.Entry m:hmap.entrySet())
      {
        /*if(m.getValue()-(Integer)(hmap.higherEntry(m.getValue()))==1 || (hmap.higherEntry(m.getValue())-m.getValue())==1)
        {
        k++;
        }
      }
      if(k==1)
      q="yes";
      else
      q="no";
      System.out.println(q);
  }*/
 System.out.println(m.getKey()+"....."+m.getValue()+"....");
}
}
}
