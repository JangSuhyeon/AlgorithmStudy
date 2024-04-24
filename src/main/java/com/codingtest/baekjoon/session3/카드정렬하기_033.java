package com.codingtest.baekjoon.session3;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드정렬하기_033 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 1. 우선선위 큐 데이터 저장
        for (int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }

        // 2. 그리디 탐색
        while (queue.size() > 1) {
            int now = queue.poll();
            int next = queue.poll();
            answer += now + next; // 현재까지 비교한 횟수의 합을 출력해야하기 때문에
            queue.add(now + next);
        }

        // F. 출력
        System.out.println(answer);
    }
}
