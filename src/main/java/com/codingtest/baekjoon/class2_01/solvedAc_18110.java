package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.*;

public class solvedAc_18110 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 난이도 배열 저장
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.valueOf(br.readLine()));
        }

        // 2. 절삭을 위한 오름차순 정렬
        Collections.sort(A);

        // 3. 15% 수 구하기
        int remove = (int) Math.round(N * 0.15);

        // 4. 유효 점수 합 구하기
        double sum = 0;
        for (int i = remove; i < (N - remove); i++) {
            sum += A.get(i);
        }

        // 5. 절삭 평균 구하기
        double avg = sum / (N - remove * 2);

        // F. 출력
        System.out.println(Math.round(avg));
    }
}
