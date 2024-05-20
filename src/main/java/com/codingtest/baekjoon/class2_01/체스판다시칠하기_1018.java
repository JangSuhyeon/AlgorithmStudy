package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 체스판다시칠하기_1018 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 1. 현재 체스판 저장
        String[] board = new String[N];
        for (int i = 0; i < N; i++) board[i] = sc.next();

        // 2. 8*8 체스판으로 고정하여 이동
        int curSol = Integer.MAX_VALUE; // 최소 비용을 구하기 위해 초기 비교값을 가장 큰 수로 초기화
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int sol = getMinValue(i, j, board);
                if (curSol > sol) curSol = sol;
            }
        }

        // 3. 출력
        System.out.println(curSol);
        sc.close();
    }

    // 화이트 체스판을 기준으로 비용 구하는 함수
    private int getMinValue(int i, int j, String[] board) {
        String[] white_board = {"WBWBWBWB", "BWBWBWBW"};
        int whilteSol = 0;

        for (int k = 0; k < 8; k++) {
            int row = k + i;
            for (int l = 0; l < 8; l++) {
                int col = l + j;

                if (board[row].charAt(col) != white_board[k % 2].charAt(l)) whilteSol++;
            }
        }

        return Math.min(whilteSol, 64 - whilteSol);
    }
}
