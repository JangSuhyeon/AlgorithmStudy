package com.codingtest.baekjoon.session4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수구하기_012 {
    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        Stack<Integer> stack = new Stack<Integer>();
        int[] answer = new int[N];

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 스택
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                answer[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        // 3. 오큰수가 없는 수 처리
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : answer) {
            if (i == 0) {
                bw.write("-1 ");
            } else {
                bw.write(i + " ");
            }
        }

        bw.flush();
    }
}
