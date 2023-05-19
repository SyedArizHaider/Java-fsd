package com.pack1;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3 };
            int value = arr[3];
            System.out.println(value);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        finally {
            System.out.println("This block always executes");
        }
    }
}