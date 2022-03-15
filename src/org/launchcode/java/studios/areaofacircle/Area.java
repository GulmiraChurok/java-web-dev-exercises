package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number for radius");
//        radius = input.nextDouble();
////        while (radius < 0) {
////            System.out.println("Invalid input. PLease enter a positive number");
////        }
//        //double area;
//        //area = (3.14 * radius * radius);
//        System.out.println(Circle.getArea(radius));

        if(input.nextDouble() <= 0) {
            System.out.println("Invalid input. PLease enter a positive number");
        }
        //else if (!input.hasNextDouble()) {
//            System.out.println("Cannot be anything other than double input. PLease enter a positive number");
         else {
            radius = input.nextDouble();
//        while (radius < 0) {
//            System.out.println("Invalid input. PLease enter a positive number");
//        }
            //double area;
            //area = (3.14 * radius * radius);
            System.out.println(Circle.getArea(radius));
        }

    }
}
