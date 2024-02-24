import java.util.Scanner;

public class CtoF_FtoC
{
    public static void main(String[] args)
    {
        boolean done = false; //boolean variable control while loop
        double tempC = 0; //variable for C temp
        double tempF = 0; //variable for F temp
        String unit = ""; //variable for unit

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Enter the unit of your temperature(C or F): ");

            if (userInput.hasNextLine()) //tests if input is a string
            {
                unit = userInput.nextLine(); //stores unit
                if (unit.equals("F") || unit.equals("C"))
                {
                    done = true;
                }
                else
                {
                    System.out.println("Not a valid unit");
                }
            }
            else
            {
                System.out.println("Not a valid unit");
            }
        }
        while (!done);

        done = false; //resets boolean to false
        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Enter a temperature in your chosen unit: ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                if (unit.equals("F"))
                {
                    tempF = userInput.nextDouble();
                }
                else
                {
                    tempC = userInput.nextDouble();
                }
                done = true;
            }
            else
            {
                System.out.println("Not a valid temperature");
            }
        }
        while (!done);

        if (unit.equals("F")) //checks unit of known temp
        {
            tempC = (tempF - 32) / 1.8;

            System.out.printf("The entered temperature in Celsius is %.2f C", tempC);
        }
        else
        {
            tempF = (tempC * 1.8) + 32;

            System.out.printf("The entered temperature in Fahrenheit is %.2f F", tempF);
        }
    }
}