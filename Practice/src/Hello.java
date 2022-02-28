import java.util.Scanner;

class Hello{
	int x;
	String y;
	double z;
	public static void main(String[] args) {
		 System.out.println("first program");
		 
		 for (int i = 0; i < 10; i++) {
			System.out.println("Value of i: "+i);
		}
		byte b=010;
		boolean bl= true;
		short s=32112;
		int i=2314453;
		long l=4152343244234324323L;
		float f= 0.988341231424124145433245f;
		double d=0.23412423441234123412431234123443534443534;
		char ch= '~';
		System.out.println("Byte: "+b+"\nBool: "+bl+"\nshort: "+s+"\nint: "+i+"\nlong: "+l+"\nfloat: "+f+"\ndouble: "+d+"\nchar: "+ch);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x=sc.nextInt();
		System.out.println(x);
		
		sc.close();
	}
	
}