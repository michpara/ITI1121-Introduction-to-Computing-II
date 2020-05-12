import java.util.NoSuchElementException;

public class OrderedList implements OrderedStructure {

    private static class Node {

      	private Comparable value;
      	private Node previous;
      	private Node next;

      	private Node ( Comparable value, Node previous, Node next ) {
      	    this.value = value;
      	    this.previous = previous;
      	    this.next = next;
      	}
      	
        @Override
        public String toString() {
          return "Value: " + value;
        }
    }

    private Node head;

    public OrderedList() {
    	
    }

    public int size() {
    	int size = 0;
    	Node current = head;
    	while(current != null) {
    		size++;
    		current = current.next;
    	}
    	return size;
    }

    public Object get( int pos ) {
        int index = 0;
        Node current = head;
        while(index != pos) {
        	index++;
        	current = current.next;
        }
        return current;
    }

    public boolean add( Comparable o ) {
        Node current; 
        
        if (head == null) {
            head = new Node(o, null, null);  
            return true;
        }

        else if (head.value.compareTo(o) >= 0) 
        { 
        	Node newNode = new Node(o, null, head);
            newNode.next.previous = newNode; 
            head = newNode; 
            return true;
        } 

        else 
        { 
            current = head; 

            while (current.next != null &&  
                    current.next.value.compareTo(o) < 0) {  
                current = current.next; 
            }

            Node newNode = new Node(o, null, current.next);
 
            if (current.next != null)  
                newNode.next.previous = newNode;  

            current.next = newNode;  
            newNode.previous = current; 
            return true;
        }    	
    }

    public void remove( int pos ) {
    	Node current = head;
    	int index = 0;
    	
    	if (head == null) { 
            return; 
        } 
  
        if (pos == 0) { 
            head = head.next; 
        } 
  
        while(current != null && index != pos) {
        	current = current.next;
        	index++;
        }
        if (current.next != null) { 
            current.next.previous = current.previous; 
        } 
  
        if (current.previous != null) { 
            current.previous.next = current.next; 
        } 
  
        return; 
    }


    public void merge(OrderedList other) {
    	Node current;
    	Node otherCurrent = other.head;
    	while(otherCurrent != null) {
    		if (head == null) {
    	        head = new Node(otherCurrent.value, null, null); 
    	        otherCurrent = otherCurrent.next;
    	    }

    	    else if (head.value.compareTo(otherCurrent.value) >= 0) 
    	    { 
    	    	Node newNode = new Node(otherCurrent.value, null, head);
    	        newNode.next.previous = newNode; 
    	        head = newNode; 
    	        otherCurrent = otherCurrent.next;
    	    } 

    	    else 
    	    { 
    	        current = head; 

    	        while (current.next != null &&  
    	                current.next.value.compareTo(otherCurrent.value) < 0) {  
    	            current = current.next; 
    	        }

    	        Node newNode = new Node(otherCurrent.value, null, current.next);

    	        if (current.next != null)  
    	            newNode.next.previous = newNode;  

    	        current.next = newNode;  
    	        newNode.previous = current; 
    	        otherCurrent = otherCurrent.next;
    	    }    	
    	}
    }  
}