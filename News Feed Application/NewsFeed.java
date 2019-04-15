public class NewsFeed {

    //instance variables
    private Post[] messages; 
    private int size; //
    public static final int MAX_SIZE = 25;

    //constructor
    public NewsFeed() {
      messages = new Post[25]; 
      size = 0; 
    }

    //adds a Post to the NewsFeed
    public void add(Post message) {
      if(size==MAX_SIZE){ 
        System.out.println("Max size reached");
        return;
      }

      messages[size++] = message; 
    
    }

    //gets the Post at a given index
    public Post get(int index) {
	     return messages[index];
    }

    //returns the size of the NewsFeed
    public int size() {
	     return size;
    }
	  //sorts the NewsFeed
	  public void sort(){
			int i, j, argMin;
			Post temp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			temp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = temp;
		  }

	  }

    //gets all the PhotoPosts on the NewsFeed
    public NewsFeed getPhotoPost(){
      NewsFeed photoFeed = new NewsFeed();

        for(int i=0; i < size; i++){
            if (messages[i].getClass().getName().equals("PhotoPost")){ 
                photoFeed.add(messages[i]); 
            }
        }
        return photoFeed;
    }

      //adds this NewsFeed with other
      public NewsFeed plus(NewsFeed other){

	      NewsFeed newFeed = new NewsFeed();

	      for(int i =0;i<size();i++){
		newFeed.add(messages[i]); 
	      }

	      for(int j =0;j<size();j++){
		newFeed.add(other.messages[j]); 
	      }


	      newFeed.sort(); 
	      return newFeed;


      }

}
