package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 블랙잭_2798 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 1. 카드 배열 저장
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) cards[i] = Integer.parseInt(st.nextToken());

        // 2. 브루스 포스 알고리즘(완전 탐색, 3중 for문)
        int result = search(cards, N, M);

        // F. 출력
        System.out.println(result);
    }

    private int search(int[] cards, int N, int M) {
        int min = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N -1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int now = cards[i] + cards[j] + cards[k];

                    if (now == M) return now;

                    if (now <= M && now > min) {
                        min = now;
                    }
                }
            }
        }
        return min;
    }
}
