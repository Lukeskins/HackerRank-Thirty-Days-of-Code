// Day 28 - RegEx, Patterns, and Intro to Databases

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String str = ".+@gmail\\.com$";

        Pattern ptrn = Pattern.compile(str);

        List<String> list = new ArrayList();

        for (int i = 0; i < N; i++) {
                String firstName = in.next();

                String emailID = in.next();
                Matcher matcher = ptrn.matcher(emailID);

                if (matcher.find()) {
                        list.add(firstName);
                }
        }

        Collections.sort(list);
        for (String name : list) {
                System.out.println(name);
        }


        in.close();
}
}
