package practise;

import java.time.Instant;

public class epochTime {
	
	public static void main(String[] args) {
		
		long now = Instant.now().toEpochMilli();
		
		System.out.println(now);
	}

}
