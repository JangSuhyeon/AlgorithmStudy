package com.codingtest.baekjoon.session2;

import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최솟값찾기_010 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        String answer = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        Deque<Node> deque = new LinkedList<>();

        // 1. N개의 수 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int in = Integer.parseInt(st.nextToken());

            // 새로 들어온 수가 더 작으면 덱에서 마지막 노드 삭제
            while (!deque.isEmpty() && in < deque.getLast().getValue()) {
                deque.removeLast();
            }
            deque.addLast(new Node(i, in));

            // 인덱스 범위를 벗어나는지 확인
            while (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }

            answer += deque.getFirst().value + " ";
        }

        // F. 출력
        System.out.println(answer);
        br.close();
    }

    @Data
    public class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

}
