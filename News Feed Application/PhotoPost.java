public class PhotoPost extends Post {

    //instance variables
    private String fileName;
    private String caption;
	
    //constructor
    public PhotoPost(String userName, String fileName, String caption) {
        super(userName); //overides userName
        this.fileName = fileName;
        this.caption = caption;
    }
	
    //gets the caption
    public String getCaption() {
	     return caption;
    }
	
    //gets the FileName
    public String getFileName() {
	     return fileName;
    }

    //returns a string representation of the photopost
    public String toString() {
    	String str = new String();
    	str = super.toString() + ", " + fileName + ", " + caption;
    	return str;
    }

}
