package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기2_004 {
    public void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] X = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < N; j++) X[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] S = new int[N+1][N+1];
        for (int i = 1; i < S.length; i++) {
            for (int j = 1; j < S[i].length; j++) {
                S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + X[i-1][j-1]; // 수식 만들기
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]); // 수식 만들기
        }
    }
}
