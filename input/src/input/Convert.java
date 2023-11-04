package input;

public class Convert {

//	public static int convert (int minutes) {
	//	return (minutes*60);
	public static int convert (int hours) {
			return (hours*3600);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	int minute=5;
	//	int seconds= convert(minute);
	
				//System.out.println (minute +" minutes in seconds is: "+ seconds);
		int hours=3;
		int seconds=convert(hours);
			System.out.println (hours+" hours in seconds is: "+ seconds);
	}

}
