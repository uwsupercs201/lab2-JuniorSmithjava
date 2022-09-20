import java.util.Scanner;
public class Lab2_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of seconds (integer): ");
        int seconds = input.nextInt();
        // Just follows the implementation tips because the rounded values will compute out to show the right one
        int minutes = seconds/60;
        int seconds2 = seconds - minutes*60;
        int hours = minutes/60;
        minutes -= hours*60;
        int days = hours/24;

        hours -= days*24;

        int weeks = days/7;

        days -= weeks*7;
        // I wanted my output to be grammatically correct when there is one of a value, so I am adding some more variables
        String strSeconds = " seconds is ";  //these are the default values for the Strings
        String strSeconds2 = " seconds.";
        String strMinutes = " minutes, ";
        String strHours = " hours, ";
        String strDays = " days, ";
        String strWeeks = " weeks, ";
        if (seconds == 1) // if there is only one, it changes the string to a singular quantity
        {
            strSeconds = " second is ";
        }
        if (seconds2 == 1)
        {
            strSeconds2 = " second.";
        }

        if (minutes == 1)
        {
            strMinutes = " minute, ";
        }

        if (hours == 1)
        {
            strHours = " hour, ";
        }

        if (days == 1)
        {
            strDays = " day, ";
        }

        if (weeks == 1)
        {
            strWeeks = " week, ";
        }

        // really long concatinations of strings and/or values that prints the intended result
        System.out.println("\n" + seconds + strSeconds + weeks + strWeeks + days + strDays + hours + strHours + minutes + strMinutes + seconds2 + strSeconds2);


    }
}
