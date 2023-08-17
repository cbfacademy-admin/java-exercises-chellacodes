package com.cbfacademy.shapes;

public class Rectangle extends Shape {

    private double length; 
    private double width;


//constructor method 

public Rectangle(double length, double width){
    this.length = length;
    this.width = width;  
    shapeName = "Rectangle"; 

}

@Override
public double area() {
    return (length * width); 

}
    
}
