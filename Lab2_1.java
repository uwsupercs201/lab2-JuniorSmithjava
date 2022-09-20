import java.util.Scanner;
public class Lab2_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // I could have written a method for this since it is mostly copy-paste but I think this would be faster to run
        // and it is simpler so I just wrote it like this. Maybe if we were doing a lot of points
        System.out.print("Enter the x-coordinate of point 1: ");
        double x1 = input.nextDouble();
        System.out.print("\nEnter the y-coordinate of point 1: ");
        double y1 = input.nextDouble();
        System.out.print("\nEnter the z-coordinate of point 1: ");
        double z1 = input.nextDouble();
        System.out.print("\nEnter the x-coordinate of point 2: ");
        double x2 = input.nextDouble();
        System.out.print("\nEnter the y-coordinate of point 2: ");
        double y2 = input.nextDouble();
        System.out.print("\nEnter the z-coordinate of point 2: ");
        double z2 = input.nextDouble();
        double solution = Math.pow((Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2) + Math.pow((z1-z2), 2)), .5);
        int solutionInt = (int) solution; //converting the double to int so it can be stored in an int variable
        double solutionDouble = solution - solutionInt; //removing the int so that it can represent just the fractional
        System.out.println("\nThe distance between point 1 and point 2 is: " + solution);
        System.out.println("The integer part of the distance between point 1 and 2 is: " + solutionInt);
        System.out.println("The fractional part of the distance between point 1 and 2 is: " + solutionDouble);
    }

}
