package cracking.arrayString;

/**
 * @author ba
 * matrix must be N*N.
 */
public class Rotate {
	/**
	 * @param matrix
	 */
	public static void rotate(int[][] matrix){
		int n = matrix.length;

		int top = 0;
		int left = 0;
		for(int len = n - 1; len > 0; len = len - 2){
			int right = left + len;
			int botom = top + len;
			for(int i = 0; i < len; i++){
				int temp = matrix[top][left + i];
				matrix[top][left+i] = matrix[botom - i][left];//XXX 列与行写颠倒了。[botom - i][left]写成了[left][botom - i]
				matrix[botom - i][left] = matrix[botom][right - i];
				matrix[botom][right - i] = matrix[top + i][right];
				matrix[top + i][right] = temp;
			}
			
			top++;
			left++;
		}
	}
	
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
