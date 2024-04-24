package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수구하기_012 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[N];

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 오큰수 구하기
        stack.add(0);
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                answer[stack.pop()] = A[i];
            }

            stack.add(i);
        }

        // F. 출력
        for (int i : answer) {
            if (i == 0) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
