/**
 * 
 */
package cracking.arrayString;

/**
 * @author ba
 *
 */
public class SetZeros {
	public static void setZeros(int[][] matrix){
		boolean[] zeroRows = new boolean[matrix.length];
		boolean[] zeroCols = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(0 == matrix[i][j]){
					zeroRows[i] = true;
					zeroCols[j] = true;
				}
			}
		}
		
		for (int i = 0; i < zeroCols.length; i++) {
			if(zeroCols[i]){
				setColsZero(matrix,i);
			}
		}
		
		for (int i = 0; i < zeroRows.length; i++) {
			if(zeroRows[i]){
				setRowsZero(matrix,i);
			}
		}
		
	}

	private static void setRowsZero(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {//XXX 边界条件弄错
			if (0 != matrix[row][j]) {
				matrix[row][j] = 0;
			}
		}
		
	}

	private static void setColsZero(int[][] matrix, int col) {
		for (int j = 0; j < matrix.length; j++) {//XXX 边界条件弄错. 做之前在纸上画一画
			if(0 != matrix[j][col]){
				matrix[j][col] = 0;
			}
		}
	}
}
