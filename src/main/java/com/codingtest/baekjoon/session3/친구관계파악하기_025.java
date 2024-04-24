package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 친구관계파악하기_025 {
    boolean[] visited;
    List<Integer>[] list;
    int M;
    boolean flag = false;
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N];
        visited = new boolean[N];

        // 1. 배열 초기화
        for (int i = 0; i < N; i++) {
            list[i] = new ArrayList<Integer>();
        }

        // 2. 인접 그래프 저장
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            list[S].add(E);
            list[E].add(S);
        }

        // 3. DFS
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                DFS(i, 0);
                if (flag){
                    System.out.println(1);
                    break;
                }
            }
        }

        // F. 출력
        if (!flag) System.out.println(0);
    }

    private void DFS(int i, int depth) {
        if (depth == 4) {
            flag = true;
            return;
        }
        visited[i] = true;
        for (Integer integer : list[i]) {
            if (!visited[integer]) {
                DFS(integer, depth + 1);
            }
        }
        visited[i] = false;
    }
}
