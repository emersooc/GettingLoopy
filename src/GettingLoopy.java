public class GettingLoopy
{
    public static void main(String[] args)
    {
        int counter; //declaring counter variable

        //A1
        for (counter = 1; counter <= 30; counter++)
        {
            System.out.println(counter); //prints during each iteration
        }

        //A2
        for (counter = 30; counter >= 0; counter--)
        {
            System.out.println(counter); //prints during each iteration
        }

        //A3
        for (counter = 0; counter <=18; counter = counter + 3)
        {
            System.out.println(counter); //prints during each iteration
        }

        //A4
        for (counter = 10; counter >=0; counter = counter - 2)
        {
            System.out.println(counter); //prints during each iteration
        }


        int starCounter; //variable for producing star pattern

        //B5
        for (counter = 1; counter <= 5; counter++)
        {
            for (starCounter = 1; starCounter <= counter; starCounter++)
            {
                System.out.print("*");
            }
            System.out.println(); //starts new line
        }

        //B6
        for (counter = 1; counter <= 5; counter++)
        {
            for (starCounter = 5; starCounter >= counter; starCounter--)
            {
                System.out.print("*");
            }
            System.out.println(); //starts new line
        }

        //B7
        for (counter = 1; counter <= 5; counter++)
        {
            for (starCounter = 5; starCounter >= 1; starCounter--)
            {
                System.out.print("*");
            }
            System.out.println(); //starts new line
        }
    }
}