package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    private double radius; 
    private double height;



    //constructor method 
   
public Cylinder(double radius, double height) {
    this.radius = radius; 
    this.height = height; 
    shapeName = "Cylinder"; 
}

@Override
public double area() {
  return (height * Math.PI * (Math.pow(radius, 2)));
   
}
    
}
