package firnas;

public class consoverride {

	public static void main(String[] args) {
		
       parent obj=new child(10);
       System.out.println(obj.age);
       obj.met();
	}

}
class parent{
	public parent() {
		System.out.println("parent cons called..");
	}
	public parent(int i){
		System.out.println("explicit parent cons called...."+i);
	}
	int age=40;
	void met() {
		System.out.println("parent met called");
	}
}
class child extends parent{
	public child(int x) {
		super(100);
		System.out.println("child cons called..."+x);
	}
	int age=100;
	void met() {
		System.out.println("child met called");
	}
}