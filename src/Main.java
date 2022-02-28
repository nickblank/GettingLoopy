public class Main
{

    public static void main(String[] args)
    {
        for(int i = 0; i <= 30; i++)
        {
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------------------------------");
        for(int i = 30; i >= 0; i--)
        {
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------------------------------");
        for(int i = 0; i <= 18; i = i +3)
        {
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------------------------------");
        for(int i = 10; i >= 0; i = i - 2)
        {
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------------------------------");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= (-1 * i + 6); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 18; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++)
        {
            for (int space = 1; space <= (i * -2 + 70); space = space + 10)
            {
                System.out.print(" ");
            }
                for (int j = 1; j <= 3; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
