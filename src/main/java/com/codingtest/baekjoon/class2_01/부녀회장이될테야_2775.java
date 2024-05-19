package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 부녀회장이될테야_2775 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 1. N 수 만큼 반복문 실행
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[][] A  = new int[k + 1][n];

            // 2. 0층 초기화
            for (int j = 0; j < n; j++) A[0][j] = j + 1; // 0층은 무조건 1부터

            // 3. 층별 부분합 추가
            for (int j = 1; j <= k; j++) { // 1층 부터
                for (int l = 0; l < n; l++) {
                    if (l == 0) A[j][l] = 1;
                    else A[j][l] = A[j][l -1] + A[j - 1][l];
                }
            }

            // F. 출력
            System.out.println(A[k][n - 1]);
        }
    }
}
