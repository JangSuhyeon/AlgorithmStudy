package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 수찾기_1920 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 정수 배열 저장
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        // 2. 이진 탐색을 위한 배열 오름차순 정렬
        Arrays.sort(A);

        // 3. 이진 탐색
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int now = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = N - 1;
            int mid = 0;

            while (start <= end) {
                mid = (start + end) % 2 != 0 ? (start + end) / 2 + 1 : (start + end) / 2;
                if (A[mid] > now) end = mid - 1;
                else if (A[mid] == now) break;
                else start = mid + 1;
            }

            // F. 출력
            if (A[mid] == now) System.out.println(1);
            else System.out.println(0);
        }
    }
}
