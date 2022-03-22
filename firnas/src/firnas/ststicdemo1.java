package firnas;

public class ststicdemo1 {

	public static void main(String[] args) {
		room r=new room();
		room r2=new room();
		

	}
	//static {
		//System.out.println("static block is called in class ststicdemo1.....");
	//}

}
class room{
	table t=new table();
	static fan f=new fan();
}
class table{
	public table() {
		System.out.println("wooden table in room");
	}
	static {
		System.out.println("static block of table is called in class ststicdemo1.....");
	}
}
class fan{
	public fan() {
		System.out.println("crompton fan in room..");
	}
}