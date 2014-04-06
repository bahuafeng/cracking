package cracking.util;

public class Matrix {
	public static boolean isEquals(int[][] m1, int[][] m2){
		if(m1.length != m2.length){
			return false;
		}
		if(m1[0].length != m2[0].length){
			return false;
		}
		for(int i = 0; i < m1.length; i++){
			for (int j = 0; j < m1[i].length; j++) {
				if(m1[i][j] != m2[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}
