package com.codingtest.baekjoon.session3;

import java.io.IOException;
import java.util.Scanner;

public class 소수팰린드롬수중에서최솟값찾기_039 {

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 1. 소수 & 팰린드롬 수 찾기
        if (N == 1) {
            System.out.println(2);
        } else {
            for (int i = N;; i++) {
                if (isPrime(i) && isPalindrome(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private boolean isPalindrome(int i) {
        char[] arr = String.valueOf(i).toCharArray();
        int S = 0;
        int E = arr.length - 1;
        while (S < E) {
            if (arr[S] == arr[E]) {
                S++;
                E--;
            }else{
                return false;
            }
        }
        return true;
    }

    private boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i) ; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
