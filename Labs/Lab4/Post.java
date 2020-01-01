import java.util.Date;
import java.util.Calendar;


public class Post implements Likeable, Comparable<Post>{
	
	//instance variables
	private String userName;
	private Date timeStamp;
	protected int likes;

	//constructor
	public Post(String userName){

	    this.userName = userName;
	    timeStamp = Calendar.getInstance().getTime(); //gets the time
	    likes = 0; 
	}
	
	//gets the username
	public String getUserName() {
		
	    return userName;
        }
	
    //gets the date and time it was added 
        public Date getTimeStamp() {
	    
	    return timeStamp;
        }

	//adds likes to the post
	public void like(){

	    likes++; //likes increments by 1
	}
	
	//returns the number of likes a post has
	public int getLikes(){
		
	    return likes;
	}
	
	//returns if a post is popular
	public boolean isPopular(){

	    if(likes>100){ 
			return true;
	    }
		
	    else{
			return false;
	    }
	}
	
	//compares this Post with other
	public int compareTo(Post other){
  	    return timeStamp.compareTo(other.timeStamp); //compares the timeStamp to the other.timeStamp
  	
  	}
	
	//returns a string representation of the Post
	public String toString() {
		
    	String str = new String();
    	str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
    	return  str;
    }




}
