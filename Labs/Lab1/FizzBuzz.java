public class FizzBuzz{
	
	public static void main(String[] args){

		for(int i=1;i<31;i++){ //for i in range 1 to 30

			if(i%15==0){ //if i is divisible by 15
				System.out.println("FizzBuzz");
			}

			else if(i%3==0){ //if i is divisible by 3
				System.out.println("Fizz");
			}
			else if(i%5==0){ //if i is divisible by 5
				System.out.println("Buzz");
			}

		}
	}
}
