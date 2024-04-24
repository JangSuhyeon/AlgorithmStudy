package com.codingtest.baekjoon.session3;

import java.io.IOException;
import java.util.*;

public class 수를묶어서최댓값만들기_034 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder()); // 양수는 내림차순
        PriorityQueue<Integer> minus = new PriorityQueue<>(); // 음수는 오름차순
        int one = 0, zero = 0, sum = 0;

        // 1. 4개의 그룹으로 분리해 저장하기
        for (int i = 0; i < N; i++) {
            int data = sc.nextInt();
            if (data > 1) {
                plus.add(data);
            } else if (data == 1) {
                one++;
            } else if (data == 0) {
                zero++;
            } else {
                minus.add(data);
            }
        }

        // 2. 그리디(양수)
        while (plus.size() > 1) { // 짝이 맞으면 곱하여 더하고
            int first = plus.poll();
            int second = plus.poll();
            sum += first * second;
        }
        while (!plus.isEmpty()) { // 짝이 안맞아 남은 수는 그냥 더하고
            sum += plus.poll();
        }

        // 3. 그리디(음수)
        while (minus.size() > 1) {
            int first = minus.poll();
            int second = minus.poll();
            sum += first * second;
        }
        while (!minus.isEmpty()) { // 어차피 무조건 1개만 남는다.
            int now = minus.poll();
            if (zero == 0) {// 1개만 남아서 0이랑 곱할 수 없으면
                sum += now; // 더한다.
            }
        }

        // 4. 1 처리
        sum += one; // 1은 곱해도 의미가 없기 때문에 모았다가 더해준다. (최댓값을 구하기 위하여)

        // F. 출력
        System.out.println(sum);
    }
}
