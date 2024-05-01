package com.codingtest.baekjoon.session4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 회의실배정하기_035 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][2];
        int answer = 0;

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }

        // 2. star 배열 정렬 정의
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        // 3. 그리디
        int end = -1;
        for (int i = 0; i < N; i++) {
            if (A[i][0] >= end) {
                end = A[i][1];
                answer++;
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
