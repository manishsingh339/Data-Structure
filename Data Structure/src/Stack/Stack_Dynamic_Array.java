package Stack;
/**
 * In static array implementation we are changing the top but size of the array is remaining same and memory 
 * is not getting free.   
 **/
public class Stack_Dynamic_Array {
	static int capacity = 1;
	static int[] arr = new int[capacity];	
	static int top = -1;
	
	public static void main(String[] args) {
		stackOperation("push");
		stackOperation("pop");
	}
	
	/**
	 * This method will call push/pop methods.   
	 **/
	static void stackOperation(String str){
		for(int i = 0; i < 10; i++){
			if(str == "push"){
				push(i);
			}else if(str == "pop"){
				pop();
			}
		}
	}
	
	/**
	 * This method will push element into the stack.   
	 **/
	static void push(int ele){
		if(isStackFull())
			doubleStatck();
		arr[++top] = ele;
		System.out.println("Element added to the statck: "+ele);
	}
	
	/**
	 * This method will pop element from the stack.   
	 **/
	static void pop(){
		if(isEmpty())
			System.out.println("Stack UnderFlow");
		else
			System.out.println("Element poped: "+(arr[top--])); 
	}
	
	/**
	 * This method will check stack is full or not.   
	 **/
	static boolean isStackFull(){
		return (top == capacity-1);
	}
	
	/**
	 * This method will increase the stack size.   
	 **/
	static void doubleStatck(){
		int[] newArray = new int[capacity*2];
		for(int i = 0; i < arr.length; i++){
			newArray[i] = arr[i];
		}
		capacity = capacity*2;
		arr = newArray;
		System.out.println("New capacity is: "+capacity);
	}
	
	/**
	 * This method will check stack is empty or not.   
	 **/
	static boolean isEmpty(){
		return (top == -1);
	} 

}
