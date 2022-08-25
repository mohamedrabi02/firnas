package firnas;

import java.util.Scanner;

public class DisplayPrimeNumbers {
	public static void main(String[] args) {
		int i=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=0;
		s.close();
		String primenum="";
		for (i = 1; i <= n; i++)
		{
			int counter=0;
			for(num =i; num>=1; num--) 
			{
				if(i%num==0)
				{
					counter = counter + 1;
				} 
			}
			   if (counter ==2)
			    {
				primenum = primenum + i + " ";
				}
		}
		System.out.println("Prime numbers from 1 to "+n +" are :"); 
		System.out.println(primenum);
			
      }
}


