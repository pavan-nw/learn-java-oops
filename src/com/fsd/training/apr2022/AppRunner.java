package com.fsd.training.apr2022;

import com.fsd.training.apr2022.oops.ColoredSquare;
import com.fsd.training.apr2022.oops.YellowColoring;

public class AppRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("Running the app...");

        ColoredSquare coloredSquare = new ColoredSquare(10, new YellowColoring("Dark"));
        coloredSquare.coloringSquare();


//        try {
//            Circle c1 = new Circle(1001);
//            c1.computeArea();
//            c1.displayArea();
//        } catch (RadiusValueOutOfBondException e) {
//            e.displayCausedRadius();
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("Exception caught while creating circle because " + e.getMessage());
//            e.printStackTrace();
//        }

//        try {
//            // some code which might go wrong
//            int[] arr = { 1,2,3,4 };
//            System.out.println("results: " + arr[1]);
//        }
//        catch (ArithmeticException ex1){
//            System.out.println("ArithmeticException caught: " + ex1.getMessage());
//            ex1.printStackTrace();
//        }
//        catch (ArrayIndexOutOfBoundsException ex2) {
//            System.out.println("ArrayIndexOutOfBoundsException caught: " + ex2.getMessage());
//            ex2.printStackTrace();
//        }
//        catch (Exception ex3) {
//            System.out.println("Global exception caught: " + ex3.getMessage());
//            ex3.printStackTrace();
//        } finally {
//            System.out.println("This code is executed always");
//        }

//        Shape shape = new Circle(9);
//        shape.draw();
//        shape.drawWithDottedLine();
//        shape.drawInRedColor();
//        shape.drawInGreenColor();
//        shape.computeArea(); // Area of circle
//        shape.displayArea();
//        System.out.println("-----------------------------------------------------");
//        shape = new Square(12);
//        shape.draw();
//        shape.drawWithDottedLine();
//        shape.drawInRedColor();
//        shape.drawInGreenColor();
//        shape.computeArea(); // Area of square
//        shape.displayArea();

        System.out.println("App completed execution");
    }
}
