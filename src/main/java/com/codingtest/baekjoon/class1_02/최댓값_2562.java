package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 최댓값_2562 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);

        // 1. 입력을 받으며 최댓값 및 인덱스 찾기
        int max_value = 0;
        int max_index = 0;
        for (int i = 1; i <= 9; i++) {
            int now = sc.nextInt();
            if (now > max_value) {
                max_index = i;
                max_value = now;
            }
        }

        // F. 출력
        System.out.println(max_value);
        System.out.println(max_index);
    }
}
