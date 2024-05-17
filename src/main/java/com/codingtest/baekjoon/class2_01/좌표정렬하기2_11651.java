package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 좌표정렬하기2_11651 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 2차원 배열에 좌표 저장
        int[][] A = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = Integer.parseInt(st.nextToken());
        }

        // 2. 정렬 정의
        Arrays.sort(A, (o1, o2) -> {
            if (o1[1] == o2[1]) return o1[0] - o2[0];
            return o1[1] - o2[1];
        });

        // F. 출력
        for (int[] ints : A) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
