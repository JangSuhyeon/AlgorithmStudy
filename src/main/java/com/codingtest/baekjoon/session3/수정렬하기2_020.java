package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수정렬하기2_020 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] P = new int[N + 1];
        int[] R = new int[M];

        // 1. 부분합 구하기
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            P[i] = P[i - 1] + Integer.parseInt(st.nextToken());

            if (P[i] % M == 0) { // 인덱스 0부터 특정 인덱스까지 더한 값의 나머지로 확인
                answer++;
            }
        }

        // 2. M으로 나눈 나머지 저장
        for (int i = 1; i <= N; i++) {
            R[P[i] % M]++;
        }

        // 3. 같은 나머지를 같는 쌍 찾기
        for (int i : R) {
            if (i > 1) {
                answer += i * (i - 1) / 2;
            }
        }

         // F. 출력
        System.out.println(answer);
    }
}
