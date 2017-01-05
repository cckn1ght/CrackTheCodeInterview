import java.util.Stack;

public class SortStack {
	static void sortStack(Stack<Integer> stack) {
		Stack<Integer> temp = new Stack<>();
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			while(!temp.isEmpty() && temp.peek() > tmp) {
				stack.push(temp.pop());
			}
			temp.push(tmp);
		}
		while(!temp.isEmpty()) {
			stack.push(temp.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> myStack = new Stack<>();
		myStack.push(4);
		myStack.push(1);
		myStack.push(3);
		myStack.push(2);
		sortStack(myStack);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());

	}

}
