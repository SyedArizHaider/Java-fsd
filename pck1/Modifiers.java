package pck1;
public class Modifiers {
	    // Private field
	    private int privateField;

	    // Protected field
	    protected int protectedField;

	    // Public field
	    public int publicField;

	    // Private method
	    private void privateMethod() {
	        System.out.println("This is a private method.");
	    }

	    // Protected method
	    protected void protectedMethod() {
	        System.out.println("This is a protected method.");
	    }

	    // Public method
	    public void publicMethod() {
	        System.out.println("This is a public method.");
	    }

	    public static void main(String[] args) {
	        Modifiers obj = new  Modifiers();
	        obj.privateField = 10;
	        obj.protectedField = 20;
	        obj.publicField = 30;


	        System.out.println("Private field value: " + obj.privateField);
	        System.out.println("Protected field value: " + obj.protectedField);
	        System.out.println("Public field value: " + obj.publicField);
	        obj.privateMethod();
	        obj.protectedMethod();
	        obj.publicMethod();
	    }
	}