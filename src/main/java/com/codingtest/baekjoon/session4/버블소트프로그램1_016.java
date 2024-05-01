package com.codingtest.baekjoon.session4;

import java.io.IOException;
import java.util.*;

public class 버블소트프로그램1_016 {
    public void solution() throws IOException {

        // 0. 변수 선언
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        mData[] list = new mData[N];
        int max = 0;

        // 1. 배열 데이터 저장
        for (int i = 0; i < N; i++) {
            list[i] = (new mData(i, sc.nextInt()));
        }

        // 2. 오름차순 정렬
        Arrays.sort(list);

        // 3. 초기 인덱스와 가장 큰 차이값 구하기
        for (int i = 0; i < N; i++) {
            if (max < (list[i].index - i)) {
                max = list[i].index - i;
            }
        }

        // F. 출력
        System.out.println(max + 1);
    }

    // 2. 초기 인덱스 저장 및 값 기준의 정렬을 위한 클래스 선언
    class mData implements Comparable<mData> {
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
