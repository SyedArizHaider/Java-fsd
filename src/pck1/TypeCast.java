package pck1;
	public class TypeCast {
			    public static void main(String[] args) {
			        char a='A';
			        int i=a;
			        long l=a;
			        float f=a;
			        double d=a;
			        System.out.println("implicit type casting");
			        System.out.println("before implicit conversion :" + a);
			        System.out.println("after implicit conversion  : " + i);
			        System.out.println("after implicit conversion  : " + l);
			        System.out.println("after implicit conversion  : " + f);
			        System.out.println("after implicit conversion  : " + d);

			         double h=5;
			         int r=(int)h;

			System.out.println("explicit typecasting");
			        System.out.println("before explicit conversion :" +h );
			        System.out.println("after explicit conversion ,  : " + r);

}
}