package com.codingtest.baekjoon.class2_01;

import com.fasterxml.jackson.core.JsonToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 최대공약수와최소공배수_2609 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 1. 유클리드 호제법으로 최대 공약수 구하기
        int gcd = getGCD(A, B);
        System.out.println(gcd);

        // 2. 최대 공약수를 이용하여 최소 공배수 구하기
        System.out.println(A * B / gcd);
    }

    private int getGCD(int a, int b) {
        if (a % b == 0) return b;
        return getGCD(b, a % b);
    }
}
