 package com.cbfacademy;
 


public class App {
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
    
       float operand1 = 12.0f;
        float operand2 = 20.0f;

        float sum = operand1 + operand2;
        float subrtract = operand1 - operand2;
        float multiply = operand1 * operand2; 
        float division = operand2 / operand1; 

        System.out.println("This is my addition sum " + sum); 
        System.out.println("This is my subtraction sum " + subrtract);
        System.out.println("This is my multiplication sum " + multiply);
        System.out.println("This is my division sum " + division); 

        double operand3 = 17.5d;
        double operand4 = 12.5d;

        boolean equals = operand3 == operand4;
        boolean greater  = operand3 >= operand4;
        boolean lessthan = operand3 <= operand4;


        System.out.println("Is operand 3 equal to operand 4? " + equals);
        System.out.println("Is operand 3 greater than operand 4? " + greater);
        System.out.println ("Is operand 3 less than operand 4? " + lessthan);
    

         /*   float float1 = 17.5f;
           float float2 = 12.5f;
           double double1 = 9.25d; 
           double double2 = 10.75d;
           
           Arithmetic arithmetic = new Arithmetic(); 

           System.out.println(arithmetic.Add(float1, float2));
           System.out.println(arithmetic.Add(double1, double1));

*/



    }
}
