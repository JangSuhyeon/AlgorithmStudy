package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 절대값힙구현하기_014 {

    public void solution() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 값이 들어올 때마다 기준에 따라 정렬되어야 한다 -> 우선순위 큐(순서와 상관 없이 우선순위가 높은 데이터가 먼저 나오는 자료구조)
        PriorityQueue<Integer> Q = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs)
                return o1 > o2 ? 1 : -1;
                //o1이 더 크다면 양수 반환 -> o1과 o2의 자리를 바꾼다
                //o1이 더 작다면 음수 반환 -> 지금의 자리를 유지한다
            else
                return first_abs - second_abs;
                //양수가 반환되면 o1의 절댓값이 더 큰 경우이다 -> o2, o1순으로 정렬
                //음수가 반환되면 o2의 절대값이 더 큰 경우이다 -> o1, o2 유지
        });

        for (int i = 0; i < N; i++) {
            int in = Integer.parseInt(br.readLine());
            if (in == 0) {
                if(Q.isEmpty()) System.out.println(0);
                else System.out.println(Q.poll());
            }else {
                Q.add(in);
            }
        }
    }
}
