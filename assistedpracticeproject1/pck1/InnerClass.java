package pck1;
	public class InnerClass {
		    private int x = 10;
		    private static int y = 20;

		    // Non-static nested class
		    class InnerClasss {
		        public void print() {
		            System.out.println("x = " + x);
		            System.out.println("y = " + y);
		        }
		    }
		    // Local class
		    public void testLocalClass() {
		        int z = 30;
		        class LocalClass {
		            public void print() {
		                System.out.println("x = " + x);
		                System.out.println("y = " + y);
		                System.out.println("z = " + z);
		            }
		        }
		        LocalClass localClass = new LocalClass();
		        localClass.print();
		    }
		    // Anonymous class
		    public void testAnonymousClass() {
		        Runnable r = new Runnable() {
		            @Override
		            public void run() {
		                System.out.println("x = " + x);
		                System.out.println("y = " + y);
		            }
		        };
		        r.run();
		    }

		    // Static nested class
		    static class StaticNestedClass {
		        public void print() {
		            // Cannot access non-static members of outer class
		            // System.out.println("x = " + x);
		            System.out.println("y = " + y);
		        }
		    }

		    public static void main(String[] args) {
		        InnerClass outer = new InnerClass();

		        // Testing non-static nested class
		        InnerClass.InnerClasss inner = outer.new InnerClasss();
		        inner.print();

		        // Testing local class
		        outer.testLocalClass();

		        // Testing anonymous class
		        outer.testAnonymousClass();

		        // Testing static nested class
		        InnerClass.StaticNestedClass staticNestedClass = new InnerClass.StaticNestedClass();
		        staticNestedClass.print();
		    }

}
