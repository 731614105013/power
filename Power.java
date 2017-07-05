# power
import java.io.*;
import java.util.*;
import java.lang.*;
public class Power
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,i;
    int a;
    n=sc.nextInt();
    i=sc.nextInt();
    a=Math.pow(n,i);
    System.out.println("Power of numbers:"+a);
  }
}  
