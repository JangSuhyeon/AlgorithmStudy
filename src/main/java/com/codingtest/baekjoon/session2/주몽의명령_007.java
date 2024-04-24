package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의명령_007 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] met = new int[N];
        int left = 0, right = N-1;

        // 1. 재료들 저장
        for (int i = 0; i < N; i++) {
            met[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 오름차순 정렬
        Arrays.sort(met);

        // 3. 투포인터 정렬 (M이 1이면 1부터 시작하는 두 재료의 합으로 만들 수 없다.)
        if (M > 1) {
            while (left < right) { //  왼쪽 커서와 오른쪽 커서가 만나면 지나치면 안되므로
                int sum = met[left] + met[right];
                if (sum == M) {
                    answer++;
                    left++;
                    right--;
                } else if (sum < M) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // F. 출력
        System.out.println(answer);
        br.close(); // star 메모리 누수 방지, 데이터 무결성 보장, 명시적 의미
    }
}
