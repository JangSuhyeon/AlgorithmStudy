package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 시험성적_9498 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // 1. 등급 분류
        if (score > 89) System.out.println("A");
        else if (score > 79) System.out.println("B");
        else if (score > 69) System.out.println("C");
        else if (score > 59) System.out.println("D");
        else System.out.println("F");
    }
}
