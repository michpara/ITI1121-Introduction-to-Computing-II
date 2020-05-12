public class Iterative {

	public static BitList complement( BitList in ) {
		BitList result = new BitList();
		
		Iterator i = in.iterator();
		Iterator o = result.iterator();
		
		while(i.hasNext()) {
			int bit = i.next();
			
			if(bit == BitList.ONE) {
				o.add(BitList.ZERO);
			}
			else if(bit == BitList.ZERO) {
				o.add(BitList.ONE);
			}
		}
		return result;
	}

	public static BitList or( BitList a, BitList b ) {
		BitList result = new BitList();
		
		Iterator first = a.iterator();
		Iterator second = b.iterator();
		Iterator third = result.iterator();
		
		if(!first.hasNext()) {
            throw new IllegalArgumentException( "a is empty" );
		}
		if(!second.hasNext()) {
            throw new IllegalArgumentException( "b is empty" );
		}
		while(first.hasNext()) {
			if(!second.hasNext()) {
	             throw new IllegalArgumentException( "a and b are not of the same size" );
			}
			int firstBit = first.next();
			int secondBit = second.next();
			
			if(firstBit == BitList.ONE || secondBit == BitList.ONE) {
				third.add(BitList.ONE);
			}
			else {
				third.add(BitList.ZERO);
			}
		}
		if(second.hasNext()) {
            throw new IllegalArgumentException( "a and b are not of the same size" );
		}
		return result;
	}

	public static BitList and( BitList a, BitList b ) {

		BitList result = new BitList();
		
		Iterator first = a.iterator();
		Iterator second = b.iterator();
		Iterator third = result.iterator();
		
		while(first.hasNext()) {
			int firstBit = first.next();
			int secondBit = second.next();
			
			if(firstBit == BitList.ZERO || secondBit == BitList.ZERO) {
				third.add(BitList.ZERO);
			}
			else {
				third.add(BitList.ONE);
			}
		}
		return result;
	}

	public static BitList xor( BitList a, BitList b ) {

		BitList result = new BitList();
		
		Iterator first = a.iterator();
		Iterator second = b.iterator();
		Iterator third = result.iterator();
		
		while(first.hasNext()) {
			int firstBit = first.next();
			int secondBit = second.next();
			
			if(firstBit == secondBit) {
				third.add(BitList.ZERO);
			}
			else {
				third.add(BitList.ONE);
			}
		}
		return result;
	}
}