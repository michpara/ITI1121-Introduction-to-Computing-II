public class SecurityAgent{

    //instance variables
    private Combination myCombination; //initializes combination
    private DoorLock myLock; //initializes lock
   
    //constructor
    public SecurityAgent(){

        int first, second, third; //initializes first, second and third

        //finds random integers between 1 and 5 for first, second and tird
        first = (int)(Math.random()*5)+1; 
        second = (int)(Math.random()*5)+1;
        third = (int)(Math.random()*5)+1;

        myCombination = new Combination(first, second, third); //creates a new combination with these random integers

        myLock = new DoorLock(myCombination); 

    }
    
    //gets the DoorLock
    public DoorLock getDoorLock(){

        return myLock; //returns the lock
    }
    
    //activates the DoorLock  
    public void activateDoorLock(){

        myLock.activate(myCombination);
    }
}
