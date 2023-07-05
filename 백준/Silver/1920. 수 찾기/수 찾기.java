import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++){
		
			arr[i] = Integer.parseInt(st.nextToken());

		}

		Arrays.sort(arr);

		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());


		for(int i = 0; i < n; i++){

			int key = Integer.parseInt(st.nextToken());

			int result = binarySearch(key, arr, arr.length);

			bw.write(result + "\n");

		}

		bw.flush();
		

	}



static int binarySearch(int key, int[] target, int length){

		int first = 0;
		int last = length - 1;
		int middle = (first + last) / 2;
		
		while(first <= last){
			
			if(target[middle] == key) return 1;
			
			
			if(target[middle] > key){
				last = middle - 1;
			}else{
				first = middle + 1;
			}

		
			middle = (first + last) / 2;
		
		}

		return 0;


	} 


}