public interface OrderedStructure {

    public abstract int size();

    public abstract boolean add( Comparable obj ) throws IllegalArgumentException;
    public abstract Object get( int pos ) throws IndexOutOfBoundsException;
    public abstract void remove( int pos ) throws IndexOutOfBoundsException;
    public abstract void merge( OrderedList other );
}