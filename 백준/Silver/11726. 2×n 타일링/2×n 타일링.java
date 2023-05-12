import java.util.Scanner;

public class Main {
	
	static int N;
	
	static long[] memory = new long[1000];
	
	static long rec(int n) {
		if(n < 3) {
			return memory[n-1];
		}
		// 저장된 값이 있을 때와 없을 때
		if(memory[n-1] > 0) {
			return memory[n-1];
		}else {
			memory[n-1] = (rec(n-1) + rec(n-2)) % 10007;
			return memory[n-1];
		}
	}

	public static void main(String[] args) {
		
		// 초반값 저장
		
		memory[0] = 1;
		memory[1] = 2;
		memory[2] = 3;
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(rec(N));
	}

}