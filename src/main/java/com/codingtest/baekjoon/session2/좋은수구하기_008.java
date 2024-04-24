package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좋은수구하기_008 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        // 1. N개의 수 저장
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); // star 정렬이 되어있다고 안나와있으므로 실행

        // 2. 모든 수를 돌며 투 포인터 탐색
        if (N >= 3) {
            for (int i = 2; i < N; i++) {
                int M = A[i];
                int left = 0, right = i-1;

                while (left < right) {
                    int sum = A[left]+A[right];
                    if (sum == M) {
                        answer++;
                        break; // star 한번이라도 해당 M이 좋은 수가 되면 뒤에 계산은 필요가 없으므로
                    } else if (sum < M) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
