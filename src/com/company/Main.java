package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Rectangle rectangle = new Rectangle();
        double width = writeWidthSquare();
        double height = writeHeightSquare();

        createAndShowFigure(height,width);
    }

    private static void createAndShowFigure(double height, double width) {
        Square square = new Square(height,width);
        System.out.println("The square size is: "+square.calculatePartialArea());
        System.out.println("The size of the two square is: "+square.calculateAllArea());

    }

    private static double writeHeightSquare() {
        System.out.println("Write the height of the square");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    private static double writeWidthSquare() {
        System.out.println("Write the width of the square");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

}
