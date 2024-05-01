package com.codingtest.baekjoon.session4;

import java.io.IOException;
import java.util.Scanner;

public class 동전개수의최솟값구하기_032 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextInt();
        long[] A = new long[N];
        long answer = 0;

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 2. 그리디
        for (int i = N - 1; i >= 0; i--) {
            if (K >= A[i]) {
                answer += K / A[i];
                K = K % A[i];
            }
        }

        // F. 출력
        System.out.println(answer);

    }
}
