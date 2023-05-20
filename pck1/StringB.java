package pck1;
	public class StringB {
		    public static void main(String[] args) {
		        // Create a string
		        String str = "Hello, World!";

		        // Convert to StringBuffer
		        StringBuffer stringBuffer = new StringBuffer(str);
		        System.out.println("StringBuffer: " + stringBuffer);

		        // Convert to StringBuilder
		        StringBuilder stringBuilder = new StringBuilder(str);
		        System.out.println("StringBuilder: " + stringBuilder);
		    }
	}
