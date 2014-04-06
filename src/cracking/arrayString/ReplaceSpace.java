package cracking.arrayString;

public class ReplaceSpace {
	public static String replace(String str){ 
		char[] arr = str.toCharArray();
		int numOfSpace = countSpace(arr);
		if(0 == numOfSpace){
			return str;
		}else{
			char[] nArr = new char[arr.length + numOfSpace * 2];
			for(int i = arr.length - 1,j=nArr.length - 1; i >=0; i--){//XXX 边界条件判断错误，数组初始位应为length-1
				if(arr[i] == ' '){
					nArr[j--] = '0';
					nArr[j--] = '2';
					nArr[j--] = '%';
				}else{
					nArr[j--] = arr[i];
				}
			}
			return new String(nArr);
		}
	}

	private static int countSpace(char[] arr) {
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			if(' ' == arr[i]){
				num++;
			}
		}
		return num;
	}
}
