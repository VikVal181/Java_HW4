package org.example.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        while (!list.isEmpty()) {
            System.out.print(list.pollLast() + " ");
        }
    }
}
