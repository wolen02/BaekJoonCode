import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int B = Integer.parseInt(st.nextToken());
		
		String str = "";
		
		while(true) {
			
			int remain = N % B;
			
			if(remain < 10) {
				str += remain;
			}else {
				char ch = (char) (remain + 55);
				str += ch;
			}
			
			
			if(N / B == 0) {
				break;
			}else {
				N /= B;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
		

	}

}