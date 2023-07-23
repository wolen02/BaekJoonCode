import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> set = new HashSet<>();
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			
			for(int j = 0; j < str.length() ; j++) {
				
				String temp = str.substring(j, j + i + 1);
				set.add(temp);
				if(j + i == str.length() - 1) break;
				
			}
			
		}
		
		System.out.println(set.size());
		
	}

}