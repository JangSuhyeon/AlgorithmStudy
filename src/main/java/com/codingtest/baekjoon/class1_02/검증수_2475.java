package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 검증수_2475 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);

        // 1. 검증수 계산
        int result = 0;
        for (int i = 0; i < 5; i++) result += Math.pow(sc.nextInt(), 2);

        // F. 출력
        System.out.println(result % 10);
    }
}
