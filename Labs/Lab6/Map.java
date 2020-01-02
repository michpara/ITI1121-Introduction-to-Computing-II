public interface Map< K, V> {
	public abstract V get (K key);
	public abstract boolean contains(K key);
	public abstract void put(K key, V value);
	public abstract void replace(K key, V value);
	public abstract V remove(K key);
}