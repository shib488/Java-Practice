//package test_1;

import java.util.Arrays;
import java.util.Scanner;

public class lapindrome {
	public static String sort(String i)
    {
        char t[] = i.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
	public static void main(String args[])
	{
		//lapindrome p=new lapindrome();
		Scanner s=new Scanner(System.in);
		int t;
		System.out.print("Enter no. of test case : ");
		t=s.nextInt();
		s.nextLine();
		while(t>0)
		{
			System.out.println();
			String a,b,c;
			System.out.print("Enter the string : ");
			a=s.nextLine();
			int l=a.length();
			if(l%2==0)
			{
				b=a.substring(0,l/2);
				c=a.substring(l/2, l);
			}
			else
			{
				b=a.substring(0,l/2);
				c=a.substring((l/2)+1, l);
			}
			b=sort(b);
			c=sort(c);
			if(b.compareTo(c)==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("no");
			}
			t--;
		}	
		s.close();
	}

}