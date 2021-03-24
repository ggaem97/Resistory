interface Stack{
	boolean isEmpty();
	boolean isFull();
	void push(char item); //최상단 entry 요소 추가
	char pop(); //확인후 삭제
	char peek(); //최상단 entry 조회
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
	
    
	//stack이 비어있는지 확인
	public boolean isEmpty() {
		//System.out.println("Stack is empty");
		return (top == -1);
	}
	
	//stack이 가득 찼는지 
	public boolean isFull() {
		//System.out.println("Stack is full");
		return (top == this.stackSize-1);
	}
	//stack에 data 추가
	public void push(char item) {
		if(isFull()) {
			System.out.println("Stack은 꽉 찼습니다.");
		}else {
			stackArr[++top] = item;  //top++은 왜안되지?
			System.out.println("Inserted item: " + item);
		}
	}
	
	//stack의 최상단 데이터 확인 후 삭제
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack이 비어있어 제거할 entry가 없습니다");
	        return 0;
	    }else {
	    	System.out.println("Deleted item: " +stackArr[top]);
            return stackArr[top--];  	    
	    }
	}
	
	//stack의 최상단 데이터 추출
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		    return 0;
		}else {
			System.out.println("Peeked item: " + stackArr[top]);
			return stackArr[top];
		}
	}
	
	//stack 초기화
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
		top = -1;
		stackArr = new char[this.stackSize]; //새로운 스택 배열 생성
		System.out.println("Stack is cleared!");
	    }
	}
	
	//stack에 저장된 데이터 출력
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
