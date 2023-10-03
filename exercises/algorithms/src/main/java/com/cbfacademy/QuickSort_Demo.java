package com.cbfacademy;

import java.util.Arrays;

public class QuickSort_Demo {


    // method to find the partition position
    static int partition(int array[], int beg, int end) {



   // chose the rightmost element as pivot 
        int pivot = array[end]; 


    // pointer for greater element 

        int i = (beg - 1); 

    // traverse through all elements 
    // compare each element with pivot 
        for (int j = beg; j < end; j ++) {
            if (array[j] <= pivot) {
                i++;
            }

            int temp = array[i];
            array[i] = array[j];
            array[];

        }










    }




    
}
