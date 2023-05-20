package pck1;

public class Constructor {
		    private int value;

		    // Default constructor
		    public Constructor() {
		        value = 0;
		    }

		    // Parameterized constructor
		    public Constructor(int v) {
		        value = v;
		    }

		    // Copy constructor
		    public Constructor(Constructor obj) {
		        value = obj.value;
		    }

		    // Getter and setter methods
		    public int getValue() {
		        return value;
		    }

		    public void setValue(int v) {
		        value = v;
		    }

		    public static void main(String[] args) {
		        // Testing default constructor
		    	Constructor obj1 = new Constructor();
		        System.out.println("Value of obj1: " + obj1.getValue());

		        // Testing parameterized constructor
		        Constructor obj2 = new Constructor(10);
		        System.out.println("Value of obj2: " + obj2.getValue());

		        // Testing copy constructor
		        Constructor obj3 = new Constructor(obj2);
		        System.out.println("Value of obj3: " + obj3.getValue());

		        // Testing setter method
		        obj1.setValue(5);
		        System.out.println("Value of obj1 after setting value to 5: " + obj1.getValue());
		    }


}
