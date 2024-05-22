package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 통계학_2108 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 배열 저장 및 최빈값 찾기
        double sum = 0;
        int[][] arr = new int[N][2]; // {수, 카운트}
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())][0] = Integer.parseInt(br.readLine());
            arr[Integer.parseInt(br.readLine())][1]++;
            sum += arr[i][0];
        }

        // 2. 산술평균
        System.out.println(Math.round(sum / N));

        // 3. 수의 크기를 기준으로 오름차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        // 4. 중앙값
        System.out.println(arr[N / 2][0]);

        // 5. 범위
        int range = arr[N - 1][0] - arr[0][0];

        // 6. 빈도수를 기준으로 오름차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) return o2[0] - o1[0];
                return o1[1] - o2[1];
            }
        });

        for (int[] ints : arr) {
            System.out.println(ints[0] + " " + ints[1]);
        }
        // 8. 최빈값
        System.out.println(arr.length == 1 ? arr[0][0] : arr[N - 1][1] == arr[N - 2][1] ? arr[N - 2][0] : arr[N - 1][0]);

        // 7. 범위 출력
        System.out.println(range);
    }
}
