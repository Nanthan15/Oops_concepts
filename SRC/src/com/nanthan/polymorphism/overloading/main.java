package com.nanthan.polymorphism.overloading;

class Circle   {
    void area(int radius){
        System.out.println("Area of cicle radius is "+radius);
    }
    void area(String name){
        System.out.println("Area of Shapes name is "+name);
    }
}



public class main {
    public static void main(String[] args) {
        Circle circle = new Circle();



        circle.area(23);
        circle.area("nanthan");

    }
}
