package com.codingtest.baekjoon.session1;

import java.util.Scanner;

public class 평균_002 {
    public void solution() {
        int max = 0, sum = 0;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<A.length; i++) A[i] = sc.nextInt();

        for(int a:A) {
            if(max<a) max = a;
            sum += a;
        }

        // 소수점을 저장할 때는 double 또는 float 로 저장
        System.out.println(sum * 100.0 / max / N);
    }
}
