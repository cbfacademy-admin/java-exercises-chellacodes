package com.cbfacademy.cars;

public class Showroom {

    public static void main(String[] args) {

        Car carOne = new Car("Volvo", "V40", 2012);
        Car carTwo = new Car("Porsche", "Panamera", 2009);
        Car carThree = new Car ("Audi", "A3" , 2018);
        System.out.println(carOne.getMake() + " " + carOne.getModel() + " " + carOne.getYear()); 
        System.out.println(carTwo);
        System.out.println(carThree);
        
    }


    
}
