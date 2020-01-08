public class OrderedListTest{
	
	public static void main(String args[]) {
		OrderedList ol = new OrderedList();
		OrderedList ol2 = new OrderedList();

		ol.add(13);
		ol.add(5);
		ol.add(8);
		ol.add(54);
		ol.add(6);
		
		ol2.add(2);
		ol2.add(13);
		ol2.add(9);
		ol2.add(7);
		
		
		for(int i = 0; i<ol.size();i++) {
			System.out.println(ol.get(i));
		}
		
		System.out.println("after merge");
		
		ol.merge(ol2);
		
		for(int i= 0; i<ol.size(); i++) {
			System.out.println(ol.get(i));
		}
	}
}