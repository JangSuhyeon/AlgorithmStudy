package com.codingtest.baekjoon.class2_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 직각삼각형_4153 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 반복문을 돌며 문제 풀이
        StringTokenizer st;
        int[] now;

        while (true) {
            st = new StringTokenizer(br.readLine());
            now = new int[]{Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())};

            Arrays.sort(now);

            int left = now[0] * now[0] + now[1] * now[1];

            // 2. 반복문 종료
            if (left == 0) break;

            // F 출력
            else if (left == now[2] * now[2]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
