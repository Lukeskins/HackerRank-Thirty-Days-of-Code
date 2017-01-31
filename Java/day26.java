// Day 26 - Nested Logic

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Actual date
        int aD = in.nextInt();
        int aM = in.nextInt();
        int aY = in.nextInt();

        // Due date
        int dD = in.nextInt();
        int dM = in.nextInt();
        int dY = in.nextInt();

        int fine;

        if (aY > dY) {
                fine = 10000;
        } else if (aM > dM && aY == dY) {
                fine = 500 * (aM - dM);
        } else if (aD > dD && aM == dM && aY == dY) {
                fine = 15 * (aD - dD);
        } else {
                fine = 0;
        }

        System.out.println(fine);

        in.close();
}
}
