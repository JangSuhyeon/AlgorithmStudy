package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 단어정렬_1181 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 우선순위 큐 정렬 정의
        PriorityQueue<String> pq = new PriorityQueue<String>((o1, o2) -> {
            int o1_length = o1.length();
            int o2_length = o2.length();

            if (o1_length == o2_length) {
                return o1.compareTo(o2);
            }

            return o1_length - o2_length;
        });

        // 2. 단어 우선순위 큐에 저장
        for (int i = 0; i < N; i++) {
            pq.add(sc.next());
        }

        // F. 출력
        String prev = "";
        while (!pq.isEmpty()){
            String now = pq.poll();
            if (!prev.equals(now)) {
                System.out.println(now);
                prev = now;
            }
        }
    }
}
