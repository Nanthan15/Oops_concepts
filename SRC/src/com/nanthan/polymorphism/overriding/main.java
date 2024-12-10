package com.nanthan.polymorphism.overriding;

class Shapes {
    void area(){
        System.out.println("Area of Shapes");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("Area of cicle");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("Area of triangle");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("Area of sqwuare");
    }
}

public class main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();
    }
}