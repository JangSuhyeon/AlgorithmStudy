package com.codingtest.baekjoon.session3;

import java.io.IOException;
import java.util.Scanner;

public class 수정렬하기_000 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 2. 버블 정렬
        for (int i = 0; i < N - 1; i++) {  // swap 최대 횟수
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        // F. 출력
        for (int i : A) {
            System.out.println(i);
        }

    }
}
