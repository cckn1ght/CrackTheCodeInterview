import java.util.Stack;

public class MyQueue <T>{
	Stack<T> s1;
	Stack<T> s2;
	public MyQueue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	public void push(T v) {
		s1.push(v);
	}
	public void reverseStack() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
	}
	public T remove() {
		reverseStack();
		return s2.pop();
	}
	public T peek() {
		reverseStack();
		return s2.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQ = new MyQueue();
		myQ.push(1);
		myQ.push(2);
		System.out.println(myQ.peek());
	}

}
