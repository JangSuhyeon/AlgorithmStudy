package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 덩치_7568 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 덩치 배열 저장
        int[][] A = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = Integer.parseInt(st.nextToken());
        }

        // 2. 이중 for문 비교
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            int[] now = A[i];
            for (int j = 0; j < N; j++) {
                int[] other = A[j];
                if (now[0] < other[0] && now[1] < other[1]) result[i]++;
            }
        }

        // F. 출력
        for (int i : result) {
            System.out.print(i + 1 + " ");
        }
    }
}
