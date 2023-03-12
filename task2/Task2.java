package org.example.task2;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        String inStr = "[(]{{})(})";
        System.out.println(isValid(inStr));
    }

    public static boolean isValid(String s) {
        Deque<Character> openBrackets = new LinkedList<>();
//        char[] chars = s.toCharArray();
        if (s.length() % 2 != 0) return false;
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                openBrackets.add(i);
            }
            else {
                if (
                        openBrackets.isEmpty()) {
                    return false;
                }
                else if (openBrackets.peekLast() == '(' && i == ')') {
                    openBrackets.removeLast();
                } else if (openBrackets.peekLast() == '[' && i == ']') {
                    openBrackets.removeLast();
                } else if (openBrackets.peekLast() == '{' && i == '}') {
                    openBrackets.removeLast();
                } else {
                    return false;
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
