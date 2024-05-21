package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class AplusB3_10950 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 1. 테스트 케이스 반복
        for (int i = 0; i < T; i++) System.out.println(sc.nextInt() + sc.nextInt());
    }
}
