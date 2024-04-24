package com.codingtest.baekjoon.session2;

import java.io.IOException;
import java.util.Scanner;

public class 내림차순으로자릿수정렬하기_017 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] A = new int[N.length()];

        // 1. N을 숫자 배열로 저장
        for (int i = 0; i < N.length(); i++) {
            A[i] = Integer.parseInt(N.substring(i, i+1));
        }

        // 2. 선택 정렬
        for (int i = 0; i < N.length(); i++) {
            int idx = i;
            int min = A[i];
            for (int j = i+1; j < N.length(); j++) { // star 선택 정렬은 앞에서부터 고정이다.
                if (min < A[j]) {
                    idx = j;
                    min = A[j];
                }
            }

            int temp = A[i];
            A[i] = min;
            A[idx] = temp;
        }

        // F. 출력
        for (int i : A) {
            System.out.print(i);
        }
    }
}
