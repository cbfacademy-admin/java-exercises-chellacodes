package com.cbfacademy.cars;

public class Car{

    //instance fields 

    private String make;
    private String  model; 
    private int  year; 

// constructor 

// contains three parameters 
/**
 * creates a new car instance
 * @param make the make of the car 
 * @param model the model of the car 
 * @param year the year of the car 
 */
public Car(String make, String model, int year) {

    this.make = make; 
    this.model = model; 
    this.year = year;
    
  // this syntax accesses the instance fields declared 
  
}

// method 

public String getMake() {

    return this.make; 

} 

public String getModel(){

    return model; 
}

public int getYear(){

    return year;
}

// example of two string method , see how the method above is different with carOne

@Override
public String toString(){
    return getMake() + " " + getModel() + " (" + getYear() + ")"; 
} 

}
