import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static boolean[] prime = new boolean[100001];
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		get_prime();
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int p = n / 2;
			int q = n / 2;
			
			while(true) {
				if(!prime[p] && !prime[q]) {
					sb.append(p + " " + q).append('\n');
					break;
				}
				p--; q++;
			}
		}
		System.out.println(sb);
	}
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i)
				prime[j] = true;
		}
	}
}