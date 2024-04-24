package com.codingtest.baekjoon.session1;

import java.io.*;
import java.util.*;

public class 카드게임_013 {

    public void solution() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= N; i++) Q.add(i);

        while (Q.size() > 1) {
            Q.poll(); // 선출
            Q.add(Q.poll());
        }

        System.out.println(Q.poll());
    }
}
