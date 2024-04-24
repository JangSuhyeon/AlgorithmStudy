package com.codingtest.baekjoon.session2;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수구하기_012 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] A = new int[N];
        int[] answer = new int[N];

        // 1. 수열 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 스택 탐색
        for (int i = 0; i < N; i++) {
            int in = A[i];

            while (!stack.isEmpty() && A[stack.peek()] < in) {
                answer[stack.pop()] = in;
            }

            stack.push(i);  // star 인덱스를 저장하는 것이 키 포인트
        }

        // 3. 오큰수가 없는 수 처리
        for (int i : answer) {
            if (i == 0) {
                bw.write("-1 ");
            } else {
                bw.write(i + " ");
            }
        }

        // F. 출력
        System.out.println(bw);
        bw.flush();
        br.close();
    }
}
