package com.codingtest.baekjoon.session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 연결요소의개수구하기_023 {

    static int N;
    static boolean[] visited;
    static List<Integer>[] A;

    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        int answer = 0;

        // 1. List 초기화
        for (int i = 1; i <= N ; i++) {
            A[i] = new ArrayList<>();
        }

        // 2. 연결 요소 저장
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }

        // 3. 깊이 우선 탐색
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                answer++;
                DFS(i);
            }
        }

        // F. 출력
        System.out.println(answer);
    }

    static void DFS(int i) {
        visited[i] = true;

        for (int j = 0; j < A[i].size(); j++) {
            if (!visited[A[i].get(j)]) {
                DFS(A[i].get(j));
            }
        }
    }
}
