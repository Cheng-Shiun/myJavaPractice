package src;

class Person {
	public static int age;         // age 為"全局"成員變數
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	public void output() {
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
	}
}

public class StaticMemberVariableWithoutInstance {
	public static void main(String[] args) {
		Person.age = 20;      //設定所有人的年紀皆為 20 歲，此方式稱為"類別變數"
		Person P1 = new Person("Peter");
		P1.output();
		Person P2 = new Person("John");
		P2.output();
		
		// 改變所有人年紀
		Person.age = 30;
		P1.output();
		P2.output();
		
		// 改變其中一個年紀 -> run ok 但邏輯上是會改到所有人的 age 值，因此建議使用類別名稱來進行值的設定: Person.age = XX;
//		P1.age = 40;
		Person.age = 40;
		P1.output();
		P2.output();   //同 40
	}
}
