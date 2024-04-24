package com.codingtest.baekjoon.session1;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수구하기_012 {

    public void solution() throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());

        int[] answer = new int[n];
        Stack<Integer> S = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!S.isEmpty() && A[S.peek()] < A[i]) {
                answer[S.pop()] = A[i];
            }

            S.push(i);
        }

        // 어차피 stack이 빌때까지 반복할 것이므로 while을 이용
        while(!S.isEmpty()) answer[S.pop()] = -1;

        // System.out.println보다 BufferedWriter를 이용하는게 빠르다
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : answer) {
            bw.write(i + " ");
        }

        bw.flush();
    }
}
