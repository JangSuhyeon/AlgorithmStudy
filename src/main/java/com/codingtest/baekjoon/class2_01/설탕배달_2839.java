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
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 반복문
        while (N > 0) {
            if (N % 5 == 0){
                result += N / 5;
                break;
            }
            if (N < 3) {
                result = -1;
                break;
            }
            N -= 3;
            result++;
        }

        // F. 출력
        System.out.println(result);
    }
}
