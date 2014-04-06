package cracking.arrayString;

public class IsRotation {
//	public static boolean isSubString(String s1, String s2){
//		
//	}
	public static boolean isRotation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		String s1s1 = s1+s1;
		return s1s1.contains(s2);
	}
	
}
