import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int max = 0;
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int A = Integer.parseInt(st.nextToken());
			sum+=A;
			max = Math.max(max, A);
		}
		
		double result = (sum / (double)max) * 100 /(double)N;
		
		
		System.out.println(result);

	}

}