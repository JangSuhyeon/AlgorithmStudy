package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상_4949 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        String result = "yes";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 괄호만 스택에 쌓기
        while (true) {
            char[] N = br.readLine().toCharArray();
            if (N.length == 1 && N[0] == '.') break;

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < N.length; i++) {
                char c = N[i];
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = "no";
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        result = "no";
                        break;
                    }
                }
            }

            // 모든 괄호가 짝이 맞는지 확인
            if (!stack.isEmpty()) result = "no";

            // F. 출력
            System.out.println(result);

            // 초기화
            result = "yes";
        }
    }
}
