package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class AplusB5_10952 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스 반복
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) break;

            System.out.println(A + B);
        }

        // 2. 출력 완료
        sc.close();
    }
}
