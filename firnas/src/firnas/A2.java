package firnas;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		int[] arr1 = new int[12];
		int a=12;
		Scanner a2= new Scanner(System.in);
		System.out.println("enter the variables");
		for(int i=0;i<12;i++) {
			arr1[i]= a2.nextInt();
		}
		a2.close();
		System.out.println("start of code");
		for(int x:arr1) {
			for(int j=0;j<a;j++) {
				if(x == arr1[j]) {
					for(int z=j;z<a;z++) {
						arr1[z]=arr1[z+1];
						
					}
				}
				
			}
		}
	}

}
