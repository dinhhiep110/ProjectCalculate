package org.example.Controller;

import java.util.Scanner;

public abstract class ShapeAction implements Shape {
    public Scanner scanner = new Scanner(System.in);
    public abstract void print();

    public abstract void input();


}
