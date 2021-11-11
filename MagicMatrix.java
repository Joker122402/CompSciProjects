/* 
 * This program accepts a two-dimensional array of integers and returns true if it is a magic square.
 * A matrix is a magic square if the following conditions are met:
 * 1. The matrix is square (same number of columns and rows)
 * 2. Every row is the same length
 * 3. The sums of all rows, columns and diagnals are the same.
 */


public class Magic_Matrix {
	public static void main(String[]args) {
		int[][] testOne = {{1,1},{1,1}};
		int[][] testTwo = {{5,3,1},{1,2,3},{2,4,6}};
		int[][] testThree = {{2,7,6},{9,5,1},{4,3,8}};
		
		System.out.println(isMagicSquare(testOne));
		System.out.println(isMagicSquare(testTwo));
		System.out.println(isMagicSquare(testThree));
	}
	
	public static boolean isMagicSquare(int[][] matrix) {
		boolean magicSquare = true;
		
		for(int i = 0; i < matrix.length; i++) { //i represents row number
			if (matrix[i].length != matrix.length) {
				magicSquare = false; //return false if length of all rows (columns number) is not equal to row number
			}
		}
		
		if(magicSquare) { //if rows == columns
			int sum = 0;
			
			int newSum = 0;
			
			
			for (int i = 0; i < matrix.length; i++) { 
				sum += matrix[0][i]; 
			}
			
			// checking rows
			for (int i = 1; i < matrix.length; i++) {  
				for (int j = 0; j < matrix.length; j++) { 
					newSum += matrix[i][j]; 
				}
				
				if (sum != newSum) {
					magicSquare = false;
				}
				newSum = 0;
			}
			
			//checking columns
			for(int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					newSum += matrix[j][i];
				}
				
				if (sum != newSum) {
					magicSquare = false;
				}
				newSum = 0;
			}
			
			//checking diagonal tl -br
			for (int i = 0; i < matrix.length; i++) {
				newSum += matrix[i][i];
			}
			if(sum != newSum) {
				magicSquare = false;
			}
			newSum = 0;
			
			//checking diagonal bl - tr
			for (int i = 0; i < matrix.length; i++) {
				newSum += matrix[(matrix.length -1) - i][i];
			}
			if (sum != newSum) {
				magicSquare = false;
			}
		}
		return magicSquare;
	}
}

