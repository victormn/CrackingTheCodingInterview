import java.util.*;

public class Test {

	// Funciton
	public static void removeDuplicates (char[] str) {
		if (str == null) return; 
		int checker = 0;
		int length = str.length;
		for (int i = 0; i < length; ++i) {
			int val = str[i] - 'a';
			if ((checker & (1 << val)) > 0) {
				removeChar(str, i--, length--);
			} else {
				checker |= (1 << val);
			}
		}
	}

	public static void removeChar(char[] str, int pos, int length) {
		for (int i = pos; i < length - 1; ++i) {
			str[i] = str[i+1];
		}
		str[length-1] = ' ';
	}

    public static void main(String[] args) {
    	
    	// Inputs
    	char[] test1 = "abcdaefgchi".toCharArray();
    	char[] test2 = "abcdefg".toCharArray();
    	char[] test3 = "".toCharArray();
    	char[] test4 = "000".toCharArray();
    	char[] test5 = "aaa".toCharArray();
    	char[] test6 = "ABCDAE".toCharArray();
    	char[] test7 = null;
    	char[] test8 = "aaaaaabbbbbbbb".toCharArray();

    	// Function call and return
		removeDuplicates(test1);
		removeDuplicates(test2);
		removeDuplicates(test3);
		removeDuplicates(test4);
		removeDuplicates(test5);
		removeDuplicates(test6);
		removeDuplicates(test7);
		removeDuplicates(test8);

    	System.out.println(test1);
    	System.out.println(test2);
    	System.out.println(test3);
    	System.out.println(test4);
    	System.out.println(test5);
    	System.out.println(test6);
    	System.out.println((test7 != null) ? test7 : "null");
    	System.out.println(test8);
    }

}