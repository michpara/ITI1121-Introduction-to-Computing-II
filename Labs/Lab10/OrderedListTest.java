public class OrderedListTest{
	
	public static void main(String args[]) {
		OrderedList ol = new OrderedList();
		OrderedList ol2 = new OrderedList();

		//testing add method
		ol.add(13);
		ol.add(5);
		ol.add(8);
		ol.add(54);
		ol.add(6);
		
		ol2.add(2);
		ol2.add(13);
		ol2.add(9);
		ol2.add(7);
		ol2.add(14);
		
		//testing remove method
		ol.remove(0);
		ol2.remove(4);
		
		//testing size and get method
		System.out.println("First Ordered List:");
		for(int i = 0; i<ol.size();i++) {
			System.out.println(ol.get(i));
		}
		
		System.out.println("Second Ordered List:");
		for(int i = 0; i<ol2.size();i++) {
			System.out.println(ol2.get(i));
		}
		
		System.out.println("After merge of both Ordered Lists:");
		
		//testing merge method
		ol.merge(ol2);
		
		for(int i= 0; i<ol.size(); i++) {
			System.out.println(ol.get(i));
		}
	}
}