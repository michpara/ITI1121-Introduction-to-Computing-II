//tests the findAndReplace method in Utils.java
public class TestFindAndReplace {
  public static void main(String[] args){
	  boolean testPassed = (testInIsNull() &&
	  testQueryIsNull() &&
	  testReplacementIsNull() &&
	  testInAndQueryAreNull() &&
	  testInAndReplacementreNull() &&
	  testQueryAndReplacementreNull() &&
	  testAllNull() &&
	  testNotSameLength() &&
	  testNullInIn() &&
	  testNullInQuery() &&
	  testNullInReplacement() &&
	  testNoChange1() &&
	  testNoChange2() &&
	  testChangeFirst1() &&
	  testChangeFirst2() &&
	  testChangeLast() &&
	  testChangeLeft() &&
	  testMultipleChanges1() &&
	  testMultipleChanges2());
	  if (testPassed){
		  System.out.println("All Test passed: Success!");
	  }
	  else{
		  System.out.println("Failure");
	  }  
  }
	
    public static boolean testInIsNull() {
		String[] query = { "I" };
		String[] replacement = { "You" };
		if(Utils.findAndReplace( null, query, replacement ) == null){
			return true;
		}
		else{
			System.out.println("test 'testInIsNull' Failed");
			return false;
		}
    }

    public static boolean testQueryIsNull() {
		String[] text = { "I", "understand" };
		String[] replacement = { "You" };
		if(Utils.findAndReplace( text, null, replacement ) == null){
				return true;
			}
		else{
			System.out.println("test 'testQueryIsNull' Failed");
			return false;
		}
    }

    public static boolean testReplacementIsNull() {
		String[] text = { "I", "understand" };
		String[] query = { "I" };
		if(Utils.findAndReplace( text, query, null ) == null){
				return true;
			}
		else{
			System.out.println("test 'testReplacementIsNull' Failed");
			return false;
		}
    }

    public static boolean testInAndQueryAreNull() {
		String[] replacement = { "You" };
		if(Utils.findAndReplace( null, null, replacement ) == null){
				return true;
			}
		else{
			System.out.println("test 'testInAndQueryAreNull' Failed");
			return false;
		}
    }

    public static boolean testInAndReplacementreNull() {
		String[] query = { "I" };
		if(Utils.findAndReplace( null, query, null ) == null){
				return true;
			}
		else{
			System.out.println("test 'testInAndReplacementreNull' Failed");
			return false;
		}
    }

    public static boolean testQueryAndReplacementreNull() {
		String[] text = { "I", "understand" };
		if(Utils.findAndReplace( text, null, null ) == null){
				return true;
			}
		else{
			System.out.println("test 'testQueryAndReplacementreNull' Failed");
			return false;
		}
    }

    public static boolean testAllNull() {
		if(Utils.findAndReplace( null, null, null ) == null){
				return true;
			}
		else{
			System.out.println("test 'testAllNull' Failed");
			return false;
		}
    }

    public static boolean testNotSameLength() {
		String[] text = { "I", "understand" };
		String[] query = { "I" };
		String[] replacement = { "You", "They" };
		if(Utils.findAndReplace( text, query, replacement ) == null){
				return true;
			}
		else{
			System.out.println("test 'testNotSameLength' Failed");
			return false;
		}
    }

    public static boolean testNullInIn() {
		String[] text = { "I", null };
		String[] query = { "I" };
		String[] replacement = { "You" };
		if(Utils.findAndReplace( text, query, replacement ) == null){
				return true;
			}
		else{
			System.out.println("test 'testNullInIn' Failed");
			return false;
		}
		
    }

    public static boolean testNullInQuery() {
		String[] text = { "I", "understand" };
		String[] query = { "I", null };
		String[] replacement = { "You", "They" };
		if(Utils.findAndReplace( text, query, replacement ) == null){
				return true;
			}
		else{
			System.out.println("test 'testNullInQuery' Failed");
			return false;
		}
    }

	
    public static boolean testNullInReplacement() {
		String[] text = { "I", "understand" };
		String[] query = { "I", "We" };
		String[] replacement = { null, "They" };
		if(Utils.findAndReplace( text, query, replacement ) == null){
				return true;
			}
		else{
			System.out.println("test 'testNullInReplacement' Failed");
			return false;
		}
    }

    public static boolean testNoChange1() {
		String[] text = { "I", "understand" };
		String[] query = { };
		String[] replacement = { };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (text[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testNoChange1' Failed");
			return false;
		}
    }

	public static boolean testNoChange2() {
		String[] text = { "I", "understand" };
		String[] query = { "You" };
		String[] replacement = { "I" };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (text[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testNoChange2' Failed");
			return false;
		}
    }

    public static boolean testChangeFirst1() {
		String[] text = { "I", "understand" };
		String[] query = { text[ 0 ] };
		String[] replacement = { "You" };
		String[] expected = { replacement[ 0 ], text[ 1 ] };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (expected[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testChangeFirst1' Failed");
			return false;
		}
    }

    public static boolean testChangeFirst2() {
		String[] text = { "I", "understand" };
		String[] query = { new String( "I" ) };
		String[] replacement = { "You" };
		String[] expected = { "You", "understand" };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (expected[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testChangeFirst2' Failed");
			return false;
		}
    }

    public static boolean testChangeLast() {
		String[] text = { "I", "understand" };
		String[] query = { new String( "understand" ) };
		String[] replacement = { "see" };
		String[] expected = { "I", "see" };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (expected[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testChangeLast' Failed");
			return false;
		}
    }

    public static boolean testChangeLeft() {
		String[] text = { "I", "understand" };
		String[] query = { new String( "understand" ), new String( "understand" ) };
		String[] replacement = { "see", "grasp" };
		String[] expected = { "I", "see" };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (expected[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testChangeLeft' Failed");
			return false;
		}
    }

    public static boolean testMultipleChanges1() {
		String[] text = { "I", "like", "Java" };
		String[] query = { new String( "I" ), new String( "like" ), new String( "Java" ) };
		String[] replacement = { "You", "enjoy", "object-oriented programming" };
		String[] expected = { "You", "enjoy", "object-oriented programming" };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (expected[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testMultipleChanges1' Failed");
			return false;
		}
    }

    public static boolean testMultipleChanges2() {
		String[] text = { "I", "like", "Java" };
		String[] query = { new String( "I" ), new String( "Java" ), new String( "like" ) };
		String[] replacement = { "You", "object-oriented programming", "enjoy" };
		String[] expected = { "You", "enjoy", "object-oriented programming" };
		String[] result = Utils.findAndReplace( text, query, replacement );
		boolean flag = true;
		if (result == null){
			flag = false;
		}
		if (result == text){
			flag = false;
		}
		if (text.length != result.length){
			flag = false;
		}
		for ( int i=0; i<text.length; i++ ) {
			if (expected[i] != result[i]){
				flag=false;
			}
		}
		if(flag){
			return true;
		}
		else{
			System.out.println("test 'testMultipleChanges2' Failed");
			return false;
		}
    }  
}
