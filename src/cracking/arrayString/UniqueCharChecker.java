package cracking.arrayString;

public class UniqueCharChecker {
	
	final int ASCII = 256;
	
	private Boolean isUniqueChar;
	
	private String str;
	
	
	
	public UniqueCharChecker(String str) {
		super();
		this.str = str;
	}

	private void check(){
		boolean[] checker = new boolean[ASCII];
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			if(checker[c] == false){
				checker[c] = true;
			}else{
				isUniqueChar = false;
				return;			//XXX 在这出错了，因为用了break。
			}
		}
		isUniqueChar = true;
	}
	
	public boolean isUniqueChar(){
		if(null == isUniqueChar){
			check();
			return isUniqueChar;
		}
		return isUniqueChar;
	}
	
	
	public static void main(String[] args) {
		String testCase1 = "abcdefg";
		
	}
	
}
