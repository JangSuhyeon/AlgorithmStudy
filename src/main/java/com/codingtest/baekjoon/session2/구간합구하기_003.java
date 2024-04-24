package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기_003 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N+1];  // star N이 1보다 크고 100,000보다 작은 수 이기 때문에 long으로 선언하는 것을 추천

        // 1. 구간 합 배열 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {  // N+1 길이의 배열로 선언했으므로 1부터 N까지 반복문 수행
            A[i] = A[i-1] + Integer.parseInt(st.nextToken());
        }

        // F. 출력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(A[end] - A[start-1]);
        }
    }
}
