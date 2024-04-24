package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 동전개수의최솟값구하기_032 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int answer = 0;

        // 1. 데이터 배열 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        // 2. 그리디 탐색
        for (int i = N - 1; i >= 0; i--) { // 큰 금액부터 탐색
            if (A[i] <= K) { // 선택한 동전의 값이 목표금액보다 작거나 같으면
                answer += K / A[i];
                K = K % A[i];
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
