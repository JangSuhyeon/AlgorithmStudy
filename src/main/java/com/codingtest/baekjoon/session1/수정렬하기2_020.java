package com.codingtest.baekjoon.session1;

import java.io.*;
import java.util.StringTokenizer;

public class 수정렬하기2_020 {

    public static int[] A;     // 정렬할 배열
    public static int[] tmp;   // 정렬할 때 잠시 사용할 임시 배열
    public static long result; //

    public void solution() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 정렬할 수 개수

        A = new int[N+1];   // 정렬할 배열 todo 왜 N+1?
        tmp = new int[N+1]; // 정렬할 때 잠시 사용할 임시 배열 todo 왜 N+1?
        for (int i = 1; i <= N; i++) A[i] = Integer.parseInt(br.readLine());

        merget_sort(1, N); // 병합 정렬 함수(시작점, 종료점)

        for (int i = 1; i <= N; i++) bw.write(A[i] + "\n");

        bw.flush();
        bw.close();
    }

    // 병합 정렬 함수
    private static void merget_sort(int s, int e) {

        if (e - s < 1) return; // 시작점과 종료점이 일치할 경우 종료

        int m = s+(e-s)/2; // 중간점

        // 재귀 함수 형태로 구현
        merget_sort(s, m);      // set1
        merget_sort(m+1, e); // set2
        for (int i = s; i <= e; i++) tmp[i] = A[i]; // s~e tmp 배열 저장하기

        int k = s;
        int index1 = s;   // 앞쪽 그룹 시작점
        int index2 = m+1; // 뒷쪽 그룹 시작점

        // 두 그룹을 병합하는 로직
        while (index1 <= m && index2 <= e) {
            if (tmp[index1] > tmp[index2]) { // 양쪽 그룹의 index가 가르키는 값을 비교해
                A[k] = tmp[index2];          // 더 작은 수를 선택해 배열에 저장하고 (오름차순)
                k++;
                index2++;                    // 선택된 데이터의 index 값을 오른쪽으로 한 칸 이동
            } else {
                A[k] = index1;
                k++;
                index1++;
            }
        }

        // 한쪽 그룹이 모두 선택된 후 남아 있는 값 정리하기
        while (index1 <= m) {
            A[k] = tmp[index1];
            k++;
            index1++;
        }

        while (index2 <= e) {
            A[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
