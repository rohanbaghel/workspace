import java.util.Scanner;


public class Wrapper {
	public static void main(String[] args){
		Boolean bObj;
		Float fObj;
		Double dObj;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a bool: ");
		bObj=sc.nextBoolean();
		System.out.println("Enter a float: ");
		fObj=sc.nextFloat();
		System.out.println("Enter a Double: ");
		dObj=sc.nextDouble();
		
		System.out.println("Integer : "+bObj);
		System.out.println("Float :"+fObj);
		System.out.println("Double :"+dObj);
		
		if(bObj){
			System.out.println("Boolean return true");
		}
		else{
			System.out.println("Boolean return false");
		}
		
		for(Integer i=0;i<10;i++){
			System.out.println(i+"th Integer.");
		}
		sc.close();
		
	}
}
