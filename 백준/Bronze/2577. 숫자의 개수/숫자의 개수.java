import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int result = A * B * C;
		
		String strResult = String.valueOf(result);
		
		for(int i = 0; i < 10; i++) {
			
			String str = strResult.replaceAll(String.valueOf(i), "");
			sb.append(strResult.length() - str.length() + "\n");
			
		}
		
		System.out.println(sb.toString());
		
	}

}