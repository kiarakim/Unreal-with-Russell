import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = N;

		for (int i = 0; i < N; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			if(num == 1)
				cnt--;
			else {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if(num % j == 0) {
						cnt--;
						break;
					}	
				}
			}
		}
		System.out.println(cnt);
	}
}