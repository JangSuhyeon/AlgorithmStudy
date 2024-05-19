package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.*;

public class 덱_10866 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. N만큼 for문 반복
        StringTokenizer st;
        Deque<String> deque = new ArrayDeque<String>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();

            if (line.equals("push_front")) deque.addFirst(st.nextToken());
            else if (line.equals("push_back")) deque.addLast(st.nextToken());
            else if (line.equals("pop_front")) bw.write(deque.isEmpty() ? "-1\n" : deque.pollFirst() + "\n");
            else if (line.equals("pop_back")) bw.write(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
            else if (line.equals("size")) bw.write(deque.size() + "\n");
            else if (line.equals("empty")) bw.write(deque.isEmpty() ? "1\n" : 0 + "\n");
            else if (line.equals("front")) bw.write(deque.peekFirst() != null ? deque.peekFirst() + "\n" : "-1\n");
            else if (line.equals("back")) bw.write(deque.peekLast() != null ? deque.peekLast() + "\n" : "-1\n");
        }

        // F. 출력
        bw.flush();
        bw.close();
    }
}
