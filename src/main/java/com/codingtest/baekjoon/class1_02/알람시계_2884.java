package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 알람시계_2884 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        // 1. 45분 빼기
        M -= 45;

        // 2. 45분을 뺐을 때 분이 마이너스 이면 분기 처리
        if (M < 0) {
            H--;
            if (H < 0) H += 24;
            M += 60;
        }

        // F. 출력
        System.out.println(H + " " + M);
    }
}
