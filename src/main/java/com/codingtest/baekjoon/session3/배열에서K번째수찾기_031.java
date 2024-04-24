package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 배열에서K번째수찾기_031 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long start = 1, end = K;
        long answer = 0;

        // 1. 이진 탐색
        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            // 중앙값보다 작은 수는 몇개인지 계산하기
            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid/ i, N);
            }

            if (cnt < K) {
                start = mid + 1;
            } else {
                answer = mid;
                end = mid - 1;
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
