package com.codingtest.baekjoon.class2_01;

import java.io.IOException;
import java.util.*;

public class 통계학_2108 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;

        // 1. 배열 초기화
        int[] A = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        // 2. 산술평균
        System.out.println(Math.round(sum / N));

        // 3. 정렬
        Arrays.sort(A);

        // 4. 중앙값
        System.out.println(A[(N - 1) / 2]);

        // 5. 최빈값
        Integer max = A[0];
        List<Integer> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            if (map.get(i) > map.get(max)) max = i;
        }
        for (Integer i : map.keySet()) {
            if (map.get(max) == map.get(i)) {
                list.add(i);
            }
        }
        if (list.size() > 1) {
            Collections.sort(list);
            System.out.println(list.get(1));
        }else{
            System.out.println(max);
        }

        // 6. 범위
        System.out.println(A[N - 1] - A[0]);
    }
}
