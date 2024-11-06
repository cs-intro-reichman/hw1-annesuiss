// Splits a restaurant bill evenly among three diners.

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		String sumUser = args[3];
		int sum = Integer.parseInt(sumUser);

		// calc the bill between the three people equally
		double sumCalc = sum;
		//System.out.println(Math.ceil(sumCalc/3));
		double finalPayment = Math.ceil(sumCalc/3);
		
		// print (1+2)
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " + finalPayment + " Shekels each." );
		System.out.println("Pay " + finalPayment + " Shekels each.");
  
	}
}
