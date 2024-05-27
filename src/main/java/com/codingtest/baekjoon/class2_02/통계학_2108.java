package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 통계학_2108 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 배열 저장, 산술평균
        int[] arr = new int[N];
        double sum = 0;
        int[] cnt = new int[8001];
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());
            arr[i] = now;
            sum += now;
            cnt[now + 4000]++;
        }
        System.out.println(Math.round(sum / N));

        // 2. 중앙값
        Arrays.sort(arr);
        System.out.println(arr[N / 2]);

        // 3. 최빈값
        int idx = 0;
        int max = 0;
        boolean flag = false;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                idx = i - 4000;
                flag = true;
            } else if (cnt[i] == max && flag) {
                idx = i - 4000;
                flag = false;
            }
        }
        System.out.println(idx);

        // 4. 범위 출력
        int range = arr[N - 1] - arr[0];
        System.out.println(range);
    }
}
