package exercises.DataTypes;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String [] args) {

        double length;
        double width;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input length of the rectangle:");
        length = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please input width of the rectangle:");
        width = input2.nextDouble();
        area = (length * width);
        System.out.println("The area of the rectangle is:" +  area );

    }
}
