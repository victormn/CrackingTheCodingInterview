import java.util.*;

public class Test {

	// Funciton
	public static boolean isAnagram (String str1, String str2) {
		return (sortString(str1).equals(sortString(str2)));
	}

	public static String sortString (String str) {
		char [] aux = str.toCharArray();
		Arrays.sort(aux);
		return new String(aux);
	}

    public static void main(String[] args) {
    	
    	// Inputs
    	String in1 = "roma";
    	String in2 = "amor";

    	// Function call and return
    	System.out.println(isAnagram(in1, in2));
    }

}