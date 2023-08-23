import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			
			sb.append(i + "\n");
			
		}
		
		System.out.println(sb.toString());
		
	}

}