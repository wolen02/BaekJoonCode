import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static boolean[][] checked;
	static Queue<Node> queue = new LinkedList<>();
	static int N;
	static int M;
	static int count;
	static int maxCount;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		
		N = Integer.parseInt(st.nextToken());

		checked = new boolean[N][M];
		
		count = 0;
		maxCount = N*M;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < M; j++) {
				
				int temp = Integer.parseInt(st.nextToken());
				
				if(temp == 1) {
					queue.add(new Node(i,j, 0));
				}
				if(temp == -1) {
					checked[i][j] = true;
					maxCount--;
				}
				
			}
			
		}
		
		System.out.println(search());
	
		
	}
	static int search() {
		
		if(queue.size() == 0) {
			return -1;
		}
		
		while(!queue.isEmpty()) {
			
			Node node = queue.poll();
			
			if(!checked[node.y][node.x]) {
				checked[node.y][node.x] = true;
				count++;
			}else {
				continue;
			}
			
			if(end() == 0) {
				return node.dist;
			}
			
			for(int i = 0; i < 4; i++) {
				
				if(node.x -1 >= 0 && !checked[node.y][node.x - 1]) {
					queue.add(new Node(node.y, node.x-1, node.dist+1));
				}
				
				if(node.x + 1 <= M -1 && !checked[node.y][node.x+1]) {
					queue.add(new Node(node.y, node.x+1, node.dist+1));
				}
				
				if(node.y - 1 >=0 && !checked[node.y-1][node.x]) {
					queue.add(new Node(node.y-1, node.x, node.dist+1));
				}
				
				if(node.y + 1 <= N -1 && !checked[node.y+1][node.x]) {
					queue.add(new Node(node.y +1, node.x, node.dist+1));
				}
				
			}
			
			
		}
		
		return - 1;
		
	}
	
	static int end() {
		
		if(count == maxCount) {
			return 0;
		}else {
			return -1;
		}
		
	}
	
	
	static class Node{
		
		private int x;
		private int y;
		private int dist;
		
		public Node(int y, int x, int dist) {
			this.y = y;
			this.x = x;
			this.dist = dist;
		}
		
		
	}

}