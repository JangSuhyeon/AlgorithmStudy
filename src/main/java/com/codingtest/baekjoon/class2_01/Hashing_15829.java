package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.Stack;

public class Hashing_15829 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] A = br.readLine().toCharArray();

        int result = 0;
        int pow = 1;
        for (int i = 0; i < A.length; i++) {
            int now = A[i] - 96;
            result += now * pow;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(result % 1234567891);
    }
}
