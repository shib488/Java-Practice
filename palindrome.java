
public class palindrome 
{
    public static void main(String[] args) 
    {
        int sum = 0; 
	    int temp = Integer.parseInt(args[0]);
        while (temp>0)
	    {
            sum = (sum*10) + (temp%10);
            temp /= 10;
        }
        if (Integer.parseInt(args[0]) == sum) 
            System.out.println(Integer.parseInt(args[0]) + " is palindrome.");
        else
            System.out.println(Integer.parseInt(args[0]) + " is NOT palindrome.");
    }
}
