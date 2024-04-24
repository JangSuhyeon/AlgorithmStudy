package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 신기한소수찾기_2_024 {
    int N;
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        // 1. DFS
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    private void DFS(int n, int j) {
        if (j == N) {
            if (isPrime(n)) {
                System.out.println(n);
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) {
                continue;
            }

            if (isPrime(n * 10 + i)) {
                DFS(n * 10 + i, j + 1);
            }
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
