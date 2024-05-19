package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class 수정렬하기3_10989 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 반복문
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(br.readLine());

        // 2. 오름차순 정렬
        Arrays.sort(A);

        // F. 출력
        for (int i : A) bw.write(i + "\n");
        bw.flush();
        bw.close();
    }
}
