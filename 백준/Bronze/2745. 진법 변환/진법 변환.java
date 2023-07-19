import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		
		int B = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) < 58) {
				int ch = str.charAt(i) - 48;
				result += ch * Math.pow(B, str.length() - (1 + i));
			}else {
				int ch = str.charAt(i) - 55;
				result += ch * Math.pow(B, str.length() - (1 + i));
			}
			
		}
		
		System.out.println(result);

	}

}