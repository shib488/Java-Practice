
public class reverse_a_number 
{
    public static void main(String[] args) 
    {
        int sum = 0; int temp = Integer.parseInt(args[0]);
        while (temp>0)
	    {
            sum = (sum*10) + (temp%10);
            temp /= 10;
        }
        System.out.printf("reverse of " + Integer.parseInt(args[0]) + " = " + sum);
        System.out.println();
    }
}
