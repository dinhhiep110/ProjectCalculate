package org.example.Model;

import org.example.Controller.ShapeAction;

public class Circle extends ShapeAction {
    private double r;
    private final double PI = Math.PI;

    public Circle() {
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * 2 * PI;
    }

    @Override
    public double getPerimeter() {
        return r * r * PI;
    }

    @Override
    public void print() {
        System.out.println("Area of the circle is: " + getArea());
        System.out.println("Perimeter of the circle is: " + getPerimeter());
    }

    @Override
    public void input() {
        double r;
        boolean isValidate = false;
        while (!isValidate){
            try{
                System.out.print("Input the circle: ");
                r = Double.parseDouble(scanner.nextLine().trim());
                this.setR(r);
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
