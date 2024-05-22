package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 평균_1546 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 최댓값 구하기
        int max = 0;
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (scores[i] > max) max = scores[i];
        }

        // 2. 합계 구하기
        double result = 0;
        for (int score : scores) result += (double) score / max * 100;

        // F. 출력
        System.out.println(result / N);

    }
}
