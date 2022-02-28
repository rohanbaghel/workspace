import java.util.Scanner;

public class prime{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer only: ");
		int n=sc.nextInt();
		int i=2;
		boolean flag=false;
		while(i<n){
			if(n%i==0){
				flag=true;
				break;
			}
			i++;
		}
		if(flag==true){
			System.out.println("It is not a prime number");
		}
		else{
			System.out.println("It is a prime number");
		}
	}
}