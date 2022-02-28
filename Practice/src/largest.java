import java.util.Scanner;  
  public class largest  
  {  
	public static void main(String[] args)
	{  
		int a, b, c, temp;  
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		if(a>b){
			temp=a;
		}
		else{
			temp=b;
		}
		if(c>temp){
			temp=c;
		}
		System.out.println("The largest number is: "+temp);  
	}  
}