package objectorientd;

import java.util.Scanner;

public class Absdemo 
{

	public static void main(String[] args) 
	{
		Absdemo a = new Absdemo();
		a.typeconfirm();

	}
	public String getval() 
	{
		String s;
		System.out.println("enter a type of an animal :");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		s = s.toUpperCase();
		
		return s;
	}
	public void typeconfirm()
	{
		Absdemo a = new Absdemo();
		String animaltype=a.getval();
		if(animaltype.equals("HERBIVORES")) 
		{
			a.dynamicdispatch(new herbivores());
		}
		else if(animaltype.equals("CARNIVORES")) 
		{
			a.dynamicdispatch(new carnivores());
		}
		else if(animaltype.equals("OMNIVORES")) 
		{
			a.dynamicdispatch(new omnivores());
		}
		else 
		{
			System.out.println("enter a correct type");
		}
	}
    void dynamicdispatch(grow g) 
    {
    	g.feed();
    }

}
abstract class grow
{
	abstract public void feed();
}
class herbivores extends grow
{
	public void feed() 
	{
		System.out.println("\n they eat grass to grow");
	}
}
class carnivores extends grow
{
	public void feed() 
	{
		System.out.println("\n they eat other animals to grow");
	}
}
class omnivores extends grow
{
	public void feed() 
	{
		System.out.println("\n they eat both plants and other animals");
	}
}