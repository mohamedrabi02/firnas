package arrangehistory;

import java.util.Scanner;

public class Rearrangealpha 
{

	public static void main(String[] args) 
	{
		Rearrangealpha a = new Rearrangealpha();
		a.getval();
	}
	public void getval() 
	{
		String a = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : \n");
		a = sc.nextLine();
		System.out.println(a);
		sc.close();
	    rearrange(a);
		//System.out.println("the rearranged string is : "+a);
	}
	public void rearrange(String s) 
	{
		int strlen = s.length();
		char tc[] = new char[strlen];
		s.getChars(0, strlen, tc, 0);
		int endind = strlen - 1;
		System.out.println(endind+1);
		int j=0;
		
			while(j<endind) 
			{
				
				if(Character.isAlphabetic(tc[j]))//(tc[j]>='a'&& tc[j]<='z') 
				{
					if(Character.isAlphabetic(tc[endind]))//(tc[endind]>='a'&& tc[endind]<='z') 
					{
						char ch = tc[j];
						tc[j] = tc[endind];
						tc[endind] = ch;
						j++;
						--endind;
					}
					else 
					{
						--endind;
					}
				}
				else 
				{
					j++;
				}
			}
		 
		for(int i=0;i<strlen;i++) 
		{
			System.out.print(tc[i]);
		}
		
	}

}
