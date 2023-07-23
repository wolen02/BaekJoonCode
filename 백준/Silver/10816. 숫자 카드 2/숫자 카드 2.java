import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			
			String str = st.nextToken();
			
			if(map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			}else {
				map.put(str, 1);
			}
			
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			
			String str = st.nextToken();
			
			if(map.containsKey(str)) {
				sb.append(map.get(str) + " ");
			}else {
				sb.append("0 ");
			}
			
		}
		
		System.out.println(sb.toString());
		
		
	}

}