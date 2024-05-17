package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 요세푸스문제0_11866 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 1. N까지 list에 저장
        int[] A = new int[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = 1;
        }

        // 3. 모두 제거될 때까지 반복하여 제거
        int cnt = 0;
        int idx = 1;
        while (cnt < N) {
            System.out.println(idx + " : " + A[idx]);
            if (A[idx] == 1) {
                idx++;
            }
            System.out.println("idx 추가 : " + idx);
            if (idx == 3) {
                A[idx] = 0;
                System.out.println(idx);
                cnt++;
            }
        }
    }
}
