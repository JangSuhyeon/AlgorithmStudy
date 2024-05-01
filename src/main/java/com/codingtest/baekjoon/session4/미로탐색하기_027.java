package com.codingtest.baekjoon.session4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 미로탐색하기_027 {

    int N;
    int M;
    int[][] A;
    boolean[][] visited;
    int answer;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public void solution() throws IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String now = st.nextToken();
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(now.substring(j, j+1));
            }
        }

        // 2. BFS
        BFS(0,0);

        // 3. 출력
        System.out.println(A[N - 1][M - 1]);
        
    }

    private void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && x < N && y >= 0 && y < M) {
                    if (A[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
