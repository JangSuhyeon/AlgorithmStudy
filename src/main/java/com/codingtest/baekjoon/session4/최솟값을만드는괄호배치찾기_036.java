package com.codingtest.baekjoon.session4;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최솟값을만드는괄호배치찾기_036 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int answer = 0;

        // 1. '-' 부호를 기준으로 나누기 (큰 수를 뺄 수록 최솟값이기 때문)
        String[] G = str.split("-");

        // 2. 그리디
        for (int i = 0; i < G.length; i++) {
            int sum = 0;
            String[] G2 = G[i].split("\\+");
            for (int j = 0; j < G2.length; j++) {
                sum += Integer.parseInt(G2[j]);
            }

            if (i == 0) {
                answer = sum;
            } else {
                answer -= sum;
            }
        }

        // F. 출력
        System.out.println(answer);
    }
}
