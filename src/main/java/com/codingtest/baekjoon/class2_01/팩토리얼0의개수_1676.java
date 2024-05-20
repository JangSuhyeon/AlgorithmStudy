package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class 팩토리얼0의개수_1676 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. N팩토리얼 구하기
        BigInteger F = getFactorial(BigInteger.valueOf(N));

        // 2. 뒷자리부터 0의 갯수 구하기
        String stringF = String.valueOf(F);
        int result = 0;
        for (int i = stringF.length() - 1; i >= 0; i--) {
            if (stringF.charAt(i) == '0') result++;
            else break;
        }

        // F. 출력
        System.out.println(result);
        sc.close();
    }

    // 팩토리얼 구하기
    private BigInteger getFactorial(BigInteger n) {
        return n.compareTo(BigInteger.ONE) > 0 ?
                n.multiply(getFactorial(n.subtract(BigInteger.ONE))) :
                BigInteger.ONE;
    }
}
