import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		
		int B = Integer.parseInt(st.nextToken());
		
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < A; i++) {
			
			int a = Integer.parseInt(st.nextToken());
			
			setA.add(a);
						
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < B; i++) {
			
			int b = Integer.parseInt(st.nextToken());
			
			setB.add(b);
						
		}
		
		Set<Integer> set = new HashSet<>();
		
		for(int n:setA) {
			
			if(setB.contains(n)) {
				set.add(n);
				setB.remove(n);
			}
			
		}
		
		for(int n:set) {
			
			if(setA.contains(n)) {
				setA.remove(n);				
			}
			
		}
		
		System.out.println(setA.size() + setB.size());

	}

}
