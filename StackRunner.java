class Stack{
	int stack[]=new int[5];
	int top=0;
	
	public void push(int value) {
		if(top==stack.length) {
			System.out.println("Stack is full");
		}
		else {
			stack[top]=value;
			top++;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			top--;
			stack[top]=0;
		}
	}
	
	public int peak() {
		return stack[--top];
	}
	
	public boolean isEmpty() {
		if(top<=0) {
			return true;
		}
		else
			return false;
	}
	
	public void show() {
		for(int n:stack) {
			System.out.print(" "+n);
		}
		System.out.println();
	}
}


public class StackRunner {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(5);
		s.show();
		s.push(6);
		s.show();
		s.push(7);
		s.show();
		s.push(10);
		s.show();
		s.push(13);
		s.show();
		s.push(13);
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.push(20);
		s.show();
		s.push(32);
		s.show();
		s.pop();
		s.show();
		System.out.println("peak value "+s.peak());
		s.show();
	}
}
