package com.codingtest.baekjoon.session1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기_003 {
    public void solution() throws IOException {
        // BufferedReader : 표준 입력 스트림을 읽기 위함, InputStreamReader : 바이트 스트림->문자스트림 변환을 위함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백과 같은 구분자를 기준으로 토큰을 분리해줌
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        int[] A = new int[suNo+1];
        st = new StringTokenizer(br.readLine()); // 새 문자열을 입력받기 위한 초기화
        for(int i=1; i<A.length; i++) {
            A[i] = A[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < quizNo; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(A[end] - A[start-1]);
        }
    }
}
