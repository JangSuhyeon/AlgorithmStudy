package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연결요소의개수구하기_023 {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        // 1. 인접 리스트 초기화
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        // 2. 양방향 에지이므로 양쪽에 에지 더하기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        // 3. DFS 반복문
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                answer++;
                DFS(i);
            }
        }

        // F. 출력
        System.out.println(answer);
    }

    static void DFS(int v) {
        visited[v] = true;
        for (Integer integer : A[v]) {
            if (!visited[integer]) {
                DFS(integer);
            }
        }
    }
}
