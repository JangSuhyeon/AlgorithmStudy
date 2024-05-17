package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 좌표정렬하기_11650 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 우선순위 큐 정의
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        // 2. 우선순위 큐에 데이터 저장
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            queue.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        // F. 출력
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            System.out.println(now[0] + " " + now[1]);
        }

    }
}
