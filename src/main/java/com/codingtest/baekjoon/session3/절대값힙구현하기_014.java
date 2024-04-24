package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 절대값힙구현하기_014 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 우선순위 큐 정의 (우선순위 큐는 순서와 상관 없이 우선순위가 높은 데이터가 먼저 나옴)
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int abs_o1 = Math.abs(o1);
            int abs_o2 = Math.abs(o2);

            if (abs_o1 == abs_o2) {
                return o1 > o1 ? 1 : -1;
            }

            return abs_o1 - abs_o2;
        });

        // 2. 입력에 따른 최솟값 구하기
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            if (now != 0) {
                queue.add(now);
            } else {
                if (!queue.isEmpty()) {
                    sb.append(queue.poll() + "\n");
                } else {
                    sb.append(0);
                }
            }
        }

        // F. 출력
        System.out.println(sb.toString());
    }

}
