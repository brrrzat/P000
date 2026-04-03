package org.example;

import java.util.HashMap;

public class P000_E23 {
    static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    static void printLetterFrequency(String a) {

        for (int i = 0; i < a.length(); i++) {
            String temp = a.toLowerCase();
            char ch = temp.charAt(i);
            if (ch >= 'a' && ch <= 'z' ){
            if (map.containsKey(ch)) {
                int n = map.get(ch) + 1;
                map.put(ch, n);
            } else {
                map.put(ch, 1);
            }
        }}
    }
    public static void main(String[] args) {
        String[] tests = {
                "Hello World",
                "aAaA BBB c!",
                "123",
                "Jetihub",
                "Algorithmization"
        };
        for (String a : tests){

            printLetterFrequency(a);
        }
        System.out.println(map);
    }}


