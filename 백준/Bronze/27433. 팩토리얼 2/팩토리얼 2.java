import java.util.Scanner;

public class Main {
	
	static long result = 1;
	
	public static long fac(int n) {
		result = result*n;
		if(n == 1) {
			return result;
		}else {
			return fac(n-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			if(N==0) {
				System.out.println(1);
			}else {
				System.out.println(fac(N));	
			}

	}

}