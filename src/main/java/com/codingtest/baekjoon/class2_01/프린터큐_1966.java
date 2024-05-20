package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 프린터큐_1966 {

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 1. 테스트 케이스 수 만큼 반복
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken()); // 원래 순서의 문서

            Queue<int[]> papers = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int now = Integer.parseInt(st.nextToken());
                papers.add(new int[]{j, now});
            }

            int result = 0;
            while (true) {
                int[] cur = papers.poll();
                boolean chk = false;

                for (int[] paper : papers) {
                    if (cur[1] < paper[1]) {
                        chk = true;
                        break;
                    }
                }

                if (chk) {
                    papers.add(cur);
                } else {
                    result++;
                    if (cur[0] == M) break;
                }
            }

            System.out.println(result);
        }
    }
}
