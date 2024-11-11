// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    String inputString = args[0];
		int sum = Integer.parseInt(inputString);
        int hundreds = (sum/100)%10;
        int tens = (sum/10) %10;
        int ones = sum%10;
		// print "5 hundreds, 1 tens, and 7 ones."
        System.out.println(hundreds + " hundreds, " + tens + " tens, "
		                    +" and " + ones + " ones.");


	}
}
