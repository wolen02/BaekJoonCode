import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[1000];
		
		int sum = 0;
		long count = 0;
		
		for(int i = 0; i < N; i++) {
			
			sum += Integer.parseInt(st.nextToken());
			
			sum %= M;
			
			count += arr[sum];
			
			arr[sum]++;
			
			if(sum == 0) {
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}