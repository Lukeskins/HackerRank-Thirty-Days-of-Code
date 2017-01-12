// Day 6 - Let's Review

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void printEvenSpaceOdd(char [] myCharArray) {
        int len = myCharArray.length;
        for (int i = 0; i < len; i += 2) {
                System.out.print(myCharArray[i]);
        }
        System.out.print(" ");
        for (int i = 1; i < len; i += 2) {
                System.out.print(myCharArray[i]);
        }
        System.out.println();
}

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i=1; i<= T; i++) {
                String str = scan.nextLine();
                printEvenSpaceOdd(str.toCharArray());
        }
}
}
