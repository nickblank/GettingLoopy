import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        boolean again = false;
        int tempC;
        int tempF;
        String yn = "";

        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (userIn.hasNextInt())
            {
                tempC = userIn.nextInt();
                tempF = tempC*9/5+32;

                System.out.println("The temperature " + tempC + "C, is now " + tempF + "F.");
            }
            else
            {
                System.out.println("The number you have entered is not allowed.");
            }
            System.out.print("Would you like to continue?(y/n): ");
            yn = userIn.next();
            if(yn.equalsIgnoreCase("n"))
            {
                again = true;
            }
        }while(!again);
    }
}
