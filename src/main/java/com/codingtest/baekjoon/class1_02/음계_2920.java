package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 음계_2920 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);

        // 1. 판별
        int prev = sc.nextInt();
        int now = sc.nextInt();
        boolean flag = prev - now < 0; // true : ascending, false : descending
        String result = "";
        for (int i = 0; i < 6; i++) {
            prev = now;
            now = sc.nextInt();
            if (flag != prev - now < 0) {
                result = "mixed";
                break;
            }
        }

        // F. 출력
        System.out.println(result.equals("mixed") ? result : flag ? "ascending" : "descending");
    }
}
