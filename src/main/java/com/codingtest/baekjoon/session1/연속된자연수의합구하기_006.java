package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 연속된자연수의합구하기_006 {
    public void solution() throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 0, end = 0, sum = 0, cnt = 0;
        while(end <= N){
            if(sum == N) {
                cnt++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            }else {
                end++;
                sum += end;
            }
        }

        System.out.println(cnt);
    }
}
