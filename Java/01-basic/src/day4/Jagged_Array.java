package day4;

public class Jagged_Array {
	public static void main(String[] args) {
		int[][] data = {
				{1,2,3},
				{1,2,3,4},
				{1,2}
		};
		
		System.out.println("----- For Loop -----");
		for(var r = 0; r < data.length; r++) {
			for(var c = 0; c < data[r].length; c++) {
				System.out.print(data[r][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("----- For Each Loop -----");
		for(var row : data) {
			for(var col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
	}
}
