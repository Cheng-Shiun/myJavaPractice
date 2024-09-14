package src;
class ShadowingTest {
	int x = 10;
	void printInfo(int x) {
		System.out.println("區域變數: " + x);
		System.out.println("成員變數: " + this.x);
	}
}
public class ShadowingName {
	public static void main(String[] args) {
		ShadowingTest A = new ShadowingTest();
		A.printInfo(20);
	}
}

