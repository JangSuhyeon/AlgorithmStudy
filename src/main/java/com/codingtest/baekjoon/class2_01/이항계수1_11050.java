package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class 이항계수1_11050 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 1. 팩토리얼을 이용하여 이항 계수 구하기
        BigInteger result = getFactorial(BigInteger.valueOf(N)).divide(getFactorial(BigInteger.valueOf(N - K)).multiply(getFactorial(BigInteger.valueOf(K))));

        System.out.println(result);
    }

    private BigInteger getFactorial(BigInteger k) {
        return k.compareTo(BigInteger.ONE) > 0 ?
                k.multiply(getFactorial(k.subtract(BigInteger.ONE))) :
                BigInteger.ONE;
    }
}
