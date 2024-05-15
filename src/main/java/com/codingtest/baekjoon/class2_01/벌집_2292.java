package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 벌집_2292 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range += count * 6;
                count++;
            }

            System.out.println(count);
        }
    }
}
