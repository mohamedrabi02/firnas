package firnas;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class sec167pvtext {
    public static void main(String[] args)throws Exception {
		policestation p1=new policestation();
		doctor doc=new doctor();
		politician pol=new politician();
		p1.arrest(pol);
		//p1.arrest(doc);
	} 
}
class policestation{
	public void arrest(Object obj)throws Exception {
		Class c=obj.getClass();
		Field f=c.getField("a");  //public variable in politician
		System.out.println("side character .........1");
		System.out.println(f.get(obj));
		
		Method m=c.getMethod("work");
		m.invoke(obj);
		
	/*	f=c.getField("b");
		System.out.println(f.get(obj));
		
		m=c.getMethod("work2"); //cannot be done cause its private
		m.invoke(obj);*/                             
		
		f=c.getDeclaredField("b");
		f.setAccessible(true);
		System.out.println("side character........2");
		System.out.println(f.get(obj));
		
		m=c.getDeclaredMethod("work2");
		m.setAccessible(true);
		m.invoke(obj);
	}
}

class politician{
	public String a="iam a good person";
	public void work() {
		System.out.println("i do social service");
	}
	private String b="iam a thug";
	private void work2() {
		System.out.println("i loot money from people");
	}
}

class doctor{
	public String a="i heal people";
	public void work() {
		System.out.println("i do social service cause iam a doctor");
	}
	private String b="i kill people";
	private void work2() {
		System.out.println("i traffic organs");
	}
}
