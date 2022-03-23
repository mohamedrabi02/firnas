package firnas;

public class polymorphismcc {
      public static void main(String[] args) {
		fight f=new fight();
		f.tokill(new gun());
	}
}
class fight{
	void tokill(weapon w) {
		w.action();
	}
}
abstract class weapon{
	abstract public void action();
}
class knife extends weapon{
	public void action() {
		System.out.println("hand power needed to kill....");
	}
}
class gun extends weapon{
public void action() {
		System.out.println("bullets needed to kill......");
	}
}
class bomb extends weapon{
public void action() {
		System.out.println("need detonator to kill......");
	}
}