package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수정렬하기1_015 {

    public void solution() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for (int i : A) System.out.println(i);
    }
}
