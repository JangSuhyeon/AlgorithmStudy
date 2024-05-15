package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 괄호_9012 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 반복문
        for (int i = 0; i < N; i++) {
            char[] now = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<Character>();
            String result = "YES\n";

            for (int j = 0; j < now.length; j++) {
                char c = now[j];
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = "NO\n";
                        break;
                    }
                }
            }

            // 괄호가 짝이 맞는지 확인
            if (!stack.isEmpty()) result = "NO\n";

            bw.write(result);
        }

        // F. 출력
        bw.flush();
        bw.close();
    }
}
