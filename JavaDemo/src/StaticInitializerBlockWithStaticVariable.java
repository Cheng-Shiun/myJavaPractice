package src;

class NBAteam {
	public static int counter;
	public int id;
	public String name;
	//static initializer block
	static {
		counter = 0;
	}
	
	public NBAteam() {
		id = ++counter;       //等同 counter = counter + 1;  id = counter;
	}
	public void output() {
		System.out.println("id: " + id + "name: " + name);
		System.out.println("共有 " + counter + " 名成員");
	}
}

public class StaticInitializerBlockWithStaticVariable {
	public static void main(String[] args) {
		NBAteam t1 = new NBAteam();
		t1.name = "Durant";
		t1.output();
		
		NBAteam t2 = new NBAteam();
		t2.name = "Curry";
		t2.output();
	}
}
