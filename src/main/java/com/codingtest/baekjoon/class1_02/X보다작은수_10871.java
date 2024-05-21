package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class X보다작은수_10871 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        // F. 출력
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            if (now < X) System.out.print(now + " ");
        }
    }
}
