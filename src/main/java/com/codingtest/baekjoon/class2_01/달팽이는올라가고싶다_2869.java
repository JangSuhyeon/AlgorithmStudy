package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 달팽이는올라가고싶다_2869 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 1. 나머지를 활용하여 풀기
        int min = (V - B) / (A - B);
        int remain = (V - B) % (A - B);

        // F. 출력
        System.out.println(remain > 0 ? ++min : min);

    }
}
