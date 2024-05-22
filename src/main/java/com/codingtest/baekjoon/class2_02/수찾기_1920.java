package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 수찾기_1920 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 배열 저장
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        // 2. 이진 탐색을 위한 오름차순 정렬
        Arrays.sort(arr);

        // 2. 이진 탐색
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int now = Integer.parseInt(st.nextToken());
            boolean flag = false;

            int start = 0, end = N - 1, mid;
            while (start <= end) {
                mid = (start + end) / 2;
                if (arr[mid] == now) {
                    flag = true;
                    break;
                }

                if (arr[mid] > now) end = mid - 1;
                else start = mid + 1;
            }

            System.out.println(flag ? "1" : "0");
        }
    }
}
