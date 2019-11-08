package exercises.DataTypes;

import java.util.Scanner;

public class MilesPerGallons {

    public static void main(String [] args) {

        double miles;
        double gallons;
        double milesPerGallons;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of miles driven:");
        miles = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please input the amount of gas consumed:");
        gallons = input2.nextDouble();
        milesPerGallons = (miles / gallons);
        System.out.println("The Miles per Gallon is:" +  milesPerGallons );

    }
}
