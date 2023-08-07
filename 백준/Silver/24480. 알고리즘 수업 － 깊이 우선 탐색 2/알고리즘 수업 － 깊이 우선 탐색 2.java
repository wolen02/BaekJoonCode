import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(st.nextToken());
		
		int R = Integer.parseInt(st.nextToken());
		
		Node[] nodes = new Node[N + 1];
		Map<Integer, Integer> map = new HashMap<>();
		
		// 각 노드 생성
		for(int i = 1; i <= N; i++) {
			nodes[i] = new Node(i);
			map.put(i, 0);
		}
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			nodes[n1].nodes.add(n2);
			nodes[n2].nodes.add(n1);
			
		}
		
		Stack<Integer> stack = new Stack<>();		
		
		stack.add(R);
		
		int order = 1;
		
		while(stack.size() != 0) {
			
			Node node = nodes[stack.pop()];
			
			if(!node.isChecked()) {
				
				node.setChecked(true);
				map.put(node.getValue(), order);
				order++;
				
				node.nodes.sort(Comparator.naturalOrder());
				
				for(int n:node.nodes) {
					
					if(!nodes[n].isChecked()) {
						stack.add(n);
					}
					
				}
			}

			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			
			sb.append(map.get(i) + "\n");
			
		}
		
		System.out.println(sb.toString());
		
	}
	
	static class Node{
		
		private int value;
		private List<Integer> nodes = new LinkedList<>();
		private boolean checked = false;
		
		public Node(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
		
		public void setNodes(int node) {
			this.nodes.add(node);
		}
		
		public boolean isChecked() {
			return checked;
		}
		
		public void setChecked(boolean checked) {
			this.checked = checked;
		}
		
		
		
	}

}