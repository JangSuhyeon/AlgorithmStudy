package com.codingtest.baekjoon.class1_01;

import java.io.IOException;
import java.util.Scanner;

public class 문자와문자열_27866 {
    public void solution() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        for (int i = 0; i < 5; i++) {
            int now = sc.nextInt();
            result += now * now;
        }

        System.out.println(result % 10);
    }
}
