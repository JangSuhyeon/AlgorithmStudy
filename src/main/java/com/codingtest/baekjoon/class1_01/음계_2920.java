package com.codingtest.baekjoon.class1_01;

import java.io.IOException;
import java.util.Scanner;

public class 음계_2920 {
    public void solution() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int prev = sc.nextInt();
        int now = sc.nextInt();
        int gap = now - prev;
        String result = gap < 0 ? "descending" : "ascending";

        for (int i = 0; i < 6; i++) {
            prev = now;
            now = sc.nextInt();
            if (now - prev != gap) {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}
