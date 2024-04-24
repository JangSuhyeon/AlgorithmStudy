package com.codingtest.baekjoon.session3;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택으로오름차순수열만들기_011 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int idx = 0;

        // 1. 스택 오름차순
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();

            // 1-1. 수열의 값과 스택의 마지막 노드가 같을때까지 stack에 더하기
            while (stack.isEmpty() || stack.peek() < now) {
                stack.add(++idx);
                sb.append("+\n");
            }

            // 2-2. 같으면 pop
            stack.pop();
            sb.append("-\n");
        }

        // F. 출력
        if (stack.size() > 0) {
            System.out.println("NO");
        } else {
            System.out.println(sb.toString());
        }
    }
}
