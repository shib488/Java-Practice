/*
 *  frequency of each letter in string 
 */

public class frequency {

	public static void main(String[] args)
    {
        //System.out.print(args[0]);
        String s="";
        for(int i=0;i<args.length;i++)
            s=s+args[i];
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++)
            freq[s.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) 
        {
            if (freq[s.charAt(i) - 'a'] != 0) 
            {
                System.out.println(s.charAt(i)+" occurs "+freq[s.charAt(i) - 'a'] + " times"); 
                freq[s.charAt(i) - 'a'] = 0;
            }
        }
        
    }
}
