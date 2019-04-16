public class TextPost extends Post {
	
    //instance variables
    private String message;

    //constructor
    public TextPost(String userName, String message) {
      super(userName); //overides userName
      this.message = message;
    }
	
    //gets the message
    public String getMessage() {
        return message;
    }
	
    //returns a string representation of the textpost
    public String toString() {
    	String str = new String();
    	str = super.toString() + ", " + message;
    	return  str;
    }
	
	//returns if the post is popular
    public boolean isPopular() {
      if(super.likes > 50){ //overides likes
          return true;
      }
	    
      return false;
      }

}
