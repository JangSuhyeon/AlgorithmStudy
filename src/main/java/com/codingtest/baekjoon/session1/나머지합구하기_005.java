package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 나머지합구하기_005 {
    public void solution() throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] X = new long[N];
        X[0] = sc.nextInt(); // 나머지가 0인 수를 구하는 문제이기 때문에 첫번째 인덱스를 0으로 둘 수 없다.
        for (int i = 1; i < N; i++) X[i] = X[i-1] + sc.nextInt();

        long cnt = 0;
        long[] Y = new long[M];
        for (int i = 0; i < N; i++) {
            int s = (int)(X[i] % M); // 구한 나머지로 바로 계산이 가능하기 때문에 굳이 저장할 필요 없음.
            if(s == 0) cnt++;
            Y[s]++; // x와 y의 나머지가 같으면 (y-x)의 나머지는 0이다.
        }

        for (int i = 0; i < M; i++) {
            if(Y[i]>1){ // 최소 2개의 나머지가 같아야 위에 공식에 부합하기 때문에
                cnt += Y[i] * (Y[i]-1) / 2; // Y[i]개 중 2개를 고르는 경우의 수 구하는 수식
            }
        }

        System.out.println(cnt);
    }
}
