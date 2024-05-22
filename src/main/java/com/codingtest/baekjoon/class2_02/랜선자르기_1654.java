package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 랜선자르기_1654 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1. 랜선 배열 저장
        int[] lines = new int[N];
        long end = 0;
        for (int i = 0; i < N; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if (end < lines[i]) end = lines[i];
        }

        // 2. 이분탐색
        int result = 0;
        long start = 1;
        long mid = (start + end) / 2;
        while (start <= end) {

            // 3. mid 길이로 랜선들을 잘랐을 때 나오는 갯수 구하기
            long cnt = 0;
            for (int i = 0; i < lines.length; i++) cnt += lines[i] / mid;

            if (cnt < K) end = mid - 1;
            else start = mid + 1;

            mid = (start + end) / 2;

        }

        // F. 출력
        System.out.println(start - 1);
    }
}
