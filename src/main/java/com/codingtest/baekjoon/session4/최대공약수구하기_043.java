package com.codingtest.baekjoon.session4;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 최대공약수구하기_043 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 1. 최대 공약수 구하기
        int p = gcd(A, B);

        // 2. 자릿수의 최대 공약수만큼 1 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < p; i++) {
            bw.write("1");
        }
        bw.flush();
        bw.close();
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
