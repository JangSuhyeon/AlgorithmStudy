package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 숫자의합_11720 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        // 1. 문자열을 문자로 쪼개어 더하기
        int result = 0;
        for (int i = 0; i < N; i++) result += Integer.parseInt(str.substring(i, i+1));

        // F. 출력
        System.out.println(result);
    }
}
