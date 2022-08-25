package pinnacle;

public class enumdemo1 {
	public static void main(String[] args) {
		System.out.println("the exam marks are");
		for(name n:name.values())
			System.out.println(n+" marks is "+n.getvalue()+" in 1st exam");
	}

}
enum name{
	rabi(80),hasan(87),haaji(88),timon(92);
	private int i;
	name(int a){
		i=a;
	}
	int getvalue() {
		return i;
	}
}