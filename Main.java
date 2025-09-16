import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int numOfNums;
        double number1;
        double number2;
        System.out.println("How many random numbers do you want to see (must be at least 1)?");
        numOfNums = scan.nextInt();
        printRandom3(numOfNums);

        double slope = calcSlope (0,1,1,0);
        System.out.println ( "The slope is " + slope);

         System.out.println("enter a double");
        number1 = scan.nextDouble();
         System.out.println("enter a double");
        number2 = scan.nextDouble();
         System.out.println("distance = " + roundedDist(number1, number2));
    }
    
    public static void printRandom3(int num)
    {
        // Do problem 1 here
        int lowerBound = 2; 
        int upperBound = num + 2; 
        System.out.println( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound));
        System.out.println( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound));
        System.out.println( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound));
    }
    
    public static double calcSlope(double x1, double y1, double x2, double y2)
    {
        // Do problem 2 here; replace code below
        
        double slope = (y2-y1)/(x2-x1);

        return slope;
    }
    
    public static int roundedDist(double a, double b)
    {
        int rounded = (int)(Math.round(Math.abs(a - b)));

        return rounded;
    }
}
