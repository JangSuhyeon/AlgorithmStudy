package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 최솟값을만드는괄호배치찾기_036 {

    static int answer = 0;

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        String example = sc.next();
        String[] str = example.split("-");

        // 1. 더하기 연산부터 실행
        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }

        // F. 출력
        System.out.println(answer);
    }

    private int mySum(String s) {
        int sum = 0;
        String temp[] = s.split("[+]");

        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }

        return sum;
    }
}
