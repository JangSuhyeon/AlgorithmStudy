package com.codingtest.baekjoon.class1_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 단어공부_1157 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        // 1. 배열 초기화
        int[][] arr = new int[26][2];
        for (int i = 0; i < arr.length; i++) arr[i][0] = i;

        // 2. 알파벳 카운트
        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i) - 'A';
            arr[now][1]++;
        }

        // 3. 알파벳 갯수를 기준으로 오름차순
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        // F. 출력
        if (arr[0][1] == arr[1][1]) System.out.println("?");
        else System.out.println((char)(arr[0][0] + 'A'));
    }
}
