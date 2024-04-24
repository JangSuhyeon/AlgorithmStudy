package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준의 문제와 달라 결과 모름
public class 좋은수구하기_008 {
    public void solution() throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) A[i] = Long.parseLong(st.nextToken());
        Arrays.sort(A); // 합을 비교하는 문제이므로 정렬

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int start = 0, end = N-1; // 양 끝에서 시작
            while (start < end) {
                long sum = A[start] + A[end];
                if(sum == A[i]) {
                    if (start != A[i] && end != A[i]) { // 자기 자신을 제외한 다른 수의 합이기 때문에 자기 자신 제외
                        cnt++;
                        break;
                    } else if (start == A[i]) {
                        start++;
                    } else if (end == A[i]){
                        end--;
                    }
                } else if (sum > A[i]) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        System.out.println(cnt);
        bf.close();
    }
}
