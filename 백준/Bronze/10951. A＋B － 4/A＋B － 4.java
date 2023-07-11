import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		while(str != null) {
			
			StringTokenizer st = new StringTokenizer(str);
			
			int A = Integer.parseInt(st.nextToken());
			A += Integer.parseInt(st.nextToken());
			
			sb.append(A + "\n");
			
			str = br.readLine();
		}
		
		System.out.println(sb.toString());


	}

}