import java.util.*;

public class Test {

	// Funciton
	public static boolean isRotation(String s1, String s2) {
		return (isSubstring(s2, (s1+s1)));
	}

	public static boolean isSubstring (String s1, String s2) {
		return s2.contains(s1);
	}

    public static void main(String[] args) {
    	
    	// Inputs
    	String s1 = "water";
    	String s2 = "terwa";
    	String s3 = "teraw";

    	// Function call and return
    	System.out.println(isRotation(s1, s2));
    	System.out.println(isRotation(s1, s3));
    }

}