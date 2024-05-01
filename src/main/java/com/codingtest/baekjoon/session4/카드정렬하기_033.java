package com.codingtest.baekjoon.session4;

import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드정렬하기_033 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        // 1. 우선순위큐 데이터 저장
        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        // 2. 그리디
        while (pq.size() > 1) {
            int now = pq.poll();
            int prev = pq.poll();
            answer += now + prev;
            pq.add(now + prev);
        }

        // F. 출력
        System.out.println(answer);

    }
}
