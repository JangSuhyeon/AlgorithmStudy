package com.codingtest.baekjoon.class1_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class 나머지_3052 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);

        // 1. 반복문 돌며 나머지 카운트
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int now = sc.nextInt() % 42;
            map.put(now, map.getOrDefault(now, 0) + 1);
        }

        // 2. F 출력
        System.out.println(map.size());
    }
}
