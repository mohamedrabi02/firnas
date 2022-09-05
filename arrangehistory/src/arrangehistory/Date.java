package arrangehistory;

import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
	  String[] a=new String[5];
	  //String[] fin=new String[5];
	  sort d=new sort();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("\n enter the strings :\n");
	  for(int i=0;i<5;i++) {
		  a[i]=sc.nextLine();
	  }
	  /*for(int i=0;i<5;i++) {
		  System.out.println("\n"+a[i]);
	  }*/
	  d.sortfun(a);
	  sc.close();
	}
}
class mnthval{
	
	public float mnthv(String e) 
	{
		float mval = 0;
		
		if(e.equals("JAN")) 
		{
			mval = 1;
		}
		else if(e.equals("FEB")) 
		{
			mval = 2;
		}
		else if(e.equals("MAR")) 
		{
			mval = 3;
		}
		else if(e.equals("APR")) 
		{
			mval = 4;
		}
		else if(e.equals("MAY")) 
		{
			mval = 5;
		}
		else if(e.equals("JUN")) 
		{
			mval = 6;
		}
		else if(e.equals("JUL")) 
		{
			mval = 7;
		}
		else if(e.equals("AUG")) 
		{
			mval = 8;
		}
		else if(e.equals("SEP")) 
		{
			mval = 9;
		}
		else if(e.equals("OCT")) 
		{
			mval = 10;
		}
		else if(e.equals("NOV"))  
		{
			mval = 11;
		}
		else if(e.equals("DEC"))
		{
			mval = 12;
		}
		else 
			mval = -1;
		
		return mval;
	}
	
}
class grip extends mnthval
{
	public float dateval(String c)
	{
		int len=c.length();
		float mv;
		float tv=0;
		int x,y=0,ye;
		char ts[]=c.toCharArray();
		String d,year,td;
		for(int i=0;i<len;i++) {
			if(ts[i]==' ') 
			{
				x = i;
				d = c.substring(y, x);
				td=d.toUpperCase();
				if(d.length()==3) 
				{
					mv=mnthv(td);
					/*try 
					{*/
					 if(x == len-1) 
					 {
						tv=2022 + (mv/100);
						System.out.println(mv+" "+tv);
					 }
					 else if(mv!=-1 && i!=len-1) 
					 {
						year=c.substring(x+1, x+5);
						try {
							ye = Integer.parseInt(year);
							tv = ye+mv/100;
						}
						catch (NumberFormatException ex){
					          System.out.println("year exception");
						 }
					 }
					/*}
					catch(ArrayIndexOutOfBoundsException e) 
					{
					  System.out.println("out of bound");
					}*/
				 }
				y=i+1;
			}
		}
		return tv;
	}
}
class sort extends grip{
	public void sortfun(String b[]) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i-1;j++) {
			  // System.out.println(dateval(b[i]));
			   if(dateval(b[j])>dateval(b[j+1])) {
				   String stv = b[j];
                   b[j] = b[j + 1];
                   b[j + 1] = stv;  
			   }
			}
			 System.out.println(dateval(b[i]));
		}
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
	}
}