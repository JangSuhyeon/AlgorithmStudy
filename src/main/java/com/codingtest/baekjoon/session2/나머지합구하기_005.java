package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지합구하기_005 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        long answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] A = new long[N+1]; // star N이 10의 6승까지 될 수 있기 때문에 부분합 배열은 long[] 타입이 되어야 한다.
        long[] R = new long[M];

        // 1. 0부터 시작하는 부분합 구간 개수 구하기 및 부분합 배열 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = A[i-1] + Integer.parseInt(st.nextToken());

            if (A[i] % M == 0) {
                answer++;
            }
        }

        // 2. M으로 나눈 나머지 저장
        for (int i = 1; i <= N; i++) {
            R[(int) (A[i]%M)]++;
        }

        // 3. 1부터 시작하는 부분합 구간 개수 구하기
        for (int i = 0; i < M; i++) {
            if (R[i] > 1) {                          // star 나머지가 같은 수가 2개 이상 있어야 하므로 1이상 조건
                answer = answer + (R[i]*(R[i]-1)/2); // star 2개를 뽑는 경우의 수를 구하는 공식
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
