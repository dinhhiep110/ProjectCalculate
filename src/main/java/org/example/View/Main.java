package org.example.View;

import org.example.Model.Circle;
import org.example.Model.Rectangle;
import org.example.Controller.ShapeAction;
import org.example.Model.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            makeMenu();
            try{
                ShapeAction shape;
                choose = Integer.parseInt(scanner.nextLine().trim());
                while (choose > 3  || choose < 0){
                    System.out.println("Please re input your chosen");
                    choose = Integer.parseInt(scanner.nextLine().trim());
                }
                switch (choose){
                    case 1:
                        shape = new Rectangle();
                        shape.input();
                        shape.print();
                        break;
                    case 2:
                        shape = new Circle();
                        shape.input();
                        shape.print();
                        break;
                    case 3:
                        shape = new Square();
                        shape.input();
                        shape.print();
                        break;
                }
            }
            catch (NumberFormatException e){
                System.out.println("The chosen is invalid");
                choose = 1;
            }


        }
        while (choose != 0);

    }

    private static void makeMenu(){
        System.out.println("======== Calculate Shape ========");
        System.out.println("1.Rectangle");
        System.out.println("2.Circle");
        System.out.println("3.Square");
        System.out.println("0.Exit");
        System.out.print("Enter your choose: ");
    }
}