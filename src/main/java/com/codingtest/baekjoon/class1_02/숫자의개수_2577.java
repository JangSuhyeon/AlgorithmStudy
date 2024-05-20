package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 숫자의개수_2577 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() * sc.nextInt() * sc.nextInt();

        // 1. 반복문을 돌며 숫자 카운트
        int[] A = new int[10];
        while (m > 0) {
            A[m % 10]++;
            m /= 10;
        }

        // F. 출력
        for (int i : A) System.out.println(i);
    }
}
