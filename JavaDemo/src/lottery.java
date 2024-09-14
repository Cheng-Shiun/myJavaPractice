
package src;

import java.util.Scanner;

public class lottery {
	public static void main(String[] args) {
		int[] lottery = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入購買大樂透卷數量: ");
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.printf("%d : \t", i);
			
			// 先將數字 1 ~ 49 分別放入陣列中  lottery[1] = 1, lottery[2] = 2  ...
			for (int n = 1; n <= 49; n++) {           
				lottery[n] = n;
			}
			int counter = 1;
			while (counter <= 6) {
				int lotteryNum = (int) (Math.random() * (49 - 1 + 1)) + 1;
				
				// 如果遇到已經被抽過的號碼 則跳過
				if (lottery[lotteryNum] == 0) {
					continue;
				}
				else {
					// 未被抽過的號碼取出，並且將對應的 index 值設成 0
					System.out.printf("%d \t", lotteryNum);
					lottery[lotteryNum] = 0;
					counter ++;
				}
			}
			System.out.printf("\n");
		}
	}
}
