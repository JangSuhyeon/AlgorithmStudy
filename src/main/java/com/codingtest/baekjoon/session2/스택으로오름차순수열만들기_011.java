package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택으로오름차순수열만들기_011 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        StringBuilder answer = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> S = new Stack<>();
        int idx = 0;
        boolean result = false;

        // 1. 스택 계산
        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();

            if (S.isEmpty()) {
                S.push(++idx); // star 증가를 시킨 뒤 push를 한다.
                answer.append("+\n");
            }

            if (S.peek() > in) {  // star for문 밖에서 size()로 조건을 안 건 이유는 모든 반복문을 돌지 않기 위함
                System.out.println("NO");
                result = true;
                break;
            }

            while (S.peek() < in){
                S.push(++idx);
                answer.append("+\n");
            }

            if (S.peek() == in) {
                S.pop();
                answer.append("-\n");
            }
        }

        // F. 출력
        if(!result)System.out.println(answer);
    }
}
