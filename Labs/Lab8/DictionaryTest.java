import java.util.NoSuchElementException;

public class DictionaryTest {

    public static void assertEquals(int i, int j) {
        if(i!=j) {
            System.out.println("Failure, expected " + i + " and got " + j);
        }
    }

    public static void assertTrue(boolean b) {
        if(!b) {
            System.out.println("Failure, expected true, got false");
        }
    }

    public static void assertFalse(boolean b) {
        if(b) {
            System.out.println("Failure, expected false, got true");
        }
    }

    public static void testGetX() {
        System.out.println("test: testGetX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        assertEquals(Integer.valueOf(1), dict.get("X"));
    }

    public static void testGetY() {
        System.out.println("test: testGetY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        assertEquals(Integer.valueOf(2), dict.get("Y"));
    }

    public static void testGetZ() {
        System.out.println("test: testGetZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        assertEquals(Integer.valueOf(3), dict.get("Z"));
    }

    public static void testGetXX() {
        System.out.println("test: testGetXX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("X", Integer.valueOf(4));
        assertEquals(Integer.valueOf(4), dict.get("X"));
    }

    public static void testGetYY() {
        System.out.println("test: testGetYY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Y", Integer.valueOf(4));
        assertEquals(Integer.valueOf(4), dict.get("Y"));
    }

    public static void testGetZZ() {
        System.out.println("test: testGetZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Z", Integer.valueOf(4));
        assertEquals(Integer.valueOf(4), dict.get("Z"));
    }

    public static void testContainsEmpty() {
        System.out.println("test: testContainsEmpty");
        Dictionary dict = new Dictionary();
        assertFalse(dict.contains("X"));
    }

    public static void testContainsNotFound() {
        System.out.println("test: testContainsNoFound");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        assertFalse(dict.contains("W"));
    }

    public static void testContainsX() {
        System.out.println("test: testContainsX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        assertTrue(dict.contains("X"));
    }

    public static void testContainsY() {
        System.out.println("test: testContainsY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        assertTrue(dict.contains("Y"));
    }

    public static void testContainsZ() {
        System.out.println("test: testContainsZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        assertTrue(dict.contains("Z"));
    }

    public static void testContainsXX() {
        System.out.println("test: testContainsXX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("X", Integer.valueOf(4));
        assertTrue(dict.contains("X"));
    }

    public static void testContainsYY() {
        System.out.println("test: testContainsYY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Y", Integer.valueOf(4));
        assertTrue(dict.contains("Y"));
    }

    public static void testContainsZZ() {
        System.out.println("test: testContainsZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Z", Integer.valueOf(4));
        assertTrue(dict.contains("Z"));
    }

    public static void testPutDyncamicArray() {
        System.out.println("test: testPutDyncamicArray");
        Dictionary dict = new Dictionary();
        for (int i = 0; i < 1000; i++) {
            dict.put("X" + i, Integer.valueOf(i));
        }
        for (int i = 0; i < 1000; i++) {
            assertEquals(Integer.valueOf(i), dict.get("X" + i));
        }
    }

    public static void testReplaceX() {
        System.out.println("test: testReplaceX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.replace("X", Integer.valueOf(4));
        assertEquals(Integer.valueOf(4), dict.get("X"));
    }

    public static void testReplaceY() {
        System.out.println("test: testReplaceY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.replace("Y", Integer.valueOf(4));
        assertEquals(Integer.valueOf(4), dict.get("Y"));
    }

    public static void testReplaceZ() {
        System.out.println("test: testReplaceZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.replace("Z", Integer.valueOf(4));
        assertEquals(Integer.valueOf(4), dict.get("Z"));
    }

    public static void testReplaceXX() {
        System.out.println("test: testReplaceXX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("X", Integer.valueOf(4));
        dict.replace("X", Integer.valueOf(5));
        assertEquals(Integer.valueOf(5), dict.get("X"));
    }

    public static void testReplaceYY() {
        System.out.println("test: testReplaceYY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Y", Integer.valueOf(4));
        dict.replace("Y", Integer.valueOf(5));
        assertEquals(Integer.valueOf(5), dict.get("Y"));
    }

    public static void testReplaceZZ() {
        System.out.println("test: testReplaceZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Z", Integer.valueOf(4));
        dict.replace("Z", Integer.valueOf(5));
        assertEquals(Integer.valueOf(5), dict.get("Z"));
    }

    public static void testRemoveX() {
        System.out.println("test: testRemoveX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.remove("X");
        assertFalse(dict.contains("X"));
        assertEquals(Integer.valueOf(2), dict.get("Y"));
        assertEquals(Integer.valueOf(3), dict.get("Z"));
    }

    public static void testRemoveY() {
        System.out.println("test: testRemoveY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.remove("Y");
        assertFalse(dict.contains("Y"));
        assertEquals(Integer.valueOf(1), dict.get("X"));
        assertEquals(Integer.valueOf(3), dict.get("Z"));
    }

    public static void testRemoveZ() {
        System.out.println("test: testRemoveZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.remove("Z");
        assertFalse(dict.contains("Z"));
        assertEquals(Integer.valueOf(1), dict.get("X"));
        assertEquals(Integer.valueOf(2), dict.get("Y"));
    }

    public static void testRemoveXX() {
        System.out.println("test: testRemoveXX");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("X", Integer.valueOf(4));
        dict.remove("X");
        assertEquals(Integer.valueOf(1), dict.get("X"));
        assertEquals(Integer.valueOf(2), dict.get("Y"));
        assertEquals(Integer.valueOf(3), dict.get("Z"));
    }

    public static void testRemoveYY() {
        System.out.println("test: testRemoveYY");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Y", Integer.valueOf(4));
        dict.remove("Y");
        assertEquals(Integer.valueOf(1), dict.get("X"));
        assertEquals(Integer.valueOf(2), dict.get("Y"));
        assertEquals(Integer.valueOf(3), dict.get("Z"));
    }

    public static void testRemoveZZ() {
        System.out.println("test: testRemoveZZ");
        Dictionary dict = new Dictionary();
        dict.put("X", Integer.valueOf(1));
        dict.put("Y", Integer.valueOf(2));
        dict.put("Z", Integer.valueOf(3));
        dict.put("Z", Integer.valueOf(4));
        dict.remove("Z");
        assertEquals(Integer.valueOf(1), dict.get("X"));
        assertEquals(Integer.valueOf(2), dict.get("Y"));
        assertEquals(Integer.valueOf(3), dict.get("Z"));
    }

    public static void testGetStatic() {
        System.out.println("test: testStatic");
        Dictionary d1 = new Dictionary();
        Dictionary d2 = new Dictionary();
        d1.put("X", Integer.valueOf(1));
        assertFalse(d2.contains("X"));
    }

    public static void testGetNullPointerException() {
                boolean success = false;
        try {

        System.out.println("test: testGetNullPointerException");
        Dictionary dict = new Dictionary();
        dict.get(null);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);
    }

    public static void testGetNoSuchElementException() {
                boolean success = false;
        try {

        System.out.println("test: testGetNoSuchElementException");
        Dictionary dict = new Dictionary();
        dict.get("V");
        } catch(NoSuchElementException e){
            success = true;
        }
        assertTrue(success);
    }

    public static void testGetNoSuchElementExceptionNonEmpty() {
                boolean success = false;
        try {

        System.out.println("test: testGetNoSuchElementExceptionNonEmpty");
        Dictionary dict = new Dictionary();
        dict.put("X", 1);
        dict.put("Y", 2);
        dict.put("Z", 3);
        dict.get("V");
        } catch(NoSuchElementException e){
            success = true;
        }
        assertTrue(success);
    }


    public static void testContainsNullPointerException() {
                boolean success = false;
        try {

        System.out.println("test: testContainsNullPointerException");
        Dictionary dict = new Dictionary();
        dict.contains(null);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);
    }


    public static void testPutNullPointerExceptionKey() {
                boolean success = false;
        try {

        System.out.println("test: testPutNullPointerExceptionKey");
        Dictionary dict = new Dictionary();
        dict.put(null, 1);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);

    }

    public static void testPutNullPointerExceptionValue() {
                boolean success = false;
        try {

        System.out.println("test: testPutNullPointerExceptionValue");
        Dictionary dict = new Dictionary();
        dict.put("X", null);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);

    }

    public static void testPutNullPointerExceptionKeyValue() {
                boolean success = false;
        try {

        System.out.println("test: testPutNullPointerExceptionKeyValue");
        Dictionary dict = new Dictionary();
        dict.put(null, null);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);
    }

    public static void testReplaceNullPointerExceptionKey() {
                boolean success = false;
        try {

        System.out.println("test: testReplaceNullPointerExceptionKey");
        Dictionary dict = new Dictionary();
        dict.replace(null, 1);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);

    }

    public static void testReplaceNullPointerExceptionValue() {
                boolean success = false;
        try {

        System.out.println("test: testReplaceNullPointerExceptionValue");
        Dictionary dict = new Dictionary();
        dict.replace("X", null);

         } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);
   }

    public static void testReplaceNullPointerExceptionKeyValue() {
                boolean success = false;
        try {

        System.out.println("test: testReplaceNullPointerExceptionKeyValue");
        Dictionary dict = new Dictionary();
        dict.replace(null, null);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);
    }


    public static void testReplaceNoSuchElementException() {
                boolean success = false;
        try {

        System.out.println("test: testReplaceNoSuchElementException");
        Dictionary dict = new Dictionary();
        dict.replace("V", 1);
        } catch(NoSuchElementException e){
            success = true;
        }
        assertTrue(success);
    }

    public static void testRemoveNullPointerException() {
                boolean success = false;
        try {

        System.out.println("test: testRemoveNullPointerException");
        Dictionary dict = new Dictionary();
        dict.remove(null);
        } catch(NullPointerException e){
            success = true;
        }
        assertTrue(success);
    }

    public static void testRemoveNoSuchElementException() {
                boolean success = false;
        try {

        System.out.println("test: testRemoveNoSuchElementException");
        Dictionary dict = new Dictionary();
        dict.remove("V");
        } catch(NoSuchElementException e){
            success = true;
        }
        assertTrue(success);
    }

    public static void testRemoveNoSuchElementExceptionNonEmpty() {
                boolean success = false;
        try {

        System.out.println("test: testRemoveNoSuchElementExceptionNonEmpty");
        Dictionary dict = new Dictionary();
        dict.put("X", 1);
        dict.put("Y", 2);
        dict.put("Z", 3);
        dict.remove("V");
        } catch(NoSuchElementException e){
            success = true;
        }
        assertTrue(success);
    }
    public static void main(String[] args){
        testGetX();
        testGetY();
        testGetZ();
        testGetXX();
        testGetYY();
        testGetZZ();
        testContainsEmpty();
        testContainsNotFound();
        testContainsX();
        testContainsY();
        testContainsZ();
        testContainsXX();
        testContainsYY();
        testContainsZZ();
        testPutDyncamicArray();
        testReplaceX();
        testReplaceY();
        testReplaceZ();
        testReplaceXX();
        testReplaceYY();
        testReplaceZZ();
        testRemoveX();
        testRemoveY();
        testRemoveZ();
        testRemoveXX();
        testRemoveYY();
        testRemoveZZ();
        testGetStatic();


       testGetNullPointerException();
        testGetNoSuchElementException();
        testGetNoSuchElementExceptionNonEmpty();
        testContainsNullPointerException();
        testPutNullPointerExceptionKey();
        testPutNullPointerExceptionValue();
        testPutNullPointerExceptionKeyValue();
        testReplaceNullPointerExceptionKey();
        testReplaceNullPointerExceptionValue();
        testReplaceNullPointerExceptionKeyValue();
        testReplaceNoSuchElementException();
        testRemoveNullPointerException();
        testRemoveNoSuchElementException();
        testRemoveNoSuchElementExceptionNonEmpty();
    }
}