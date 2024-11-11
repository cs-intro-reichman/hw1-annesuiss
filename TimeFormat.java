// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String timeInputString =  args[0];
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String minuteString = ("" + args[0].charAt(3) + args[0].charAt(4));
if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
	System.out.println(" enter hours value: 0=> hours < 24." +
	                  " enter minutes value: 0 < minutes < 60 ");}
	
else {
	if (hours == 12) {
		System.out.println(hours + ":" + minuteString + " AM");
	}
	else if (hours < 12) {
		System.out.println(hours + ":" + minuteString + " AM");
	}
	else {
		System.out.println((hours-12) + ":" + minuteString + " PM");
	}

	}
	}
}
