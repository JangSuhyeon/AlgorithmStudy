package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class 마인크래프트_18111 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 1. 동일한 높이의 땅 수 구하기
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int now = st.nextToken().charAt(0) - '0';
                if (height.get(now) == null) height.add(now, 1);
                else height.add(now, height.get(now) + 1);
            }
        }

        for (Integer i : height) {
            System.out.println(i);
        }
    }
}
