package com.codingtest.baekjoon.class2_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수정렬하기2_2751 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 배열 저장
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 2. 오름차순 정렬
        Arrays.sort(A);

        // F. 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : A) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
