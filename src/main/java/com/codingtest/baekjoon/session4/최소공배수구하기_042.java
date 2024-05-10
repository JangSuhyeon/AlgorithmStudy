package com.codingtest.baekjoon.session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수구하기_042 {
    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 테스트 케이스 개수만큼 반복
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int remain = 1;

            // 1-1. 큰수, 작은수 찾기
            int big = 0, small = 0;
            if (a > b) {
                big = a;
                small = b;
            } else if (a < b) {
                big = b;
                small = a;
            } else {
                // a와 b가 같은 수일 경우 최소공배수는 a 또는 b
                System.out.println(a);
                continue;
            }

            // 1-2. 큰수 % 작은수 = 나머지
            while (remain != 0) {
                remain = big % small;
                big = small;
                small = remain;
            }

            // F. 최소공배수 출력 (A * B / 최대공약수)
            System.out.println(a * b / big);
        }
    }
}
