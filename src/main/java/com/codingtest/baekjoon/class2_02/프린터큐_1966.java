package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 프린터큐_1966 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 1. 테스트 케이스 반복
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 2. 문서 중요도 저장
            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) queue.add(new int[]{Integer.parseInt(st.nextToken()), j}); // {중요도, 순서}

            // 3. 출력 순서 구하기
            int result = 0;
            while (!queue.isEmpty()) {
                int[] now = queue.poll();
                boolean flag = false;

                for (int[] q : queue) if (q[0] > now[0]) flag = true;

                if (flag) queue.add(now);
                else {
                    result++;
                    if (now[1] == M) break;
                }
            }

            // F. 출력
            System.out.println(result);
        }
    }
}
