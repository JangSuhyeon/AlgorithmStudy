package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 소수찾기_1978 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 소수 카운트
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) if (isPrime(Integer.parseInt(st.nextToken()))) result++;

        // F. 출력
        System.out.println(result);
    }

    private boolean isPrime(int i) {
        if (i == 1) return false;
        if (i == 2) return true;
        for (int j = 2; j <= Math.sqrt(i); j++) if (i % j == 0) return false;
        return true;
    }
}
