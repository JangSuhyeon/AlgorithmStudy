package com.codingtest.baekjoon.class1_02;

import java.io.IOException;
import java.util.Scanner;

public class 알파벳찾기_10809 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 초기화
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // 1. 알파벳 카운트
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) alphabet[i] = word.indexOf(i + 'a');

        // F. 출력
        for (int i : alphabet) System.out.print(i + " ");
    }
}
