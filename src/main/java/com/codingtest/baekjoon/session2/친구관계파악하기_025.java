package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 친구관계파악하기_025 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int N;
        int M;
        arrive = false;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        for (int i = 0; i < N; i++) {
            DFS(i, 1); // depth 1부터 시작
            if (arrive) {
                break;
            }
        }
        if (arrive) {
            System.out.println("1");
        } else {
            System.out.println("0"); // 5의 깊이가 없다면 0 출력
        }
    }

    public static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for (Integer integer : A[now]) {
            if (!visited[integer]) {
                DFS(integer, depth + 1);
            }
        }
        visited[now] = false;
    }
}
