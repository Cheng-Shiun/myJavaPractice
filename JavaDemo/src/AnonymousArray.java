package src;

public class AnonymousArray {
	
	//宣告一個靜態方法
	public static int add(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//匿名陣列 new int[] {}; -> 不需要new 一個實體出來(佔記憶體空間)
		//使用情境：該陣列只使用一次
		System.out.println(add(new int[] {1, 2, 3, 4, 5}));
	}
}
