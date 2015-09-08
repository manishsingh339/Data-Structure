package Stack;
/**
 * This class will implement the basic of Stack functionality. This stack will be of fixed size(eg. 5). 
 */
public class Stack_Static_Array {
	static int[] arr;
	static int top = -1;
		
	public static void main(String[] args) {
		arr = new int[5];		
		operate("push"); 
		operate("pop");
	}
	
	/**
	 * This method will call push/pop methods based  on parameter
	 */
	static void operate(String str){		
		for(int i = 0; i < 8; i++){
			if(str == "push"){
				push(i);
			}else if(str == "pop"){
				pop();
			}			
		}
	}
	
	/**
	 * This method will push elements into stack. Logic initially the top will be -1. when element will be added then it will increase by one.
	 * when top will be arr.length-1 then stack will be full, after if we will try push element in stack the will say Stack Overflow.  
	 */
	static void push(int ele){
		if(top < arr.length-1){
			top++;
			arr[top] = ele;
			System.out.println("Element Pushed to Statck: "+ele +" at Index: "+top);
		}else{
			System.out.println("Statck Overflow");
		}
	}

	/**
	 * This method will pop elements from stack. when element will be poped then it will decreased by one.
	 * when top will be 0 then stack will be empty, after if we will try pop element form stack the will say Stack Underflow.  
	 */
	static void pop(){
		if(top >= 0){
			int ele = arr[top];
		    top--;
			System.out.println("Element Poped from Statck: "+ele);
		}else{
			System.out.println("Statck Underflow");
		}
	}
}
