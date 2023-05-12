import java.util.Scanner;

public class Main {
	
	static int N;
	
	// 연산시간 단축을 위해 저장공간 만들기
	static int memory[] = new int[1000000];
	
	static int cal(int n) {
		// 입력값이 1인경우
		if(n == 1) return 0;
		
		// 값이 이미 있는 경우 출력
		if(memory[n-1] > 0) return memory[n-1];		
		
		// 각 입력값중 -1,/2,/3 한 값중 연산 값이 가장 작은 값 출력
		
		memory[n-1] = cal(n-1) + 1;
		if(n % 2 == 0) {
			int tem = cal(n/2) + 1;
			if(memory[n-1] > tem) {
				memory[n-1] = tem;
			}
		}
		if(n % 3 == 0) {
			int tem = cal(n/3) + 1;
			if(memory[n-1] > tem) {
				memory[n-1] = tem;
			}
		}
		
		return memory[n-1];
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		memory[1] = 1;
		memory[2] = 1;
		
		N = sc.nextInt();
		
		System.out.println(cal(N));
		
	}

}