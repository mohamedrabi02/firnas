package firnas;

public class pin1 {

	public static void main(String[] args) {
		e b=new e();
		s a=new s();
		a.rabi(b);
	}

}
class s
{
  	public void rabi(s1 f) {
       f.sed();
  	}
}
abstract class s1
{
  abstract void sed();	
}
class d extends s1{
	void sed() 
	{System.out.println("class d called");}
}
class e extends s1{
	void sed() 
	{System.out.println("class e called");}
}