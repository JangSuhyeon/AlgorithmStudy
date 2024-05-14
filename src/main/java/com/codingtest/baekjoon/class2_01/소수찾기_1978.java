package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 소수찾기_1978 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 1. 반복문을 돌며 소수 찾기
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            boolean flag = false;

            if (now == 0 || now == 1) continue;
            if (now == 2) {
                result++;
            } else {
                for (int j = 2; j <= Math.sqrt(now) ; j++) {
                    if (now % j == 0) {
                        flag = true;
                        break;
                    }
                }

                if (flag) continue;
                else result++;
            }
        }

        // F. 출력
        System.out.println(result);
    }
}
