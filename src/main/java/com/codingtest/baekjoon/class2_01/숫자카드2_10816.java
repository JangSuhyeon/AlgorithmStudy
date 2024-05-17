package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class 숫자카드2_10816 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 1. for문을 돌며 카드 개수 저장
        HashMap<Long, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Long now = Long.parseLong(st.nextToken());
            map.put(now, map.getOrDefault(now, 0) + 1);
        }

        // 2. for문을 돌며 해당 카드 수 출력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            bw.write(map.getOrDefault(Long.parseLong(st.nextToken()), 0) + " ");
        }

        // F. 출력
        bw.flush();
        bw.close();
    }
}
