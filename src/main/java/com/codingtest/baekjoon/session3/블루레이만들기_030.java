package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블루레이만들기_030 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int start = 0, end = 0;

        // 1. 데이터 배열 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            // 1-1. 레슨 최댓값을 시작 인덱스로 저장
            if (start < A[i]) start = A[i];

            // 2-2. 레슨 총합을 종료 인덱스로 저장
            end += A[i];
        }

        // 2. 이진 탐색
        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0, count = 0;

            // mid값으로 모든 레슨을 저장할 수 있는지 확인
            for (int i = 0; i < N; i++) {
                if (sum + A[i] > mid) { // 저장 못 할 때 다음 블루레이로
                    count++;
                    sum = 0;
                }
                sum += A[i];
            }

            if (sum > 0) count++; // 탐색 후 0이 아니면 블루레이 1개가 더 필요하므로 더함

            if (count > M) { // 중간 인덱스 값으로 모든 레슨 저장 불가능
                start = mid + 1;
            } else { // 중간 인덱스 값으로 모든 레슨 저장 가능
                end = mid - 1;
            }
        }

        // F. 출력
        System.out.println(start);
    }
}
