package com.cbfacademy.shapes;

public abstract class Shape {
    
    // prottected value allows you to mabipulate that value from any of the descendant class i.e paint.java , rectangle.java 
    
    protected String shapeName; 

    public abstract double area(); {

    }
    
    public String toString() {
        return shapeName; 

    }
    
}


