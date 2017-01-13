// Day 8 - Dictionaries and Maps

import java.util.*;
import java.io.*;

class Solution {
public static void main(String [] argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n=in.nextInt();
        in.nextLine();

        for(int i=0; i<n; i++) {
                String name=in.next();
                int phone=in.nextInt();
                phoneBook.put(name, phone);
                in.nextLine();
        }
        while(in.hasNext()) {
                String s = in.next();

                if (phoneBook.containsKey(s)) {
                        System.out.println(s+"="+phoneBook.get(s));
                } else {
                        System.out.println("Not found");
                }
        }
        in.close();
}
}
