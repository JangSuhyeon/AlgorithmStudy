package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.Scanner;

public class 팰린드롬수_1259 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // 1. 0이 나올 때까지 팰린드롬 수 찾기
        while (!word.equals("0")) {
            boolean flag = false;

            // 2. 1은 무조건 팰린드롬수
            if (word.length() == 1) {
                System.out.println("yes");
            } else {
                int mid = word.length() / 2;

                for (int i = 0; i < mid; i++) {
                    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                        flag = true;
                    }
                }

                if (flag) {
                    System.out.println("no");
                } else {
                    System.out.println("yes");
                }
            }

            word = sc.next();
        }
    }
}
