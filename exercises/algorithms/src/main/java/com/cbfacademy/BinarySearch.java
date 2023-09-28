package com.cbfacademy;

import java.util.Scanner;

public class BinarySearch {

    int binarySearch(int array[], int element, int low, int high) {
      

        // repeats until the pointers low and high meet each other

        while (low <= high) {
            // mid = (low + high)/2  / gets index of mid element

            int mid = (low + high) / 2;

            // if (element == arr[mid]) / if element to be searched is the mid element

            if (element == array[mid]) {
             return mid;
            }

            // else if (element > arr[mid]) // if element is less than mid element search only the left side of mid
            if (array[mid] < element) {
            // low = mid + 1
                low = mid + 1;
            
            } else {
            // high = mid - 1 / if element is greater than mid element search only the right side of mid
                high = mid - 1;
            }

            }
            
            return -1;
        
        }
    

 
 public static void main(String args[]) {

    // create an object of Main class
    BinarySearch obj = new BinarySearch();

    // create a sorted array
    int[] array = { 3, 4, 5, 6, 7, 8, 9 };
    int x = array.length;

    // get input from user for element to be searched
    Scanner input = new Scanner(System.in);

    System.out.println("Enter element to be searched:");

    // element to be searched
    int element = input.nextInt(7);
    input.close();

    // call the binary search method
    // pass arguments: array, element, index of first and last element
    int result = obj.binarySearch(array, element, 0 , - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);

 }

}

   

 


    