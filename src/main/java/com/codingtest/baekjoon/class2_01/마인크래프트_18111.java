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

        // 1. 배열에 지형을 저장하면서 높이를 카운트
        int[][] land = new int[N][M];
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int now = Integer.parseInt(st.nextToken());
                land[i][j] = now;
                if (max < now) max = now;
                if (min > now) min = now;
            }
        }
        
        // 2. 최댓값 - 최솟값 사이의 경우의 수 구하기
        int cnt = B;
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int now = land[j][k];
                    if (now > i) cnt += (now - i) * 2;
                    else if (now < i) cnt += (now - i);
                }
            }

            System.out.println(cnt);
        }

    }
}
