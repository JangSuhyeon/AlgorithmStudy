package com.codingtest.baekjoon.class2_02;

import java.io.IOException;
import java.util.Scanner;

public class 체스판다시칠하기_1018 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 1. 체스판 저장
        String[] orgBoard = new String[N];
        for (int i = 0; i < N; i++) orgBoard[i] = sc.next();

        // 2. 한칸씩 이동하며 최소 값 구하기
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int now = getBoard(i, j, orgBoard);
                if (now < min) min = now;
            }
        }

        // F. 출력
        System.out.println(min);
    }

    private int getBoard(int i, int j, String[] orgBoard) {
        String[] whiteBoard = {"WBWBWBWB", "BWBWBWBW"};
        int cnt = 0;
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                if (orgBoard[k + i].charAt(l + j) != whiteBoard[k % 2].charAt(l)) cnt++;
            }
        }

        return Math.min(cnt, 64 - cnt);
    }
}
