package com.codingtest.baekjoon.session3;

import java.io.IOException;
import java.util.Scanner;

public class 소수구하기_037 {

    static int answer = 0;

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N + 1];

        // 1. 배열 초기화
        for (int i = 2; i <= N; i++) {
            A[i] = i;
        }

        // 2. 소수 찾기
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= N; j = j + i) {
                A[j] = 0;
            }
        }

        // F. 출력
        for (int i = M; i < N; i++) {
            if (A[i] != 0) {
                System.out.println(A[i]);
            }
        }
    }
}
