package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class ACM호텔_10250 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 1. 테스트 케이스 반복
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            // 방 순서 구하기
            int floor = N % H == 0 ? H * 100 : N % H * 100;
            int order = N % H == 0 ? N / H : (N / H) + 1;
            System.out.println(floor + order);
        }
    }
}
