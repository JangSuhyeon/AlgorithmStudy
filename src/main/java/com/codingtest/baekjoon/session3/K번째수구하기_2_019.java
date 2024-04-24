package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K번째수구하기_2_019 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
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

        // 2. 퀵 정렬
        quickSort(A, 0, N - 1, K - 1);

        // F. 출력
        System.out.println(A[K - 1]);
    }

    // 퀵 정렬 함수
    private void quickSort(int[] A, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(A, S, E);

            if (pivot == K) {
                return;
            } else if (pivot > K) {
                quickSort(A, S, pivot - 1, K);
            } else {
                quickSort(A, pivot + 1, E, K);
            }
        }
    }

    // 그룹 나누기
    private int partition(int[] A, int S, int E) {
        if (S + 1 == E) {
            if (A[S] > A[E]) {
                swap(A, S, E);
                return E;
            }
        }

        int M = (S + E) / 2;
        swap(A, S, M);
        int pivot = A[S];
        int i = S + 1, j = E;

        while (i <= j) {
            while (i <= j && pivot < A[j]) {
                j--;
            }
            while (i <= j && pivot > A[i]) {
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

    // swap 함수
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
