


import java.util.Scanner;

public class delete_duplicate 
{	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);		
		int n,i,l;
		System.out.print("Enter no. of test case : ");
		n=s.nextInt();
		s.nextLine();
		while(n>0)
		{
			System.out.println();
			String a;
			System.out.print("Enter the string : ");
			a=s.nextLine();
			l = a.length();
	        int[] freq = new int[26];
	        for (i = 0; i < l; i++)
				freq[a.charAt(i) - 'a']++;
			System.out.print("alphabets which occurs only one time : ");
	        for (i = 0; i < l; i++) 
	        {
	            if (freq[a.charAt(i) - 'a'] == 1) 
	            {
	                System.out.print(a.charAt(i) +" ");
	                //System.out.print(freq[a.charAt(i) - 'a'] + " "); 
	                freq[a.charAt(i) - 'a'] = 0;
	            }
	        }
			n--;
			System.out.println("");
		}
		s.close();
	}
}
