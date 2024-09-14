package src;

//方法內的區域變數 balance 與成員變數 balance 名稱重複時，可使用 this 關鍵字來指定要使用目前物件的成員變數
class TaipeiBank {
	String account;
	int balance;
	
	void saveMoney(int balance) {
		this.balance += balance;         //this.balance 指的是 A 的 balance
	}
	
	void printInfo() {
		System.out.printf("帳戶: %s\n", account);
		System.out.printf("餘額: %d\n", balance);
	}
}
public class ThisKeywordToUseLocalVariable {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank();
		A.account = "1000-001";
		A.balance = 0;
		
		A.printInfo();
		System.out.println("執行存款後...");
		A.saveMoney(50);
		A.printInfo();
	}
}


