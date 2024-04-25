package com.codingtest.baekjoon.session3;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 거의소수구하기_038 {

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[B + 1];

        // 1. 배열 초기화
        for (int i = 2; i <= B ; i++) {
            arr[i] = i;
        }

        // 2. 소수 구하기
        for (int i = 2; i <= Math.sqrt(B); i++) {
            if (arr[i] == 0) continue;
            for (int j = i + i; j <= B; j = j + i) {
                arr[j] = 0;
            }
        }

        // 3. 거의 소수 카운트
        for (int i = A; i <= B; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                while (temp <= B){
                    temp = temp * arr[i];
                    answer++;
                    System.out.println(temp);
                }
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
