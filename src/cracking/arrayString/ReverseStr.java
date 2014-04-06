/**
 * 
 */
package cracking.arrayString;

/**
 * @author mrlaoba
 *
 */
public class ReverseStr {
	public static String reverse(String str){
		StringBuffer sb = new StringBuffer(str);
		for(int i=0,j=str.length()-1; i < j; i++,j--){
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, temp);
		}
		return sb.toString();
	}
	
	
}
