package com.codingtest.baekjoon.session2;

import java.io.IOException;
import java.util.Scanner;

public class 수정렬하기_000 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        // 1. 정렬할 배열 저장
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 2. 버블 정렬
        for (int i = 0; i < N-1; i++) {         // 반복문 횟수만을 위함 star N개의 배열에서 swap은 최대 N-1번만 일어날 수 있으므로 N-1까지
            for (int j = 0; j < N-1-i; j++) {   // 실제 정렬을 하는 부분
                if (A[j] > A[j + 1]) {
                    int temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }
            }
        }

        // F. 출력
        for (int i : A) {
            System.out.println(i);
        }
    }
}
