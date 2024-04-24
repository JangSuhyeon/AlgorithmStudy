package com.codingtest.baekjoon.session2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기2_004 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][N];
        int[][] B = new int[N+1][N+1]; // 부분합 배열 저장 시 인덱스-1을 사용하므로 N+1 길이의 배열로 선언

        // 1. 원본 배열 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. 부분합 배열 저장
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                B[i][j] = B[i-1][j] + B[i][j-1] - B[i-1][j-1] + A[i-1][j-1];
            }
        }

        // F. 출력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(B[x2][y2] - B[x1-1][y2] - B[x2][y1-1] + B[x1-1][y1-1]);
        }
    }
}
