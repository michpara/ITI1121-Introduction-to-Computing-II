// Test.java --- Tests Combination, DoorLock and SecurityAgent
// Author          : Marcel Turcotte
// Created On      : Mon Jan 26 14:24:07 2004
// Last Modified By: turcotte
// Last Modified On: Wed Feb  4 13:52:39 2015

import java.util.Random;

//test method
public class Test {

    public static void main( String[] args ) {

	Random generator = new Random();

        // Creates a new security agent called bob!
        SecurityAgent bob = new SecurityAgent();

        // Ask bob to give us access to the door lock
        DoorLock aLock = bob.getDoorLock();

        // Let's find bob's secret combination
        Combination c = null;
        boolean open = false;
        int iter = 0;

        while ( ! open ) {

            // bob knows the combination and will
            // re-activate the DoorLock

            if ( ! aLock.isActivated() ) {
        	bob.activateDoorLock();
            }

            // let's create a new random combination

            int first = generator.nextInt(5) + 1;
            int second = generator.nextInt(5) + 1;
            int third = generator.nextInt(5) + 1;

            c = new Combination( first, second, third );
            
            // if this combination opens the lock
            // we're done.
            if ( aLock.open( c ) ) {
        	open = true;
            }

            iter++;
        }

        System.out.println( "Success!" );
        System.out.println( "Number of attemtps: " + iter );
        System.out.println( "The combination is: " + c );
    }
}
