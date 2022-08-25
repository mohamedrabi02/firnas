package pinnacle;

import java.util.Random;

public class Exphand2 {
  public static void main(String[] args) {
	Random r= new Random();
	int a=r.hashCode();
	int b=22;
	int c=b/a;
	System.out.println(c);
}
}
