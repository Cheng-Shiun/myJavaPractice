package src;

class NBAplayers {
	int age;
	String name;
	
	//定義 overload constructor
	//constructor 1
	NBAplayers(String name) {
		this.name = name;
	}
	//constructor 2
	NBAplayers(String name, int age) {
		this(name);         //使用 this 關鍵字去調用 第8行的 constructor
		this.age = age;
	}
	
	void printInfo() {
		System.out.println("球員姓名: " + name);
		System.out.println("球員年紀: " + age);
	}
} 

//使用建構式調用的優點：減少重複的code、提高可維護姓
public class ThisKeywordToUseConstructor {
	public static void main(String[] args) {
		NBAplayers A = new NBAplayers("LeBron James", 30);
		A.printInfo();
	}
}
