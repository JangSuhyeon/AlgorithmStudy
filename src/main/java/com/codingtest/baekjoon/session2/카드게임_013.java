package com.codingtest.baekjoon.session2;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 카드게임_013 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        // 1. 큐에 N만큼 저장
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 2. 계산
        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        // F. 출력
        System.out.println(queue.poll());
    }
}
