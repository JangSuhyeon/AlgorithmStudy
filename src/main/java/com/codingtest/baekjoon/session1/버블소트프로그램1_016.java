package com.codingtest.baekjoon.session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 버블소트프로그램1_016 {

    public void solution() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        mData[] A = new mData[N];
        for (int i = 0; i < N; i++) A[i] = new mData(Integer.parseInt(br.readLine()), i);
        Arrays.sort(A);

        int max = 0;
        for (int i = 0; i < N; i++) {
            if(max < A[i].index - i) max = A[i].index - i; // 처음 인덱스와 정렬 후 인덱스의 차이를 구하기 위함

        }

        System.out.println(max + 1);
    }
}

class mData implements Comparable<mData> {
    int value;
    int index; // 처음의 인덱스 저장을 위함

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value; // value 기준 오름차순으로 정렬하기
    }
}
