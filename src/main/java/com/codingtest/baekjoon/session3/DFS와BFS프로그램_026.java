package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class DFS와BFS프로그램_026 {
    boolean[] visited;
    List<Integer>[] list;
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        // 1. 배열 초기화
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
        }

        // 2. 인접 그래프 저장
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        // 3. 인접 그래프 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }

        // 4. DFS
        DFS(S);
        System.out.println();

        // 5. BFS
        visited = new boolean[N + 1];
        BFS(S);
    }

    private void BFS(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (Integer integer : list[now]) {
                if (!visited[integer]) {
                    queue.add(integer);
                    visited[integer] = true;
                }
            }
        }
    }

    private void DFS(int i) {
        System.out.print(i + " ");
        visited[i] = true;
        for (Integer integer : list[i]) {
            if (!visited[integer]) {
                DFS(integer);
            }
        }
    }
}
