import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		double sum = 0;
		double creditSum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 20; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			
			double credit = Double.parseDouble(st.nextToken());
			
			String grade = st.nextToken();
			
			if(grade.equals("A+")) {
				sum += credit * 4.5;
				creditSum += credit;
			}else if(grade.equals("A0")) {
				sum += credit * 4.0;
				creditSum += credit;
			}else if(grade.equals("B+")) {
				sum += credit * 3.5;
				creditSum += credit;
			}else if(grade.equals("B0")) {
				sum += credit * 3.0;
				creditSum += credit;
			}else if(grade.equals("C+")) {
				sum += credit * 2.5;
				creditSum += credit;
			}else if(grade.equals("C0")) {
				sum += credit * 2.0;
				creditSum += credit;
			}else if(grade.equals("D+")) {
				sum += credit * 1.5;
				creditSum += credit;
			}else if(grade.equals("D0")) {
				sum += credit * 1.0;
				creditSum += credit;
			}else if(grade.equals("F")) {
				sum += credit * 0.0;
				creditSum += credit;
			}
			
		}
		
		System.out.println(sum / creditSum);
		
		

	}
	
	

}
