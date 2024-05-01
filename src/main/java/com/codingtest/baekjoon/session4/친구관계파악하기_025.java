package com.codingtest.baekjoon.session4;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class 친구관계파악하기_025 {

    static List<Integer>[] A;
    static boolean[] visited;
    static int answer;

    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new List[N];
        visited = new boolean[N];
        answer = 0;

        // 1. List 초기화
        for (int i = 0; i < N; i++) {
            A[i] = new LinkedList<Integer>();
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
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                DFS(i, 0);
            }
        }

        // 4. 출력
        System.out.println(answer);
    }

    private void DFS(int i, int cnt) {
        System.out.println("i : " + i + " visited[i] : " + visited[i] + " cnt : " + cnt);
        if (cnt == 4) answer = 1;
        visited[i] = true;
        for (int j = 0; j < A[i].size(); j++) {
            if (!visited[A[i].get(j)]) {
                DFS(A[i].get(j), j + 1);
            }
        }
        visited[i] = false;
    }
}
