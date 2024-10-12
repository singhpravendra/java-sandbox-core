/**
 * 
 */
package com.collectionFramework;

import java.util.Scanner;

/**
 * @author pravendra.singh
 *
 */
class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(){
			next = null;
	        prev = null;
	        data = 0;
		}
		public Node(int d, Node n, Node p)
	    {
	        data = d;
	        next = n;
	        prev = p;
	    }
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
		
		
	}
	
	
	class linkedList
	{
	    protected Node start;
	    protected Node end ;
	    public int size;
	 
	    /* Constructor */
	    public linkedList()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    /* Function to check if list is empty */
	    public boolean isEmpty()
	    {
	        return start == null;
	    }
	    /* Function to get size of list */
	    public int getSize()
	    {
	        return size;
	    }
	    /* Function to insert element at begining */
	    public void insertAtStart(int val)
	    {
	        Node nptr = new Node(val, null,null);        
	        if(start == null)
	        {
	            start = nptr;
	            end = start;
	        }
	        else
	        {
	            start.setPrev(nptr);
	            nptr.setNext(start);
	            start = nptr;
	        }
	        size++;
	    }
	    /*Function to insert the element at the end*/
	    public void insertAtEnd(int val){
	    	Node nptr = new Node(val, null,null);
	    	if(start == null){
	    		start = nptr;
	    		end = start;
	    	}
	    	else{
	    		start.setPrev(end);
	    		end.setNext(nptr);
	    		end = nptr;
	    		
	    	}
	    }
	    public void display()
	    {
	        System.out.print("\nDoubly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }
	        if (start.getNext() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ " <-> ");
	        ptr = start.getNext();
	        while (ptr.getNext() != null)
	        {
	            System.out.print(ptr.getData()+ " <-> ");
	            ptr = ptr.getNext();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
}
	public class DoublyLinkedList
	{    
	    public static void main(String[] args)
	    {            
	        Scanner scan = new Scanner(System.in);
	        /* Creating object of linkedList */
	        linkedList list = new linkedList(); 
	        System.out.println("Doubly Linked List Test\n");    
	        /*  Perform list operations  */
	        list.insertAtStart( scan.nextInt() );
	        list.display();
	        
	    }
	}
