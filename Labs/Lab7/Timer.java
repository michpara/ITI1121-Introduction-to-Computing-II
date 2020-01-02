public class Timer {

	//instance variables 
	private int hours;
	private int minutes;
	private int seconds;

	//constructors
	public Timer(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	//increments the hours by 1 (between 0 and 23)
	public void incrementHours(){
		if(hours >= 0 && hours < 23){
			hours++;
		}
		else{
			hours = 0;
		}	
	}

	//decrements the hours by 1 (between 0 and 23)
	public void decrementHours(){
		if(hours>0 && hours <= 23){
			hours--;
		}
		else{
			hours=23;
		}
	}

	//returns the hours
	public int getHours(){
		return hours;
	}

	//increments the minutes by 1 (between 0 and 59)
	public void incrementMinutes(){
		if(minutes >= 0 && minutes < 59){
			minutes++;
		}
		else if(minutes == 59 && hours !=23){
			minutes = 0;
			hours++;
		}
		else{
			minutes = 0;
			hours = 0;
		}
	}

	//decrements the minutes by 1 (between 0 and 59)
	public void decrementMinutes(){
		if(minutes >0 && minutes <=59){
			minutes--;
		}
		else if(minutes == 0 && hours !=0){
			minutes = 59;
			hours--;
		}
		else{
			minutes = 59;
			hours = 23;
		}
	}

	//returns the minutes
	public int getMinutes() {
		return minutes;
	}

	//increments the seconds by 1 (0 and 59)
	public void incrementSeconds(){
		if(seconds >=0 && seconds < 59){
			seconds++;
		}
		else if(seconds == 59 && minutes !=59){
			seconds =0;
			minutes++;
		}
		else{
			seconds = 0;
			minutes = 0;
		}
	}

	//decrements the seconds by 1 (0 and 59)
	public void decrementSeconds(){
		if(seconds >0 && seconds <=59){
			seconds--;
		}
		else if(seconds == 0 && minutes !=0){
			seconds = 59;
			minutes--;
		}
		else{
			seconds = 59;
			minutes = 59;
		}
	}
	
	//returns the seconds
	public int getSeconds(){
		return seconds;
	}

	//resets the seconds, minutes and hours
	public void reset(){
		seconds = 0;
		minutes = 0;
		hours = 0;
	}

	//returns the string representation as Timer hours:minutes:seconds
	public String toString () {
		return "Timer "+hours+":"+minutes+":"+seconds;
	}
}