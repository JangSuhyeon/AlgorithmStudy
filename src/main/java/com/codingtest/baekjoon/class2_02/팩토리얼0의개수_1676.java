package com.codingtest.baekjoon.class2_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 팩토리얼0의개수_1676 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 팩토리얼 수 구하기
        String F = String.valueOf(getFactorial(BigInteger.valueOf(N)));

        // 2. 뒤에서부터 0의 개수 구하기
        int result = 0;
        for (int i = F.length() - 1; i >= 0; i--) {
            if (F.charAt(i) == '0') result++;
            else break;
        }

        // F. 출력
        System.out.println(result);
    }

    private BigInteger getFactorial(BigInteger n) {
        return n.compareTo(BigInteger.ONE) > 0 ?
                n.multiply(getFactorial(n.subtract(BigInteger.ONE))) :
                BigInteger.ONE;
    }
}
