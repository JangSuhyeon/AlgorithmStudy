package com.codingtest.baekjoon.session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 배열에서K번째수찾기_031 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int start = 1;
        int end = k; // start <= k <= end
        int answer = 0;

        // 1. 이진 탐색
        while (start <= end) { // lower-bound
            int mid = (start + end) / 2; // k가 mid라면
            int count = 0;

            for (int i = 1; i <= N; i++) {
                count += Math.min(mid / i, N); // mid로 나눈 모든 단의 몫이 k이어야 한다.
            }

            if (k > count) {
                start = mid + 1;
            } else {
                end = mid - 1;
                answer = mid;
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
