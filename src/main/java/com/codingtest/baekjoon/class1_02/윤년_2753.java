package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 윤년_2753 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // F. 출력
        System.out.println(N % 4 == 0 && (N % 100 != 0 || N % 400 == 0) ? 1 : 0);
    }
}
