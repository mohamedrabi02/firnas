package firnas;

import java.util.Scanner;

public class arr1ex {
	public static void main(String[] args) {
		int b=0,c=0;
		arr1ex a1=new arr1ex();
		//String name="rabi";
		int[] arr1= new int[10];
		int[] arr1e=new int[10];
		int[] arr1o = new int[10];
		System.out.println(a1);
		Scanner z = new Scanner(System.in);
		System.out.println("enter 10 integer for an array");
		for(int i=0;i<10;i++) {
			arr1[i]=z.nextInt();
		}
		z.close();
		
		System.out.println("start of iteation");
		for(int i=0;i<10;i++) {
			if(arr1[i]%2==0) {
			 b=b+1;
			 arr1e[i]=arr1[i];
			}
			else {
				c=c+1;
				arr1o[i]=arr1[i];
			}
		}
		System.out.println("the no of even numbers are:"+b);
		System.out.println("the no of odd numbers are:"+c);
	}

}
