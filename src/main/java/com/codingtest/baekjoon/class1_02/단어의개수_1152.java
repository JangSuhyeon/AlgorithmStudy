package com.codingtest.baekjoon.class1_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 단어의개수_1152 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 문자열 처리
        String str = br.readLine().trim();
        String[] A = str.split(" ");

        // F. 출력
        System.out.println(A[0].isEmpty() ? 0 : A.length);
    }
}
