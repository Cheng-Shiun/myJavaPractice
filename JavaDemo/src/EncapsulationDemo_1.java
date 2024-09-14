package src;

class TaiwanBank {
	private String user_account;
	private int user_balance;
	private int exchange_rate = 30;                  // 匯率 ->台幣 : 美元 = 1 : 30
	private double service_charge_rate = 0.01;     // 手續費率 0.01
	
	// constructor
	public TaiwanBank(String user_account) {
		this.user_account = user_account;
		this.user_balance = 0;                     // 開戶金額 = 0
	}
	
	// 存款
	public void saveMoney(int money) {
		this.user_balance += money;
	}
	
	// 提款
	public void withdrawMoney(int money) {
		this.user_balance -= money;
	}
	
	// 換匯計算(使用 private 封裝起來)
	private double cal_exchangeRate(int usd) {
		double result;
		result = usd * exchange_rate * (1 - service_charge_rate);
		return result;
	}
	
	// 換匯邏輯
	public double USD_to_NTD(int usd) {
		// 存款餘額不足
		if (this.user_balance == 0) {
			System.out.println("帳戶餘額不足，無法進行換匯");
		}
		
		// 存款大於1萬手續費率為0.008 
		if (this.user_balance >= 10000) {
			this.service_charge_rate = 0.008;
		} 
			
		return cal_exchangeRate(usd);         
	}
	
	public void printBalance() {
		System.out.println(user_account + " 目前存款餘額: " + user_balance);
	}
}

public class EncapsulationDemo_1 {
	public static void main(String[] args) {
		TaiwanBank newAccount = new TaiwanBank("Hung");
		newAccount.printBalance();
		
		//想要換 50 美金
		int usd = 50;
		newAccount.USD_to_NTD(usd);
		//存款 5000
		newAccount.saveMoney(5000);
		newAccount.printBalance();
		System.out.println("換匯金額為: " + newAccount.USD_to_NTD(usd));
		//再存款 5000
		newAccount.saveMoney(5000);
		newAccount.printBalance();
		System.out.println("換匯金額為: " + newAccount.USD_to_NTD(usd));
	}
}
