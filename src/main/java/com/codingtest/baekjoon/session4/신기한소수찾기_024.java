package com.codingtest.baekjoon.session4;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class 신기한소수찾기_024 {
    static int N;
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        // 1. 너비 우선 탐색
        BFS(2, 1);
        BFS(3, 1);
        BFS(5, 1);
        BFS(7, 1);
    }

    static void BFS(int i, int j) {
        if (isPrime(i)) {

            if (N == j) {
                System.out.println(i);
            }

            if (N > j) {
                for (int k = 1; k < 10; k++) {
                    BFS(i*10+k, j+1);
                }
            }
        }
    }

    static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
