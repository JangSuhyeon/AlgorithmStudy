package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.*;

public class 큐_10845 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. N만큼 반복문 실행
        StringTokenizer st;
        int last = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();

            if (line.equals("push")) {
                int now = Integer.parseInt(st.nextToken());
                queue.add(now);
                last = now;
            }
            else if ((line.equals("front") || line.equals("back")) && queue.isEmpty())
                bw.write("-1\n");
            else if (line.equals("front")) bw.write(queue.peek() + "\n");
            else if (line.equals("back")) bw.write(last + "\n");
            else if (line.equals("size")) bw.write(queue.size() + "\n");
            else if (line.equals("pop")) bw.write(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
            else if (line.equals("empty")) bw.write(queue.isEmpty() ? "1\n" : "0\n");
        }

        // F. 출력
        bw.flush();
        bw.close();
    }
}
