package ControlStatement;

import java.util.Scanner;

/**
 * Created by Splayd on 23.11.2016.
 */
public class Radius {

    final private static double PI = 3.14;
    private double radius;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of first circle radius: ");
        double radius1 = scanner.nextDouble();
        System.out.println("Enter value of second circle radius: ");
        double radius2 = scanner.nextDouble();
        scanner.close();

        Radius countRadius1 = new Radius(radius1);
        countRadius1.plowa();
        Radius countRadius2 = new Radius(radius2);
        countRadius2.plowa();
        
        System.out.println("Radius of first circle is: " + countRadius1.getRadius());
        System.out.println("Radius of second circle is: " + countRadius2.getRadius());
    }

    public Radius (Double radius) {
        this.radius = radius;
    }
    
    public double plowa(){
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

}
