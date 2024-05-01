package com.codingtest.baekjoon.session4;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수를묶어서최댓값만들기_034 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        int zero = 0, one = 0;
        int answer = 0;

        // 1. 우선순위 큐에 데이터 저장
        for (int i = 0; i < N; i++) {
            int now = sc.nextInt();
            if (now == 0) {
                zero++;
            } else if (now == 1) {
                one++;
            } else if (now > 0) {
                plus.add(now);
            } else {
                minus.add(now);
            }
        }

        // 2. 최댓값 만들기(양수)
        while (plus.size() > 1) {
            int a = plus.poll();
            int b = plus.poll();
            answer += a * b;
        }
        if (plus.size() > 0) answer += plus.poll();

        // 3. 최댓값 만들기(음수)
        while (minus.size() > 1) {
            int a = minus.poll();
            int b = minus.poll();
            answer += a * b;
        }
        if (minus.size() > 0){
            if (zero == 0) {
                answer += minus.poll();
            }
        }

        // 4. 1처리
        answer += one;

        // F. 출력
        System.out.println(answer);

    }
}
