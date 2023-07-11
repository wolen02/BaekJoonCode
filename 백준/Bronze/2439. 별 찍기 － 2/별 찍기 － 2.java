import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			sb.append(" ");
		}
		
		for(int i = 1; i <= N; i++) {
			sb.deleteCharAt(sb.length() - i);
			sb.append("*");
			System.out.println(sb.toString());
		}

	}

}