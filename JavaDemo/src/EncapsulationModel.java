package src;

class TaichungBank {
	//private 的成員變數   -> 不同的 class 無法對成員變數的值直接進行設定 如: A.name = "test"; A.balance = 1000;
	private String name;
	private int balance;
	
	TaichungBank(String name) {
		this.name = name;
		this.balance = 0;
	}
	
	void getBalance() {
		System.out.println(name + " 目前存款金額為: " + balance);
	}
	
	//getter and setter (存取控制 Access Modifier 為 public -> 允許不同的 class 存取)
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class EncapsulationModel {
	public static void main(String[] args) {
		TaichungBank A = new TaichungBank("Huang");
		
		A.getBalance();
		A.setBalance(10000);          //透過 setter 方法可以改變 成員變數的值
		A.getBalance(); 
	}
}
