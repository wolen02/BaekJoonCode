import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		String str = "";
		
		if(M != 0) {
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < M; i++) {
				
				str += st.nextToken();
				
			}
		}

		
		
		int min = 999999999;
		
		if(N == 100) {
			System.out.println(0);
		}else {
			
			if(M == 0) {
				String strTemp = String.valueOf(N);
				int temp = strTemp.length();
				min = Math.min(min, temp);
			}else {
				for(int i = 0; i < 1000000; i++) {
					
					String strCh = String.valueOf(i);
					
					for(int j = 0; j < str.length(); j++) {
						
						if(strCh.contains(String.valueOf(str.charAt(j) - '0'))) {
							break;
						}
						
						if(j == str.length() - 1) {
							String strTemp = String.valueOf(i);
							int temp = Math.abs(N - i) + strTemp.length();
							min = Math.min(min, temp);
						}
					}
					
				}
			}
			
					
		
			int n = Math.abs(N - 100);
			min = Math.min(min, n);
			
			System.out.println(min);
			
		}
			
	}		
		
}