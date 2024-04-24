package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K번째수구하기_019 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int pivot = 0;
        int start = 1, end = N-1;

        // 1. 수열 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 피벗 인덱스 정하기
        pivot = (N % 2 > 0 ? N / 2 + 1 : N / 2) - 1;

        // 3. 피벗과 A[0] 위치 swap
        int temp = A[pivot];
        A[pivot] = A[0];
        A[0] = temp;

        // 4. 퀵 정렬
        while (start < end) {
            if (A[end] > A[pivot]) {
                end--;
            }
        }

        // T. 테스트 출력
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
