import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();;
		
		int count = 0;
		
		for(int i =0; i <  N; i++) {
			
			String str = br.readLine();
			
			if(str.equals("ENTER")) {
				count += set.size();
				set = new HashSet<>();
			}else {
				set.add(str);
			}
			
			if(i == N -1) {
				count += set.size();
			}
			
		}
		
		System.out.println(count);

	}

}