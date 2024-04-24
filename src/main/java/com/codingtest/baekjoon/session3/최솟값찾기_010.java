package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 최솟값찾기_010 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        Deque<Node> deque = new LinkedList<>();

        // 1. 배열 데이터 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 슬라이딩 윈도우
        for (int i = 0; i < N; i++) {

            // 2-1. 기존에 덱에 있은 가장 큰 수가 새로 들어올 수보다 크면 삭제
            while (!deque.isEmpty() && deque.getLast().value > A[i]) {
                deque.removeLast();
            }

            // 2-2. 새로운 수 추가
            deque.add(new Node(i, A[i]));

            // 2-3. 윈도우 범위를 넘어가는 Node 삭제
            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }

            // F. 출력
            System.out.print(deque.getFirst().value + " ");
        }

    }

    static class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
