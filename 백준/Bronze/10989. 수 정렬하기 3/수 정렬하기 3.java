import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10001];
		
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
				
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			
			while(arr[i] > 0) {
				sb.append(i + "\n");
				arr[i]--;
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}