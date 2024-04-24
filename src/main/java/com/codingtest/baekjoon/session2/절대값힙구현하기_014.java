package com.codingtest.baekjoon.session2;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class 절대값힙구현하기_014 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        StringBuilder answer = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 우선순위 큐 우선순위 정하기
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            // (1) 절대값 구하기
            int first = Math.abs(o1);
            int second = Math.abs(o2);

            // (2) 절대값이 같으면
            if (first == second) {
                return o1 > o2 ? 1 : -1; // star 양수면 자리 교체, 음수면 그대로
            } else {
                // (3) 절대값이 다르면
                return first - second;
            }
        });

        // 2. 절대값 힙 구현
        for (int i = 0; i < N; i++) {
            int in = sc.nextInt();

            if (in == 0) {
                if (priorityQueue.isEmpty()) {
                    answer.append(0 + "\n");
                } else {
                    answer.append(priorityQueue.poll() + "\n");
                }
            } else {
                priorityQueue.add(in);
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
