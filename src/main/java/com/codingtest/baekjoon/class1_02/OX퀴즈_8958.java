package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class OX퀴즈_8958 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 1. 테스트 케이스 반복
        for (int i = 0; i < T; i++) {
            String[] A = sc.next().split("X");
            int result = 0;

            for (String s : A) {
                for (int j = 1; j <= s.length(); j++) result += j;
            }

            System.out.println(result);
        }
    }
}
