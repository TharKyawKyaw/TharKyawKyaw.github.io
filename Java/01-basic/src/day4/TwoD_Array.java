package day4;

public class TwoD_Array {
	public static void main(String[] args) {
		int [][] marks = {
				{65,74,28,90,100},
				{100,99,80,79,95},
				{56,89,59,88,67}
		};
		
		System.out.println("----- For Loop with 2D array -----");
		for(var r=0;r<3;r++) {
			for(var c=0;c<5;c++) {
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		System.out.println("----- For Each Loop with 2D array -----");
		for(int[] rows:marks) {
			for(int col: rows) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		System.out.println("----------");
	}
}
