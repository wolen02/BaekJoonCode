import java.util.Scanner;

public class Main {
	// 저장공간 확보
	static int memory[] = new int[11];
	
	static int cal(int n) {
		// 3보다 작을 땐 저장된 값 사용
		if(n <= 3) {
			return memory[n];
		}else {
			memory[n] = cal(n-1) + cal(n-2) + cal(n-3);
			return memory[n];
		}
	}

	public static void main(String[] args) {
		
		memory[1] = 1;
		memory[2] = 2;
		memory[3] = 4;

		Scanner sc = new Scanner(System.in);
		
			int N = sc.nextInt();
			
			for(int i = 0; i < N; i++) {
				int n = sc.nextInt();
				System.out.println(cal(n));
			}
		
	}

}
