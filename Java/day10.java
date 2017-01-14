// Day 10 - Binary Numbers

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);
        int maxConsecutiveOne = 0;
        int consecutiveOne = 0;
        for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '1') {
                        consecutiveOne++;
                        maxConsecutiveOne = Math.max(maxConsecutiveOne, consecutiveOne);
                } else {
                        consecutiveOne = 0;
                }
        }
        System.out.println(maxConsecutiveOne);

        sc.close();
}
}
