package firnas;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int first=sc.nextInt();
		int second=sc.nextInt();
		System.out.println(first+" "+second);
		int sum=first+second;
		sc.close();
		System.out.println("the sum is="+sum);
		
		
	}

}
