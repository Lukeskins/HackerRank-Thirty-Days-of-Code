// Day 9 - Recursion

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int integerInput = scan.nextInt();
        scan.close();

        int factorial = integerInput;
        for (int i = integerInput - 1; i > 0; i--) {
                factorial*=i;
        }

        System.out.println(factorial);
}
}
