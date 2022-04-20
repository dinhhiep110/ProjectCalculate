package org.example.Model;

import org.example.Controller.ShapeAction;

public class Rectangle extends ShapeAction {
    private double width;
    private double height;

    public Rectangle() {
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return  height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) / 2;
    }

    @Override
    public void print() {
        System.out.println("Area of the rectangle is: " + getArea());
        System.out.println("Perimeter of the rectangle is: " + getPerimeter());
    }

    @Override
    public void input() {
        double h,w;
        boolean isValidate = false;
        while (!isValidate){
            try{
                System.out.print("Input the height: ");
                h = Double.parseDouble(scanner.nextLine().trim());
                System.out.print("Input the width: ");
                w = Double.parseDouble(scanner.nextLine().trim());
                this.setWidth(w);
                this.setHeight(h);
                isValidate = true;
            }
            catch (NumberFormatException e){
                System.out.println("The information is invalid");
                System.out.println();
                System.out.println("Please enter again");
            }
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Rectangle)) return false;
//
//        Rectangle rectangle = (Rectangle) o;
//
//        if (Double.compare(rectangle.getWidth(), getWidth()) != 0) return false;
//        return Double.compare(rectangle.getHeight(), getHeight()) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        temp = Double.doubleToLongBits(getWidth());
//        result = (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(getHeight());
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
}
