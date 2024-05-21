package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class AplusB4_10951 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스 반복
        while (sc.hasNextInt()) System.out.println(sc.nextInt() + sc.nextInt());

        // 2. 출력 완료
        sc.close();
    }
}
