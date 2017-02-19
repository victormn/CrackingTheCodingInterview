import java.util.*;

public class Test {

	// Funciton
	public static boolean hasAllUniqueCharacters(String str) {
		char [] inputChars = str.toCharArray();
		Arrays.sort(inputChars);
		for (int i = 0; i < inputChars.length-1; i++) {
			if (inputChars[i] == inputChars[i+1]) {
				return false;
			}
		}
		return true;
	}

    public static void main(String[] args) {
    	
    	// Inputs
    	String input1 = "teste1";
    	String input2 = "asdfpoiu"; 
    	String input3 = "91283091"; 
    	String input4 = ""; 

    	// Function call and return
    	System.out.println(hasAllUniqueCharacters(input1));
    	System.out.println(hasAllUniqueCharacters(input2));
    	System.out.println(hasAllUniqueCharacters(input3));
    	System.out.println(hasAllUniqueCharacters(input4));
    }

}