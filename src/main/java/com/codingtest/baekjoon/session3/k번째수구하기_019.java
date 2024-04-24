package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class k번째수구하기_019 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        // 1. 배열 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 퀵정렬 함수 실행
        quickSort(A, 0, N - 1, K - 1);

        // F. 출력
        System.out.println(A[K - 1]);
    }

    // 퀵 정렬 함수
    public void quickSort(int[] A, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(A, S, E);
            if (pivot == K) {
                return;
            } else if (pivot > K) { // 인덱스 비교
                quickSort(A, S, pivot - 1, K);
            } else {
                quickSort(A, pivot + 1, E, K);
            }
        }
    }

    // pivot을 기준으로 그룹 나누기
    public int partition(int[] A, int S, int E) {
        if (S + 1 == E) {
            if (A[S] > A[E]) swap(A, S, E);
            return E;
        }

        int M = (S + E) / 2;
        swap(A, S, M);
        int pivot = A[S];
        int i = S + 1, j = E;

        while (i <= j) {
            while (j >= i && pivot < A[j]) {
                j--;
            }
            while (j >= i && pivot > A[i]) {
                i++;
            }
            if (i <= j) {
                swap(A, i++, j--);
            }
        }

        // 피벗 데이터를 나눠진 두 그룹의 경계 index에 저장하기
        A[S] = A[j];
        A[j] = pivot;
        return j;
    }

    // swap 함수
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
