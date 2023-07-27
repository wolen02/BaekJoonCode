import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			
			if(str.equals("push_front")) {
				deque.addFirst(Integer.parseInt(st.nextToken()));
			}else if(str.equals("push_back")) {
				deque.addLast(Integer.parseInt(st.nextToken()));
			}else if(str.equals("pop_front")) {
				
				Integer num = deque.pollFirst();
				
				if(num == null) {
					sb.append(-1 + "\n");
				}else {
					sb.append(num + "\n");
				}
				
			}else if(str.equals("pop_back")) {
				
				Integer num = deque.pollLast();
				
				if(num == null) {
					sb.append(-1 + "\n");
				}else {
					sb.append(num + "\n");
				}
			}else if(str.equals("size")) {
				sb.append(deque.size() + "\n");
			}else if(str.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
			}else if(str.equals("front")) {
				if(deque.peekFirst() == null) {
					sb.append(-1 + "\n");
				}else {
					sb.append(deque.peekFirst() + "\n");
				}
			}else if(str.equals("back")) {
				if(deque.peekLast() == null) {
					sb.append(-1 + "\n");
				}else {
					sb.append(deque.peekLast() + "\n");
				}
			}
			
		}
		
		
		System.out.println(sb.toString());

		
	}

}
