package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.*;

public class 프린터큐_1966 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 1. 테스트 케이스
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 문서 수
            int M = sc.nextInt(); // 해당 순서의 문서가 몇번째로 출력되는지
            StringTokenizer st = new StringTokenizer(sc.next());
            Queue<Integer> queue = new LinkedList<Integer>();

            queue.add(Integer.valueOf(st.nextToken()));
            for (int j = 0; j < N; j++) {

            }
        }
    }
}
