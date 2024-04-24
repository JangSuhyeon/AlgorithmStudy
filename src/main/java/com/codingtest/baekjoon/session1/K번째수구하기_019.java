package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K번째수구하기_019 {

    public void solution() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int pIdx = A.length/2;
        int p = A[pIdx];
        A[pIdx] = A[0];
        A[0] = p;

        while (pIdx == K) {
            int start = 1, end = N-1;
            while (start < end) {
                if (A[end] > p) {
                    end--;
                } else if (A[start] < p) {
                    start++;
                }
            }

            pIdx = start;
            A[pIdx] = A[start];
            A[start] = p;
        }

        System.out.println(A[pIdx]);
    }
}
