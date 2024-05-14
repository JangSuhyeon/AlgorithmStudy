package com.codingtest.baekjoon.class2_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class 설탕배달_2839 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int result = 0;
        int result5 = 0;
        int result3 = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 5킬로그램으로 먼저 나누기
        result5 += N / 5;
        if (N % 5 != 0) {
            int remain = N % 5;
            result5 += remain / 3;

            if (remain % 3 != 0) {
                result5 = -1;
            }
        }

        // 2. 3킬로그램으로 먼저 나누기
        result3 += N / 3;
        if (N % 3 != 0) {
            result3 = -1;
        }

        // 3. 최소 봉지 수 구하기
        if (result5 == -1) {
            if (result3 == -1) {
                result = -1;
            } else {
                result = result3;
            }
        } else if (result3 == -1) {
            result = result5;
        } else {
            result = Math.min(result5, result3);
        }

        // F. 출력
        System.out.println(result);
    }
}
