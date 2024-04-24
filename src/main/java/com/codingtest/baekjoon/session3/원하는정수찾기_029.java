package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 원하는정수찾기_029 {
    int[] A;
    boolean flag;
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[N];
        int K;
        int[] F;

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i]  = Integer.parseInt(st.nextToken());
        }

        // 2. 찾아야 할 수 배열 데이터 저장
        K = Integer.parseInt(br.readLine());
        F = new int[K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            F[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 오름차순 정렬
        Arrays.sort(A);

        // 4. 이진 탐색
        for (int i = 0; i < K; i++) {
            flag = false;
            int S = 0, E = N - 1;
            while (S <= E) {
                int M = (S + E) / 2;
                if (F[i] == A[M]) {
                    flag = true;
                    break;
                } else if (F[i] > A[M]) {
                    S = M + 1;
                } else {
                    E = M - 1;
                }
            }
            if (!flag) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}
