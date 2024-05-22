package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 영화감독숌_1436 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 666부터 시작하여 카운트가 N이 일치할 떄까지 반복
        int cnt = 1;
        int result = 666;
        while (N > cnt) {
            result++;
            if (String.valueOf(result).contains("666")) cnt++;
        }

        // F. 출력
        System.out.println(result);
    }
}
