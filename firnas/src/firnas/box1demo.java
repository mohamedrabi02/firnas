package firnas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class box1demo {

	public static void main(String[] args) {
		try {
			Scanner s= new Scanner(System.in);
			box b=new box();
			System.out.println("enter the value of height,length,breath:");
			b.height=s.nextInt();
			b.length=s.nextInt();
			b.breath=s.nextInt();
			b.volume();
			s.close();
		}
		catch(InputMismatchException e) {
			System.out.println("enter a proper number");
		}

	}

}
class box{
	int breath,volume,height,length;
	void volume() {
		try {
		volume=height*length*breath;
		System.out.println("the volume is ="+volume);
		}
		catch(Exception e){
			System.out.println("exception in instance method");
		}
		finally {
			System.out.println("the volume method executed successfully");
		}
	}
	
}
