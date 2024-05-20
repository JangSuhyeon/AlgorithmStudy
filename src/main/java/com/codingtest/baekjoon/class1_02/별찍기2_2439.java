package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 별찍기2_2439 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // F. 출력
        for (int i = 1; i <= N; i++) System.out.printf("%" + N + "s%n", "*".repeat(i));
    }
}
