import calculator.Calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Logarithm");
        System.out.println("4. Power");
        System.out.println("5. Exit");
        System.out.println("Select From the above Menu");

        int menu = scan.nextInt();
        while(menu != 5)
        {
            if(menu == 1)
            {
                System.out.println("Enter number");
                int x = scan.nextInt();
                System.out.println("Square root of " + x + " is: " + calculator.SquareRoot(x));
            }
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println("Select From the above Menu");
            menu = scan.nextInt();
        }
    }
}
