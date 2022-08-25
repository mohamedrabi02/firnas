package pinnacle;

import java.util.Random;

public class exphand1 {
   public static void main(String[] args) {
	int a,b,c,d;
	Random r=new Random();
	try {
		for(int i=1;i<3600;i++) {
		      a=i%2;
		      b=r.hashCode();
		      d=b*a;
		      System.out.println(d);
		      c=(1234/(d));
		      System.out.println("the num is="+c);
		    
		}
	}
	catch(Exception e) {
		System.out.println("the divident is zero");
		a=0;
	}
	System.out.println("end of catch phrase");
}
}
