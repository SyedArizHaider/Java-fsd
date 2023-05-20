package com.pack1;

public class ExceptionDemo {
	    public static void main(String[] args) {
	        try {
	            int result = divide(10, 0);
	            System.out.println(result);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException: " + e.getMessage());
	        } catch (CustomException e) {
	            System.out.println("Caught CustomException: " + e.getMessage());
	        } finally {
	            System.out.println("This block always executes");
	        }
	    }

	    public static int divide(int a, int b) throws CustomException {
	        try {
	            return a / b;
	        } catch (ArithmeticException e) {
	            throw new CustomException("Cannot divide by zero", e);
	        } finally {
	            System.out.println("This block always executes");
	        }
	    }

	    static class CustomException extends Exception {
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public CustomException(String message, Throwable cause) {
	            super(message, cause);
	        }
	    }
	}