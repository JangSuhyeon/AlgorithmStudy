package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 신기한소수찾기_024 {
    public static int N;

    public void solution() throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    static void DFS(int s, int j) {
        if (j == N) {
            if (isPrime(s)) {
                System.out.println(s);
            }
            return;
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) continue;

            if (isPrime(s * 10 + i)) {
                DFS(s * 10 + i, j + 1);
            }
        }
    }

    static boolean isPrime(int s) {
        for (int i = 2; i <= s; i++) {
            if (s%i==0)
                return false;
        }
        return true;
    }
}
