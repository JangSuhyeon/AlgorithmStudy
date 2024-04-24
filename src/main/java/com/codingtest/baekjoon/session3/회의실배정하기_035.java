package com.codingtest.baekjoon.session3;

import java.io.IOException;
import java.util.*;

public class 회의실배정하기_035 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][2];

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }

        // 2. 종료시간 -> 시작시간을 기준으로 오름차순 정렬
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        // 3. 그리디 탐색
        int count = 0, end = -1;
        for (int i = 0; i < N; i++) {
            if (A[i][0] >= end) { // 정렬된 데이터이기 때문에 이전 종료시간보다 다음 시작시간이 작거나 크면 카운트
                end = A[i][1];
                count++;
            }
        }

        // F. 출력
        System.out.println(count);
    }
}
