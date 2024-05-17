package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택_10828 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. for문을 돌며 명령 처리
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String now = st.nextToken();
            if (now.equals("push")) stack.push(Integer.valueOf(st.nextToken()));
            else if (now.equals("pop")) {
                if(!stack.isEmpty()) bw.write(stack.pop() + "\n");
                else bw.write(-1 + "\n");
            } else if (now.equals("size")) bw.write(stack.size() + "\n");
            else if (now.equals("empty")) {
                if (stack.isEmpty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            }
            else if (now.equals("top")) {
                if (!stack.isEmpty()) bw.write(stack.peek() + "\n");
                else bw.write(-1 + "\n");
            }
        }

        // F. 출력
        bw.flush();
        bw.close();
    }
}
