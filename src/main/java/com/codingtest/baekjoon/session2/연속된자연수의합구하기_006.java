package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 연속된자연수의합구하기_006 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int left = 1, right = 2, sum = left+right;

        // 1. N이 1이라면 답은 무조건 1
        if (N == 1) {
            answer++;
        } else {
            // 2. N과 같은 연속된 합 구하기 (투포인터정렬)
            while (right <= N) {
                if (sum == N) {
                    answer++;
                    sum -= left;
                    left++;
                    right++;
                    sum += right;
                } else if (sum < N) {
                    right++;
                    sum += right;
                } else {
                    sum -= left;
                    left++;
                }
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
