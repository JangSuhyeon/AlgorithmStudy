package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class 연결요소의개수구하기_023 {
    List<Integer>[] list;
    boolean[] visited;

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        // 1. List 초기화
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        // 2. 인접 그래프 저장
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            list[S].add(E);
            list[E].add(S);
        }

        // 3. DFS (깊이우선탐색)
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                answer++;
                DFS(i);
            }
        }

        // F. 출력
        System.out.println(answer);
    }

    private void DFS(int i) {
        visited[i] = true;
        for (Integer integer : list[i]) {
            if (!visited[integer]) {
                DFS(integer);
            }
        }
    }
}
