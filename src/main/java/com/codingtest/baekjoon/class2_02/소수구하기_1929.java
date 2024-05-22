package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 소수구하기_1929 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        // 1. 소수 찾기
        for (int i = M; i <= N; i++) if (ifPrime(i)) System.out.println(i);
    }

    private boolean ifPrime(int i) {
        if (i == 1) return false;
        if (i == 2) return true;
        for (int j = 2; j <= Math.sqrt(i); j++) if (i % j == 0) return false;
        return true;
    }
}
