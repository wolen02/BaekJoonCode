import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int q = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < q; i ++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String ch = st.nextToken();
			
			String temp = str.substring(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) + 1);
			
			int len = temp.length() - temp.replaceAll(ch, "").length();
			
			sb.append(len + "\n");
			
		}
		
		System.out.println(sb.toString());

	}

}