package com.codingtest.baekjoon.class1_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 구구단_2739 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 구구단 출력
        for (int i = 1; i <= 9; i++) System.out.println(N + " * " + i + " = " + (N * i));
    }
}
