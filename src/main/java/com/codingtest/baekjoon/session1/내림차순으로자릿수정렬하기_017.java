package com.codingtest.baekjoon.session1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 내림차순으로자릿수정렬하기_017 {
    public void solution() throws IOException {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        int[] A = new int[N.length()];
        for (int i = 0; i < A.length; i++) A[i] = Integer.parseInt(N.substring(i, i+1));

        // 선택 정렬
        for (int i = 0; i < A.length; i++) {
            int max = i;
            for (int j = i+1; j < A.length; j++) {
                if (A[max] < A[j]) max = j;
            }

            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        String answer = "";
        for (int i : A) answer += String.valueOf(i);

        System.out.println(answer);
    }
}
