package com.cbfacademy;

public class App {
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );

        int[] numarray = {17, 25, 34, 42, 57, 59, 63, 71};
        float[] floatarray = {1.2f, 2.4f, 3.5f, 4.7f, 5.2f, 6.4f, 7.8f, 8.7f, 9.2f, 10.7f, 11.9f, 12.3f};
        double[] doublearray = {1.25d, 2.50d, 3.75d, 4.02d, 5.52d};
        boolean[] booleanarray = {true, false, false, false, true, true}; 

        System.out.println(numarray[4]);
        System.out.println(floatarray[4]);
        System.out.println(doublearray[4]);
        System.out.println(booleanarray[4]);

        Object[][] matrix = {{ numarray, floatarray, doublearray, booleanarray}}; 
        
         System.out.println(matrix[3][2]);

    }


}
