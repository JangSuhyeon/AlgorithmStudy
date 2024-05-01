package com.codingtest.baekjoon.session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 블루레이만들기_030 {
    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int start = 0, end = 0;

        // 1. 시작 값과 종료 값 저장, 배열 데이터 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            if (start < A[i]) start = A[i];
            end += A[i];
        }

        // 2. 이진 탐색
        while (start <= end) {
            int mid = (start + end) / 2; // 현재 턴에서 선택한 블루레이 크기
            int sum = 0, count = 0;

            for (int i = 0; i < N; i++) {
                if (sum + A[i] > mid) {
                    count++;
                    sum = 0;
                }

                sum += A[i];
            }

            if (sum > 0) count++;

//            if (count == M) break; --> star 최솟값을 구하는 것이기 때문에 while 조건이 참인 동안에는 멈추면 안된다.

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
