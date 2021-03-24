interface Stack{
	boolean isEmpty();
	boolean isFull();
	void push(char item); //�ֻ�� entry ��� �߰�
	char pop(); //Ȯ���� ����
	char peek(); //�ֻ�� entry ��ȸ
	void clear();
}

public class arrayStack implements Stack {
    
	private int top;
	private int stackSize;
	private char stackArr[];
	
	public arrayStack(int stkSize) {
		top = -1;
        this.stackSize = stkSize;
        stackArr = new char[this.stackSize];
	}
	
    
	//stack�� ����ִ��� Ȯ��
	public boolean isEmpty() {
		//System.out.println("Stack is empty");
		return (top == -1);
	}
	
	//stack�� ���� á���� 
	public boolean isFull() {
		//System.out.println("Stack is full");
		return (top == this.stackSize-1);
	}
	//stack�� data �߰�
	public void push(char item) {
		if(isFull()) {
			System.out.println("Stack�� �� á���ϴ�.");
		}else {
			stackArr[++top] = item;  //top++�� �־ȵ���?
			System.out.println("Inserted item: " + item);
		}
	}
	
	//stack�� �ֻ�� ������ Ȯ�� �� ����
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack�� ����־� ������ entry�� �����ϴ�");
	        return 0;
	    }else {
	    	System.out.println("Deleted item: " +stackArr[top]);
            return stackArr[top--];  	    
	    }
	}
	
	//stack�� �ֻ�� ������ ����
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		    return 0;
		}else {
			System.out.println("Peeked item: " + stackArr[top]);
			return stackArr[top];
		}
	}
	
	//stack �ʱ�ȭ
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
		top = -1;
		stackArr = new char[this.stackSize]; //���ο� ���� �迭 ����
		System.out.println("Stack is cleared!");
	    }
	}
	
	//stack�� ����� ������ ���
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack elements: ");
			for(int i=0; i<=top; i++) {
				System.out.println(stackArr[i] + "");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int stackSize = 5;
		arrayStack arrStack = new arrayStack(stackSize);
		
		arrStack.push('A');
		arrStack.printStack();
		
		arrStack.push('B');
		arrStack.printStack();
		
		arrStack.push('C');
		arrStack.printStack();
		
		arrStack.pop();
		arrStack.printStack();
		
		arrStack.peek();
		arrStack.printStack();
		
		arrStack.clear();
		arrStack.printStack();
		
	}
	
}
