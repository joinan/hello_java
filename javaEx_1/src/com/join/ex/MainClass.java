package com.join.ex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][][] a = new int [2][][][];
		a[0] = new int[2][][];
		a[1] = new int[2][][];
		a[0][0] = new int[2][];
		a[0][1] = new int[2][];
		a[1][0] = new int[2][];
		a[1][1] = new int[2][];
		a[0][0][0] = new int[2];
		a[0][0][1] = new int[2];
		a[0][1][0] = new int[2];
		a[0][1][1] = new int[2];
		a[1][0][0] = new int[2];
		a[1][0][1] = new int[2];
		a[1][1][0] = new int[2];
		a[1][1][1] = new int[2];
		a[0][0][0][0] = 1;
		a[0][0][0][1] = 2;
		a[0][0][1][0] = 3;
		a[0][0][1][1] = 4;
		a[0][1][0][0] = 5;
		a[0][1][0][1] = 6;
		a[0][1][1][0] = 7;
		a[0][1][1][1] = 8;
		a[1][0][0][0] = 9;
		a[1][0][0][1] = 10;
		a[1][0][1][0] = 11;
		a[1][0][1][1] = 12;
		a[1][1][0][0] = 13;
		a[1][1][0][1] = 14;
		a[1][1][1][0] = 15;
		a[1][1][1][1] = 16;
		
		
		for(int i =0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for(int m=0; m<2; m++) {
					for(int n=0;n<2;n++)
						System.out.println(a[i][j][m][n]);
				}
					
			}
		}
	}

}
