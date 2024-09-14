package src;

import java.security.SecureRandom;
import java.util.Base64;

public class GenerateRandomState {
	public static void main(String[] args) {
		SecureRandom sr = new SecureRandom();
		byte[] data = new byte[96];
		sr.nextBytes(data);
		
		System.out.println(Base64.getUrlEncoder().encodeToString(data));
	}
}
