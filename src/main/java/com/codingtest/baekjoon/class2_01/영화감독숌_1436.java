package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 영화감독숌_1436 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 666;
        int count = 1; // 666을 먼저 카운트 한 상태로 시작

        // 1. N번째 종말의 수 찾기
        while (count < N) {
            num++;

            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }

        // F. 출력
        System.out.println(num);
    }
}
