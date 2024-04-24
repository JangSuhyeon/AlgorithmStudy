package com.codingtest.baekjoon.session2;

import java.io.IOException;
import java.util.Scanner;

public class 숫자의합구하기_001 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next(); // star N의 범위가 1~100 이므로 값을 int, long에 담을 수 없기 때문에 String으로 받음

        // 1. 문자열 쪼개기
        for (int i = 0; i < N; i++) {
            answer += Integer.parseInt(S.substring(i, i+1));
        }

        // F. 출력
        System.out.println(answer);
    }
}
