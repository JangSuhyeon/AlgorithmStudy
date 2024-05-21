package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 팰린드롬수_1259 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);

        // 1. 0이 나올때까지 반복문 실행
        while (true) {
            String now = sc.next();
            if (now.equals("0")) break;

            boolean flag = false;

            for (int i = 0; i < now.length() / 2; i++) {
                if (now.charAt(i) != now.charAt(now.length() - 1 - i)) {
                    System.out.println("no");
                    flag = true;
                    break;
                }
            }

            if (!flag) System.out.println("yes");
        }

        sc.close();
    }
}
