package ch1.pertemuan5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashSet {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] leftPair = new String[t];
        String [] rightPair = new String[t];

        for (int i = 0; i < t; i++) {
            leftPair[i] = s.next();
            rightPair[i] = s.next();
        }
        HashSet<String> set = new HashSet(t);
        for (int i = 0; i < t; i++) {
            set.add(leftPair[i] + " " + rightPair[i]);
            System.out.println(set.size());
        }
    }
}