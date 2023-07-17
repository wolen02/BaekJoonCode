import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		List<Integer> list = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			list.add(Integer.parseInt(br.readLine()));
		}
		
		list.sort(Comparator.naturalOrder());
		
		for(int i = 0; i < N; i++) {
			sb.append(list.get(i) + "\n");
		}
		
		System.out.println(sb.toString());

	}

}