import java.util.Scanner;

public class tempratureConversion
{
    
    float f2c (float x) 
    {
        return (5*(x-32))/9;
    }

    float c2f (float y) 
    {
        return ((float)(y*1.8)+32);
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        tempratureConversion t = new tempratureConversion();
        System.out.printf("0. Quit.\n1. Fahrenhite to Celcius.\n2. Celcius to Fahrenhite.\n");
        System.out.printf("Enter your choice: ");
        int option = scan.nextInt();
        while (option != 0) 
	{
            switch (option) 
	    {
                case 1:
                    System.out.printf("Enter temp in Fahrenhite: ");
                    float x = scan.nextFloat();
                    System.out.println(x + " in Celcius is = " + t.f2c(x));
                    break;
                case 2:
                    System.out.printf("Enter temp in Celcius: ");
                    float y = scan.nextFloat();
                    System.out.println(y + " in Fahrenhite is = " + t.c2f(y));
                    break;
                default:
                    System.out.println("Invalid option selected. Please enter your choice again !!!");
            }
            System.out.printf("Enter your choice: ");
            option = scan.nextInt();
        }
        scan.close();
    }
}
