package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블루레이만들기_2_030 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int start = 0, end = 0;

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            // 레슨 최대 길이를 시작 인덱스로 지정
            if (start < A[i]) start = A[i];

            // 레슨 길이의 총합을 종료 인덱스로 지정
            end += A[i];
        }

        // 2. 이진 탐색
        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0, count = 0;

            for (int i = 0; i < N; i++) {
                if (sum + A[i] > mid) {
                    count++;
                    sum = 0;
                }

                sum += A[i];
            }

            if (sum > 0) count++;

            if (count > M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // F. 출력
        System.out.println(start);
    }
}
