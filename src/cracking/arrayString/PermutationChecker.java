/**
 * 
 */
package cracking.arrayString;

import java.util.Arrays;

/**
 * @author mrlaoba
 *
 */
public class PermutationChecker {
	public static boolean isPermutation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		s1 = sort(s1);
		s2 = sort(s2);
		return s1.equals(s2);
	}

	private static String sort(String s1) {
		// TODO Auto-generated method stub
		char[] arr = s1.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	
}
