package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 내림차순으로자릿수정렬하기_017 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] A = new int[str.length()];

        // 1. 수열로 저장
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        // 2. 선택 정렬
        for (int i = 0; i < A.length; i++) {
            int max = i;
            for (int j = i+1; j < A.length; j++) {
                if (A[max] < A[j]) {
                    max = j;
                }
            }

            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        // F. 출력
        for (int i : A) {
            System.out.print(i);
        }
    }
}
