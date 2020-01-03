/**
 * Defines the <code>Map</code> abstract data type. An object that maps keys to
 * values. For this project, a map can contain duplicate keys, in which cases
 * the methods <code>get</code>, <code>put</code>, and <code>remove</code> refer
 * to the leftmost (last) association for the given key.
 *
 * @author Marcel Turcotte (turcotte@eecs.uottawa.ca)
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public interface Map< K, V> {

    /**
     * Returns the lefmost value associated with this key.
     *
     * @param key key whose associated value is to be returned
     * @return the value associated with this key
     */
    public abstract V get(K key);

    /**
     * Returns true if an association exists for this key.
     *
     * @param key looking up for an association containing this key
     * @return true if this map contains the specified key
     */
    public abstract boolean contains(K key);

    /**
     * Creates a new association: <code>key,value</code>.
     *
     * @param key key with which the specified value is to be associated
     * @param value the value to be associated with this key
     */
    public abstract void put(K key, V value);

    /**
     * Replaces the value of the leftmost occurrence of the key.
     *
     * @param key key with which the specified value is to be associated
     * @param value the value to be associated with this key
     */
    public abstract void replace(K key, V value);

    /**
     * Removes the association the leftmost association: <code>key,value</code>.
     *
     * @param key the key of the association to remove
     * @return value associated this key
     */
    public abstract V remove(K key) ;

}