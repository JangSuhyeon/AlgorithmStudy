package com.codingtest.baekjoon.session1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class 친구관계파악하기_025 {

    static boolean visitied[];
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public void solution() throws IOException {
        int N; // 노드 개수
        int M; // 에지 개수
        arrive = false; // 도착 확인 변수

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        A = new ArrayList[N];
        for (int i = 0; i < N; i++) A[i] = new ArrayList<Integer>();

        // 인접 리스트에 그래프 데이터 저장하기
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }

        // 각 노드마다 DFS 실행
        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (arrive) break;
        }

        if (arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }

    public static void DFS(int now, int depth) {
        if (depth == 5 && arrive) {
            arrive = true;
            return;
        }

        visitied[now] = true;

        for (int i : A[now]) {
            if(!visitied[i]) DFS(i, depth + 1);
        }

        visitied[now] = false;
    }
}
