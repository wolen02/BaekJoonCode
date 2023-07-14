import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 2;
		
		if(N == 1) {
			System.out.println("");
		}else {
			while(N != 1) {
				if(N%num == 0) {
					sb.append(num + "\n");
					N/=num;
				}else {
					num++;
				}
			}
		}
		
		System.out.println(sb.toString());
		
		
	}

}