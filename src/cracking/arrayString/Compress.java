package cracking.arrayString;

public class Compress {

	public static String compress(String str){
		int lenAfter = getLenAfter(str);
		if(lenAfter > str.length()){
			return str;
		}
		
		char[] newStr = new char[lenAfter];
		char last = str.charAt(0);
		int count = 1;
		int newStrIdx = 0;
		for(int i = 1; i < str.length(); i++){
			char c = str.charAt(i);
			if(c == last){
				count++;
			}else{
				newStr[newStrIdx++] = last;
				String countStr = "" + count;
				for(int j = 0; j < countStr.length(); j++){
					newStr[newStrIdx++] = countStr.charAt(j);
				}
				last = c;
				count = 1;
			}
		}
		
		newStr[newStrIdx++] = last;
		String countStr = "" + count;
		for(int j = 0; j < countStr.length(); j++){
			newStr[newStrIdx++] = countStr.charAt(j);
		}
		
		return new String(newStr);
		
	}

	private static int getLenAfter(String str) {
		// TODO Auto-generated method stub
		int len = 0;
		char last = str.charAt(0);
		int count = 1; 
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i); 
			if(c == last){
				count++;
			}else{
				len += 1 + ("" + count).length();
				last = c;
				count = 1;
			}
		}
		len += 1 + ("" + count).length();
		return len;
	}
}
