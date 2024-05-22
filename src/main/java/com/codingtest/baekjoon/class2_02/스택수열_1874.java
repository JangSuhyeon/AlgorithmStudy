package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열_1874 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 배열 저장
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        // 2. 큐에 삽입, 제거하며 출력
        Stack<Integer> stack = new Stack<Integer>();
        int idx = 0;
        for (int i : arr) {
            while (idx < i) {
                stack.add(++idx);
                sb.append("+\n");
            }

            while (!stack.isEmpty() && stack.peek() == i) {
                stack.pop();
                sb.append("-\n");
            }
        }

        // F. 출력
        System.out.println(!stack.isEmpty() ? "NO" : sb);
    }
}
