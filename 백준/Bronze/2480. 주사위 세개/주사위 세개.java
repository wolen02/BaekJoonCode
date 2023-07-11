import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		
		int result = 0;
		
		if(dice1 == dice2 && dice2 == dice3 && dice3 == dice1) {
			result = 10000 + (dice1 * 1000);
		}else if(dice1 != dice2 && dice2 != dice3 && dice3 != dice1) {
			int max = Math.max(dice1, dice2);
			max = Math.max(dice3, max);
			
			result = max * 100;
			
		}else {
			if(dice1 == dice2) {
				result = 1000 + 100 * dice1;
			}else if(dice2 == dice3) {
				result = 1000 + 100 * dice2;
			}else if(dice3 == dice1) {
				result = 1000 + 100 * dice3;
			}
		}
		
		System.out.println(result);

	}
}