package com.codingtest.baekjoon.class2_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열_1874 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 수열 배열 저장
        int idx = 1;
        boolean flag = false;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();

            // 2. 스택 수열
            while (idx <= now) {
                stack.add(idx);
                idx++;
                sb.append("+\n");
            }

            if (now == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            } else {
                flag = true;
            }
        }

        // F. 출력
        if (flag) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
