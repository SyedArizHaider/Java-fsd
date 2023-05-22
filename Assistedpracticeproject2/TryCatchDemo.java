package com.pack1;

public class TryCatchDemo {
	    public static void main(String[] args) {
	        try {
	            int result = divide(10, 0);
	            System.out.println(result);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: " + e.getMessage());
	        } finally {
	            System.out.println("This block always executes");
	        }
	    }

	    public static int divide(int a, int b) {
	        return a / b;
	    }

}
