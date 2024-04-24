package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의명령_007 {
    public void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(A); // 크기를 비교하므로 값을 정렬

        int start = 0, end = N-1, cnt = 0; // 투 포인터를 양쪽 끝에 위치
        while(start < end){ // 투 포인터가 양 끝에서 가운데로 모이기 때문에 통과하지 않기 위해서
            int sum = A[start] + A[end];
            if(sum == M) {
                cnt++;
                start++;
                end--;
            } else if (sum > M) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(cnt);
    }
}
