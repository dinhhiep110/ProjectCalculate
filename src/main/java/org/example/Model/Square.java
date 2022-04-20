package org.example.Model;

import org.example.Controller.ShapeAction;

public class Square extends ShapeAction {

    private double side;

    public Square() {
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void print() {
        System.out.println("Area of the square is: " + getArea());
        System.out.println("Perimeter of the square is: " + getPerimeter());
    }

    @Override
    public void input() {
        double side;
        boolean isValidate = false;
        while (!isValidate){
            try{
                System.out.print("Input the side of square: ");
                side = Double.parseDouble(scanner.nextLine().trim());
                this.setSide(side);
                isValidate = true;
            }
            catch (NumberFormatException e){
                System.out.println("The information is invalid");
                System.out.println();
                System.out.println("Please enter again");
            }
        }
    }
}
