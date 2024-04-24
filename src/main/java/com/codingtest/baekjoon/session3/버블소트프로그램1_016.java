package com.codingtest.baekjoon.session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 버블소트프로그램1_016 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        mData[] A = new mData[N];
        int max = 0;

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            A[i] = new mData(i, sc.nextInt());
        }

        // 2. 오름차순 정렬
        Arrays.sort(A);
        
        // 3. 가장 큰 인덱스 차이 구하기
        for (int i = 0; i < N; i++) {
            if (A[i].index - i > max) {
                max = A[i].index - i;
            }
        }

        // F. 출력
        System.out.println(max + 1);
    }

    static class mData implements Comparable<mData> {
        int index;
        int value;

        public mData(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(mData o) {
            return this.value - o.value;
        }
    }

}
