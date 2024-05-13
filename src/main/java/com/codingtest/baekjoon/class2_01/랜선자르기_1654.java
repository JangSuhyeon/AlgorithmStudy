package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 랜선자르기_1654 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long N = sc.nextInt();
        int[] lan = new int[K];

        // 1. 랜선 길이 배열 저장
        for (int i = 0; i < K; i++) {
           lan[i] = sc.nextInt();
        }

        // 2. 이진 탐색을 위한 정렬
        Arrays.sort(lan);

        // 3. 이진 탐색
        int left = 1;
        int right = lan[K - 1];
        int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            for (int i = 0; i < K; i++) {
                count += lan[i] / mid;
            }

            if (count >= N) left = mid + 1;
            else right = mid - 1;
        }

        // F. 출력
        System.out.println(right);
    }
}
