package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ATM인출시간계산하기_018 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int[] P = new int[N];

        // 1. 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 삽입정렬
        for (int i = 1; i < N; i++) {
            boolean flag = false;
            int idx = 0;
            for (int j = i-1; j >=0 ; j--) {
                if (A[i] < A[j]) {
                    idx = j;
                    flag = true;
                }
            }

            if (flag) {
                int temp = A[i];
                for (int j = i; j > idx; j--) {
                    A[j] = A[j-1];
                }
                A[idx] = temp;
            }
        }

        // 3. 합 구하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                P[i] += A[j];
            }
        }
        for (int i : P) {
            answer += i;
        }

        // F. 출력
        System.out.println(answer);
    }
}
