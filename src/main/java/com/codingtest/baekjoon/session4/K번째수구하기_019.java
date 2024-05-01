package com.codingtest.baekjoon.session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K번째수구하기_019 {
    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        // 1. 배열 데이터 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 퀵정렬
        quickSort(A, 0, N - 1, K - 1);
    }

    private void quickSort(int[] A, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(A, S, E);
        }
    }

    private int partition(int[] A, int S, int E) {
        if (S + 1 >= E) {
            if (A[S] > A[E]) swap(A, S, E);
        }

        int M = (S + E) / 2;
        swap(A, S, M);
        int pivot = A[S];
        int i = pivot + 1, j = E;
        while (i <= j) {
            while (j >= S + 1 && pivot < A[j]) {
                j--;
            }

            while (i <= E && pivot > A[i]) {
                i++;
            }

            if (i <= j) {
                swap(A, i++, j--);
            }
        }

        A[S] = A[j];
        A[j] = pivot;
        return j;
    }

    private void swap(int[] A, int S, int E) {
        int temp = A[S];
        A[S] = A[E];
        A[E] = temp;
    }
}
