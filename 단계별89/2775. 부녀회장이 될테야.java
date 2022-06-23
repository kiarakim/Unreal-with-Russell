import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			int[] arr = new int[n];
			for (int j = 0; j < n; j++)
				arr[j] = j + 1;

			for (int j = 0; j <= k - 1; j++) {
				for (int t = 1; t < n; t++)
					arr[t] += arr[t - 1];
			}
			sb.append(arr[n-1]).append('\n');

		}
		System.out.println(sb);
	}
}