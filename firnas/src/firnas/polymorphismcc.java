package firnas;

public class polymorphismcc {
      public static void main(String[] args) {
		fight f=new fight();
		f.tokill(new gun());
	}
}
class fight{
	void tokill(weapons w) {
		w.action();
	}
}
abstract class weapons{
	abstract public void action();
}
class knife extends weapons{
	public void action() {
		System.out.println("hand power needed to kill....");
	}
}
class gun extends weapons{
public void action() {
		System.out.println("bullets needed to kill......");
	}
}
class bomb extends weapons{
public void action() {
		System.out.println("need detonator to kill......");
	}
}