// Day 25 - Running Time and Complexity

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
								Scanner in = new Scanner(System.in);

								int T = in.nextInt();
								for (int i = 0; i < T; i++) {
																int n = in.nextInt();
																System.out.println(isPrime(n) ? "Prime" : "Not prime");
								}

								in.close();
}

static boolean isPrime(int n) {
								if (n < 2) {
																return false;
								}

								for (int i = 2; i * i <= n; i++) {
																if (n % i == 0) {
																								return false;
																}
								}
								return true;
}
}
