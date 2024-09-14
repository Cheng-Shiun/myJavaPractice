package src;

public class DrawStar {
	public static void main(String[] args) {
		int n = 5;
		
		//上半部有5層
		for(int i = 0; i < n + 1; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i; k++ ) {
				if(k % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//下半部4層 
		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * i; k++ ) {
				if(k % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
