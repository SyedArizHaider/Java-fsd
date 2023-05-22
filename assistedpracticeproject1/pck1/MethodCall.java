package pck1;
public class MethodCall {


	    // Static method with no arguments
	    public static void printMessage() {
	        System.out.println("Hello, world!");
	    }

	    // Static method with arguments
	    public static void printSum(int x, int y) {
	        int sum = x + y;
	        System.out.println("The sum of " + x + " and " + y + " is " + sum);
	    }

	    // Instance method
	    public void printGreeting(String name) {
	        System.out.println("Hello, " + name + "!");
	    }
	    public static void main(String[] args) {
	        // Call a static method with no arguments
	        printMessage();

	        // Call a static method with arguments
	        printSum(10, 20);

	        // Call an instance method on an object
	        MethodCall obj = new MethodCall();
	        obj.printGreeting("John");
	    }
	}
