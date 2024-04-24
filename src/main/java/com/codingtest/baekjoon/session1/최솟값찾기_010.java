package com.codingtest.baekjoon.session1;

import java.io.*;
import java.util.*;

public class 최솟값찾기_010 {

    public void solution() throws NumberFormatException, IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Node> D = new LinkedList<>(); // 슬라이딩 윈도우를 덱으로 구현하면 정렬 효과를 볼 수 있음.
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!D.isEmpty() && D.getLast().value > now) { // 마지막 노드의 값이 새로 들어올 노드의 값보다 더 크면 마지막 노드 삭제
                D.removeLast();
            }

            D.addLast(new Node(now, i));

            if (D.getFirst().index <= i - L) { // 슬라이딩 윈도우의 범위를 넘어가면 첫번째 노드 삭제
                D.removeFirst();
            }

            bw.write(D.getFirst().value + " ");
        }

        bw.flush();
        bw.close();
    }

    // Node 클래스 생성
    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
