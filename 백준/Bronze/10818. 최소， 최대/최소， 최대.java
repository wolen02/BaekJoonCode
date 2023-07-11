import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int max = Integer.parseInt(st.nextToken());
		int min = max;
		
		for(int i = 0; i < N - 1; i++) {
			
			int n = Integer.parseInt(st.nextToken());
			
			max = Math.max(max, n);
			min = Math.min(min, n);
			
		}
		
		System.out.println(min + " " + max);
		
		
		

	}

}