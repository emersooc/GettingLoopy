public class GettingLoopy
{
    public static void main(String[] args)
    {
        int counter; //declaring counter variable

        for (counter = 1; counter <= 30; counter++)
        {
            System.out.println(counter); //prints during each iteration
        }

        for (counter = 30; counter >= 0; counter--)
        {
            System.out.println(counter); //prints during each iteration
        }

        for (counter = 0; counter <=18; counter = counter + 3)
        {
            System.out.println(counter); //prints during each iteration
        }

        for (counter = 10; counter >=0; counter = counter - 2)
        {
            System.out.println(counter); //prints during each iteration
        }
    }
}