

package firnas;
import java.util.Scanner;

public class vowel {
	public static void main(String[] args) {
		System.out.println("enter a name:");
		Scanner s=new Scanner(System.in);
		String c= s.next();
		s.close();
		System.out.println("the entered name is:"+c);
		char ch='i';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("the char"+ch+"is a vowel");
		}
		else
			System.out.println("the char i is not a vowel");
	}

}
