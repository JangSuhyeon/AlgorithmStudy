package com.codingtest.baekjoon.session1;

import java.util.Scanner;

public class 숫자의합구하기_001 {
    public void solution() {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 숫자의 범위가 크기 때문에 String으로 받는다.
        String str = sc.next();

        char[] cArray = str.toCharArray();

        // 같은 숫자와 문자의 아스키 코드 값 차이는 48이다. (1 -> 1, '1' -> 49)
        for(char c:cArray) sum += c - 48;

        System.out.println(sum);
    }
}
