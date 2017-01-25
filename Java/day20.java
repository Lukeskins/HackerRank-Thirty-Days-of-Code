// Day 20 - Sorting

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
        }

        int numSwaps = 0;
        for (int i = 0; i < n; i++) {


                for (int j = 0; j < n - 1; j++) {
                        int tmp = a[j];

                        if (a[j] > a[j + 1]) {
                                a[j] = a[j+1];
                                a[j+1] = tmp;
                                numSwaps++;
                        }
                }


                if (numSwaps == 0) {
                        break;
                }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.\nFirst Element: " + a[0] + "\nLast Element: " + a[a.length-1]);
}

}
