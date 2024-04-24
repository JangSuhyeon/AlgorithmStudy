package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 평균구하기_002 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double sum = 0;

        // 1. 평균을 구할 점수 저장
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 총합, 최댓값 구하기
        max = scores[0];
        sum = scores[0];
        for (int i = 1; i < N; i++) {
            sum += scores[i];

            if (max < scores[i]) {
                max = scores[i];
            }
        }

        // F. 출력
        System.out.println(((sum/max)*100)/N); // star max와 sum을 long으로 선언하고 100.0을 곱하면 실수로 출력된다.
    }
}
