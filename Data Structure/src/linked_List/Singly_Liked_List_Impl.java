/**
 * In this code I have implemented the Singly Linked List with it's operations.  
 */
package linked_List;

import java.awt.List;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author Manish Kumar Singh
 * Reference 1: http://java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
 * Reference 2: http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
 * Reference 3: http://www.sanfoundry.com/java-program-implement-singly-linked-list/
 * Reference 4: http://www.programcreek.com/2014/05/leetcode-reverse-linked-list-java/   
 */

/**
 * TODO: Verify all functionality of the linked list.
 */
public class Singly_Liked_List_Impl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		
		// add elements to LinkedList
        lList.insertAtLast("1");        
        lList.insertAtLast("2");
        lList.insertAtLast("3");
        lList.insertAtLast("4");
        lList.insertAtLast("5");
        //lList.display();
        
        /*
         * Please note that primitive values can not be added into LinkedList
         * directly. They must be converted to their corresponding wrapper
         * class.
         */
 
        System.out.println("Print linkedlist: " + lList);
        System.out.println("Linkedlist size: " + lList.size());
        System.out.println("Get 3rd element: " + lList.get(3));
        System.out.println("Remove 2nd element: " + lList.removeFromPos(2));
        System.out.println("Get 3rd element: " + lList.get(3));
        System.out.println("Print linkedlist size: " + lList.size());
        System.out.println("Print linkedlist: " + lList);        
        System.out.println("Insert 0 at first position");
        lList.insertAtFirst("0");
        System.out.println("Print linkedlist: " + lList);
        
        lList.reverseLinkedList();
        //lList.display();
        System.out.println("Print linkedlist after reversing: " + lList);
        
        System.out.println("Removing first element: "+lList.removeFromPos(1));
        System.out.println("Print linkedlist: " + lList);
	}
	
}

class LinkedList{
	
	// reference to the head node.
    private Node head;
    private int listCount;
    
    // LinkedList constructor
    public LinkedList(){
    	head = null;
    	listCount = 0;
    }
    
    public void insertAtFirst(Object data){
    	Node tempNode = new Node(data);
    	Node current = head;
    	
    	if(current == null){
    		head = tempNode;
    	}else{    		
    		head = tempNode;
    		head.setNext(current);
    	}
    	
    	listCount++;
    }
    
    /**	
     * Appends the specified element to the end of this list. 
     * @param data
     */
    public void insertAtLast(Object data){
    	Node tempNode = new Node(data);
    	Node current = head;
    	
    	if(current == null){
    		head = tempNode;    	
    	}else{ 	
	    	// Starting at the head node, crawl to the end of the linked list.
	    	while(current.getNext() != null){
	    		current = current.getNext();
	    	}

	    	// the last node's "next" reference set to our new node(tempNOde)
	    	current.setNext(tempNode);
    	}
    	
    	listCount++;
    }
    
    /**
     * Inserts the specified element at the specified position in this list
     * @param data
     * @param index
     */
    public void insertAtPos(Object data, int index){
    	Node tempNode = new Node(data);
    	Node current = head;
    	
    	/* Crawl to the requested index or the last element in the list,
           whichever comes first*/
    	for(int i = 0; i < index && current.getNext() != null; i++){
    		current = current.getNext();
    	}
    	
    	// set the new node's next-node reference to this node's next-node reference.
    	tempNode.setNext(current.getNext());
    	// now set this node's next-node reference to the new node
    	current.setNext(tempNode);
    	listCount++;
    }
    
    /**
     * Returns the element at the specified position in this list
     * @param index
     * @return
     */
    public Object get(int index) {
    	// index must be 1 or higher
		if(index <= 0)
			return null;
		
		Node current = head;
		for(int i = 1; i < index; i++){
			current = current.getNext();
			if(current == null)
				return null;
		}
		
		return current.getData();
	}
    
    public boolean removeFromLast(){
    	return false;
    }
    
    /**
     * Removes the element at the specified position in this linked list.
     * @param index
     * @return Boolean
     */
    public boolean removeFromPos(int index){
    	// if the index is out of range, exit
        if (index < 1 || index > size())
            return false;
        
        Node current = head;
        for(int i = 1; i < index; i++){
        	current = current.getNext();
        	if(current == null)
        		return false;
        }

        current.setNext(current.getNext().getNext());
        listCount--;
    	return true;
    }
    
    /**
     * This function returns the size of the linked list.
     * @return
     */
    public int size(){
    	return listCount;
    }
    
    /**
     * This method display the content of linked list.
     * @return String
     */
    public void display(){    	
    	int count = 0;

        if(head == null) {
            System.out.println("\n List is empty !!");
        } else {
            Node temp = head;

            while(temp.getNext() != null) {
                System.out.println("count("+count+") , node value="+temp.getData());
                count++;
                temp = temp.getNext();
            }
            System.out.println("count("+count+") , node value="+temp.getData());
        }
        
    }
    
    /**
     * This method returns String of the linked list.
     * @return String
     */
    public String toString(){
    	Node current = head;
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }        
        return output;    	
    }

    /**
     * This method reverse the linked list.
     * @return 
     */
    public void reverseLinkedList(){    	
    	 if (head == null) {
             return;
         }
         Node current = head;
         Node after = head.getNext();
         while (after != null) {
             Node tmp = after.getNext(); // preserve what will come later.
             after.setNext(current);  // reverse the pointer
             current = after;       // advance the cursor
             after = tmp;           // the node after is the one preserved earlier.
         }
         head.next = null;         // null-out next on what was the start element 
         head = current;        	
    }
    
}


class Node{
	
	// Refers next node in the chain, or null if there isn't one.
	Node next ;
	// Data carried by this node. Could be of any type you need, So I am putting Object type.
	Object data;
	
	/**
	 * This constructor create a Node with data value and Next value will be null.
	 * @param dataVal
	 */
	public  Node(Object dataVal){
		data = dataVal;
		next = null;
	}
	
	/**
	 * This constructor creates a Node with data and Next value. 
	 * @param dataVal
	 * @param next 
	 */
	public Node(Object dataVal, Node nextVal){
		data = dataVal; 
		next = nextVal;
	}
	
	/**
	 * This function returns the data value;
	 * @return Object
	 */
	public Object getData(){
		return data;
	}
	
	/**
	 * This function set the data value;
	 * @param dataVal
	 */
	public void setData(Object dataVal){
		data = dataVal;
	}
	
	/**
	 * This function returns the next value;
	 * @return
	 */
	public Node getNext(){
		return next;
	}
	
	/**
	 * This function set the next value;
	 * @param nextVal
	 */
	public void setNext(Node nextVal){
		next = nextVal;
	}
}

