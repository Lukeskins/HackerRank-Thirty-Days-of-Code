// Day 11 - 2D Arrays

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        int minSum = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length - 2; row++) {
            for (int column = 0; column<arr[0].length - 2; column++) {
                sum = arr[row][column] +
                      arr[row][column+1] +
                      arr[row][column+2] +
                      arr[row+1][column+1] +
                      arr[row+2][column] +
                      arr[row+2][column+1] +
                      arr[row+2][column+2];

                if (sum > minSum) {
                    minSum = sum;
                }
            }
        }

        System.out.println(minSum);
    }
}
