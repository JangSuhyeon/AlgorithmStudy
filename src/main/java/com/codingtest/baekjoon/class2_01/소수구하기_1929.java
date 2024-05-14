package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 소수구하기_1929 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        // 2. 소수 찾기
        for (int i = M; i <= N; i++) {
            if (i == 0 || i == 1) continue;
            if (i == 2) {
                System.out.println(i);
            } else {
                boolean flag = false;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }

                // F. 출력
                if (!flag) {
                    System.out.println(i);
                }
            }
        }
    }
}
