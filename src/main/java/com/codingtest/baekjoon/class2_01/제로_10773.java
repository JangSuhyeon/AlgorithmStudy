package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class 제로_10773 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 반복문을 돌며 Stack으로 처리
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            if (!stack.isEmpty() && now == 0) stack.pop();
            else stack.push(now);
        }

        // 2. 합계
        while(!stack.isEmpty()) result += stack.pop();

        // F. 출력
        System.out.println(result);
    }
}
