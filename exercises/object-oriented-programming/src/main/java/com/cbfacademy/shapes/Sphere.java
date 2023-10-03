package com.cbfacademy.shapes;

public class Sphere extends Shape {

    protected double radius;



    // constructor method 
    
    public Sphere(double radius){
        this.radius = radius; 
        shapeName = "Sphere"; 
    }


    @Override 
    public double area() {
        return (4 * Math.PI * (Math.pow(radius, 2)));
    }

    
}
