import java.util.Scanner;

public class VotingRight{

	public static void main(String[] args){

		Scanner myScan = new Scanner(System.in); //initializes myScan
		System.out.print("How old are you? ");

		int usersAge = myScan.nextInt(); 
		int yearsLeft = 18-usersAge;
		String years;

		if(usersAge < 18){
			
		  if(yearsLeft == 1){

			years = "year";
		  }
			
		  else{
			years = "years";
		  }
			
			System.out.println("You will be allowed to in " + yearsLeft + " " + years + ".");
		} 
		else{ //if the user is older than or is 18 years old
			System.out.println("You have the right to vote!");
		}
	}
	

}
