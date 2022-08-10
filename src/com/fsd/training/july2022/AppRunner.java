package com.fsd.training.july2022;

// Create class and objects
// Create instance variables\local variables\constants
// Constructor
// Inheritance, Polymorphism, Encapsulation

// Abstract Class
// Interfaces

// Final - variable, method and class
// Static - variable, method

import com.fsd.training.july2022.exception.RadiusOutOfBondException;
import com.fsd.training.july2022.oops.Circle;
import com.fsd.training.july2022.oops.Draw;
import com.fsd.training.july2022.oops.Shape;
import com.fsd.training.july2022.oops.Square;

public class AppRunner {

    public static void main(String[] args) throws RadiusOutOfBondException {

//        int cubeOfNum = AppRunner.cube(5);
//        System.out.println(cubeOfNum);

        try {
            int qu = AppRunner.qu(15, 3);
            System.out.println("Qu: " + qu);

            int[] arr = new int[3];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            System.out.println("First num: " + arr[0]);
            System.out.println("Last num:" + arr[2]);

            Shape shape1 = new Square("Square", 10);
            shape1.calculateArea(); // super abstract class
            shape1.displayArea();

            System.out.println("-----------------------");

            Shape circle = new Circle("Circle", 8000);
            circle.calculateArea();
            System.out.println(circle.getArea());
            circle.displayArea();

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Exception caught, cause: " + e.getMessage());
            System.out.println("Divisior should not be zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception caught, cause: " + e.getMessage());
            System.out.println("Please access array with in its size");
        } catch (RadiusOutOfBondException e) {
            e.printStackTrace();
            System.out.println("Exception caught, cause: " + e.getMessage());
            System.out.println("Radius that caused exception is " + e.getRadius());
        } catch (Exception e) {
            System.out.println("Exception caught, cause: " + e.getMessage());
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("I am final log statement");
        }

        System.out.println("End of program");
    }

    public static int cube(int num){
        return num * num * num;
    }

    public static int qu(int num, int divisor){
        return num / divisor;
    }
}
