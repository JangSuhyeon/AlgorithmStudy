package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 버블소트플그램1_016 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        int max = 0;

        // 1. 배열에 저장
        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }

        // 2. 정렬
        Arrays.sort(A);

        // 3. 최대 이동 인덱스 구하기
        for (int i = 0; i < N; i++) {
            if (A[i].index - i > max) {
                max = A[i].index - i;
            }
        }

        // F. 출력
        System.out.println(max+1);
    }
}

