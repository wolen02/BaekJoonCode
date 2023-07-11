import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int time = sc.nextInt();
		
		if(M + time >= 60) {
			H += (M + time) / 60;
			M = (M + time) % 60;
			if(H >= 24) {
				H-=24;
			}
		}else {
			M += time;
		}
		
		System.out.println(H + " " + M);

	}

}