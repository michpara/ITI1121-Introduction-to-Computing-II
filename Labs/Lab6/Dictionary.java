public class Dictionary implements Map<String, Integer> {

    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    private int count;

    private Pair[] elems;

    public int getCount() {
      return count;
    }

    public int getCapacity() {
      return elems.length;
    }

    public Dictionary() {
        elems = new Pair[INITIAL_CAPACITY];
        count = 0;
    }

    @Override
    public void put(String key, Integer value) {
    	if(count == INITIAL_CAPACITY) {
    		increaseCapacity();
    	}
    	if(contains(key)) {
    		replace(key, value);
    	}
        Pair pair = new Pair(key, value);
        elems[count++] = pair;
    }

    private void increaseCapacity() {
    	Pair[] newElems = new Pair[INITIAL_CAPACITY + INCREMENT];
    	for(int i = 0; i<elems.length; i++) {
    		newElems[i] = elems[i];
    	}
    	elems = newElems;
    	
    }

    @Override
    public boolean contains(String key) {
    	if(count == 0) {
    		return false;
    	}
        for(Pair pair : elems) {
        	if(pair.getKey() == key) {
        		return true;
        	}
        }
        return false;
    }

    @Override
    public Integer get(String key) {
    	int value = 0;
        for(Pair pair : elems) {
        	if(pair.getKey() == key) {
        		value =  pair.getValue();
        		break;
        	}
        }
    	return value;
        
    }

    @Override
    public void replace(String key, Integer value) {
        for(Pair pair : elems) {
        	if(pair.getKey() == key) {
        		pair.setValue(value);
        	}
        }
    }

    @Override
    public Integer remove(String key) {
    	int temp = 0;
    	int index = 0;
        for(Pair pair : elems) {
        	if(pair.getKey() == key) {
        		temp = pair.getValue();
        		elems[index] = null;
        		break;
        	}
        	index++;
        }
        return temp;
        
    }

    @Override
    public String toString() {
      String res;
      res = "Dictionary: {elems = [";
      for (int i = count-1; i >= 0 ; i--) {
          res += elems[i];
          if(i > 0) {
              res += ", ";
          }
      }
      return res +"]}";
    }

}