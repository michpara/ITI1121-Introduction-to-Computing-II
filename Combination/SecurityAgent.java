public class SecurityAgent{

    //instance variables
    public Combination combination; //initializes combination
    public DoorLock lock; //initializes lock
   
    //constructor
    public SecurityAgent(){

        int first, second, third; //initializes first, second and third

        //finds random integers between 1 and 5 for first, second and tird
        first = (int)(Math.random()*5)+1; 
        second = (int)(Math.random()*5)+1;
        third = (int)(Math.random()*5)+1;

        combination = new Combination(first, second, third); //creates a new combination with these random integers

        lock = new DoorLock(combination); 

    }
    
    //gets the DoorLock
    public DoorLock getDoorLock(){

        return lock; //returns the lock
    }
    
    //activates the DoorLock  
    public void activateDoorLock(){

        lock.activate(combination);
    }
}
