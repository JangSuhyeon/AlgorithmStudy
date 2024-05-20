package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 요세푸스문제0_11866 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int k_cnt = 0; // K번째 수 확인용
        int n_cnt = 0; // N개의 수가 모두 출력되었는지 확인 용
        int idx = 0;   // 현재 커서
        int[] A = new int[N];

        // 1. 모든 수가 출력될 때까지 반복
        sb.append("<");
        while (N > n_cnt) {
            if (A[idx] == 0) {
                if(k_cnt == K - 1) {
                    A[idx] = 1;
                    sb.append(idx + 1);
                    if (n_cnt == N - 1)sb.append("");
                    else sb.append(", ");
                    n_cnt++;
                    k_cnt = 0;
                } else {
                    k_cnt++;
                }
            }
            idx++;
            if (idx >= N) idx = N - idx;
        }

        // F. 출력
        sb.append(">");
        System.out.println(sb);
    }
}
