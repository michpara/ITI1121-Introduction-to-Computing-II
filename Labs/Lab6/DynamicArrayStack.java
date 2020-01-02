public class DynamicArrayStack<E> implements Stack<E> {

    // Instance variables

    private E[] elems;  // Used to store the elements of this ArrayStack
    private int top;    // Designates the first free cell
    private static final int DEFAULT_INC = 25;   //Used to store default increment / decrement

    @SuppressWarnings( "unchecked" )

    // Constructor
    public DynamicArrayStack( int capacity ) {
        if(capacity < DEFAULT_INC) {
            elems = (E[]) new Object[DEFAULT_INC];
        }
        else {
        	elems =(E[]) new Object[capacity];
        }
        top = 0;
    }

    
    // Gets current capacity of the array
    public int getCapacity() {
        return elems.length;
    }

    // Returns true if this DynamicArrayStack is empty
    public boolean isEmpty() {
        return ( top == 0 );
    }

    // Returns the top element of this ArrayStack without removing it
    public E peek() {
        return elems[ top-1 ];
    }

    @SuppressWarnings( "unchecked" )

    // Removes and returns the top element of this stack
    public E pop() {
    	E[] newElems;
    	if(top == (elems.length - DEFAULT_INC)) {
    		newElems = (E[]) new Object[top];
    		for(int i = 0; i<top; i++) {
    			newElems[i] = elems[i];
    		}
    		elems = newElems;
    	}
    	E saved = elems[ --top ];

        elems[ top ] = null; // scrub the memory!

        return saved;
    }

    @SuppressWarnings( "unchecked" )

    // Puts the element onto the top of this stack.
    public void push( E element ) {
    	if(top == elems.length-1) {
    		E[] newElems = (E[]) new Object[DEFAULT_INC + elems.length];
    		for(int i = 0; i<elems.length; i++) {
    			newElems[i] = elems[i];
    		}
        	elems = newElems;
    	}
    	elems[top++] = element;
    }

    @SuppressWarnings( "unchecked" )
    public void clear() {
    	for(int i = 0; i<elems.length; i++) {
    		elems[i] = null;
    	}
    	top = 0;
    }
    
    public static void main( String[] args ) {

        DynamicArrayStack<String> s;

        s = new DynamicArrayStack<String>(10);
        
        System.out.println(s.getCapacity()); //should be 25

        for ( int i=0; i<25; i++ ) {
            s.push( "Elem-" + i );
        }

        s.clear();

        while ( ! s.isEmpty() ) {
            System.out.println( s.pop() );
        }

        for ( int i=0; i<30; i++ ) {
            s.push( "** Elem-" + i );
        }
        
        System.out.println(s.getCapacity()); //should be 50

        for(int i = 0; i<6; i++) {
            System.out.println( s.pop() );
        }
        
        System.out.println(s.getCapacity());//should be 25
    }
}
