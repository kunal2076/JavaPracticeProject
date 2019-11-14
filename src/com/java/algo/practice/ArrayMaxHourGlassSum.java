package com.java.algo.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayMaxHourGlassSum {

	public static void main(String[] args) throws IOException {

		int[][] arr = {
						{1, 1, 1, 0, 0, 0},
						{0, 1, 0, 0, 0, 0},
						{1, 1, 1, 0, 0, 0},
						{0, 0, 2, 4, 4, 0},
						{0, 0, 0, 2, 0, 0},
						{0, 0, 1, 2, 4, 0},
						};
		
		int result = hourglassSum(arr);
		System.out.println(result);
	}
	
	public static int hourglassSum(int[][] arr) {
		//int[][] array = new int[6][6];
		int maxHourglass = -999;
		
        maxHourglass = getHourglass(arr, 1,1);
        for (int y=1; y<5; y++){
            for (int x=1; x<5; x++){
                int hourres = getHourglass(arr, x, y);
                if (hourres > maxHourglass){
                    maxHourglass = hourres;
                }
            }
        }
        return maxHourglass;
	}
	
	public static int getHourglass(int[][] array, int x, int y) {
	        return array[x][y] + array[x-1][y-1] + array[x][y-1] + array[x+1][y-1] 
	        + array[x-1][y+1] + array[x][y+1] + array[x+1][y+1];
	    }

}
