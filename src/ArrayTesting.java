import java.util.Random;
import java.util.Scanner;

public class ArrayTesting
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[30];

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(50) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }

        System.out.println();

        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }

        average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        int searchVal = SafeInput.getRangedInt(in, "Enter a value to search for", 1, 50);
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == searchVal)
            {
                count++;
            }
        }

        System.out.println("The value " + searchVal + " was found " + count + " times in the array.");
        int findVal = SafeInput.getRangedInt(in, "Enter a value to find the first location of", 1, 20);
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == findVal)
            {
                System.out.println("The value " + findVal + " was found at array index " + i);
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("The value " + findVal + " was not found in the array.");
        }
    }
}
