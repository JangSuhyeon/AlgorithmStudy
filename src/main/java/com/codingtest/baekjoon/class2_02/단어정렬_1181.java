package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 단어정렬_1181 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 우선순위 큐 정렬 정의
        PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            return o1.length() - o2.length();
        });

        // 2. queue에 삽입
        for (int i = 0; i < N; i++) queue.add(br.readLine());

        // F. 중복 단어는 제외하며 출력
        String prev = "";
        while (!queue.isEmpty()) {
            String now = queue.poll();
            if (!now.equals(prev)) {
                System.out.println(now);
                prev = now;
            }
        }
    }
}
