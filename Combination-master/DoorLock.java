public class DoorLock {

    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;
    
    //Instance variables
    private Combination combination; //initializes combination
    private boolean open; //intializes open
    private boolean activated; //initializes activated
    private int numberOfAttempts; //initializes numberOfAttemps

    //constructor
    public DoorLock( Combination combination ) {
        this.combination = combination; 
        //when DoorLock is called
        open = false; 
        activated = true; 
        numberOfAttempts = 0; 
    }

    //checks if the DoorLock is open
    public boolean isOpen() {
        return open; 
    }
    
    //checks if the DoorLock is activated
    public boolean isActivated() {
        return activated; 
    }
    //checks if this Combination is activate and is equal to combination, then restarts the numberOfAttemps and opens the DoorLock 
    public boolean open( Combination combination ) {
        if(activated){ //if DoorLock is activated
            if(this.combination.equals(combination)){ 
                open = true; 
                numberOfAttempts = 0; 
            } else{ //else
                numberOfAttempts++; 
                if(numberOfAttempts >= MAX_NUMBER_OF_ATTEMPTS){ //if numberOfAttemps reaches the max number of attemps
                    activated = false; 
                    numberOfAttempts = 0; 
                }
            }
        }

        return activated && open; 
        
    }
    //activates this DoorLock if c is equal to this Combination
    public void activate( Combination c ) {
        if (combination.equals(c)){ 
            activated = true; 
        }

    }

}
