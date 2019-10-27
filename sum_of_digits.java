
public class sum_of_digits 
{
    public static void main(String[] args) 
    {
        int sum = 0,x=Integer.parseInt(args[0]);
        while (x>0)
	{
            sum += (x%10);
            x /= 10;
        }
        System.out.println("Sum of digits of "+Integer.parseInt(args[0])+" is " + sum);
    }
}
