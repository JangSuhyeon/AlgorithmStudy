package com.codingtest.baekjoon.session4;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 절대값힙구현하기_014 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 우선순위 큐 정렬 정의
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int abs_o1 = Math.abs(o1);
            int abs_o2 = Math.abs(o2);

            if (abs_o1 == abs_o2) {
                return o1 - o2;
            }

            return abs_o1 - abs_o2;
        });

        // F. 출력
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();

            if (now != 0) {
                pq.add(now);
            } else {
                if (pq.size() > 0) {
                    System.out.println(pq.poll());
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}
