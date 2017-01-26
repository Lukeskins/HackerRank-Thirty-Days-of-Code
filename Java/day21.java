// Day 21 - Generics

public class Solution {
public <T> void printArray(T[] array) {
								for (T selection : array) {
																System.out.println(selection);
								}
}
}
