import java.util.*;

public class Test {

	// Funciton
	public static String replaceSpaces (String str) {
		char [] inputChars = str.toCharArray();
		String result = "";

		for (int i = 0; i < inputChars.length; ++i) {
			if (inputChars[i] == ' ') {
				result += "%20";
			} else {
				result += inputChars[i];
			}
		}
		return result;

	}

    public static void main(String[] args) {
    	
    	// Inputs
    	String s1 = "a b c d e ";

    	// Function call and return
    	System.out.println(replaceSpaces(s1));
    }

}