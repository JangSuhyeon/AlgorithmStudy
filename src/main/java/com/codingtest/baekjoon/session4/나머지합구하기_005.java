package com.codingtest.baekjoon.session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 나머지합구하기_005 {
    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] A = new long[N];
        long[] R = new long[M];
        long answer = 0;

        // 1. 부분합 배열 데이터 저장 및 1~N 카운트
        st = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            A[i] = A[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 2. 0부터 검토해야하기 때문에 다시 for문
        for (int i = 0; i < N; i++) {
            if (A[i] % M == 0) answer++;
            R[(int) (A[i] % M)]++;
        }

        // 3. 같은 나머지 짝 찾기
        for (int i = 0; i < M; i++) {
            if (R[i] > 1) answer += (int) ((R[i] * (R[i] - 1)) / 2);
        }

        // F. 출력
        System.out.println(answer);
    }
}
