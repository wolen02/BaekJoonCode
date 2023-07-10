import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue queue = new Queue();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			queue.push(i);
			
		}
		
		while(queue.size() > 1) {
			
			queue.pop();
			
			queue.push(queue.pop());
			
		}
		
		System.out.println(queue.front());
		

	}

	public static class Queue {

		private Node head;
		private Node tail;
		private int size;
		
		Queue(){
			this.head = new Node(null, null);
			this.tail = new Node(null, null);
		}
		

		public void setHead(Node head) {
			this.head = head;
		}


		public void push(int value) {
			
			if(head.getValue() == null) {
				head.setValue(value);
				tail.setValue(value);
			}else {
				if(head.getValue() == tail.getValue()) {
					tail.setValue(value);
					head.setNext(tail);
				}else {
					Node node = new Node(value, null);
					tail.setNext(node);
					tail = node;
				}
					
			}
			
			size++;
			
		}
		
		public int pop() {
			
			Integer result = head.getValue();
			
			if(result == null) return -1;
			
			if(head.getNext() != null) {
				head = head.getNext();
			}else {
				head.setValue(null);
			}
			
			size--;
			
			return result;
			
		}
		
		public int size() {
			return size;
		}
		
		public int empty() {
			
			if(size == 0) return 1;
			
			return 0;
			
		}
		
		public int front() {
			
			if(size == 0) return -1;
			
			return head.getValue();
			
		}
		
		
		public int back() {
			
			if(size == 0) return -1;
			
			return tail.getValue();
			
		}
		
	}
	
	public static class Node {

		private Integer value;
		private Node next;
		
		Node(Integer value, Node next){
			this.value = value;
			this.next = next;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}		
		
	}

	
	
}