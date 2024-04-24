package com.codingtest.baekjoon.session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DNA비밀번호_009 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] A = st.nextToken().toCharArray();

        st = new StringTokenizer(br.readLine());
        HashMap<Character, Integer> stand = new HashMap<>();
        HashMap<Character, Integer> cnt = new HashMap<>();

        int left = 0, right = left+P-1;

        // 1. 필수 문자 갯수 저장
        stand.put('A', Integer.valueOf(st.nextToken()));
        stand.put('C', Integer.valueOf(st.nextToken()));
        stand.put('G', Integer.valueOf(st.nextToken()));
        stand.put('T', Integer.valueOf(st.nextToken()));

        // 2. 부분 문자열 문자 갯수 hashmap 초기화
        cnt.put('A', 0);
        cnt.put('C', 0);
        cnt.put('G', 0);
        cnt.put('T', 0);

        // 3. 첫번째 부분 문자열 문자 갯수 구하기
        for (int i = 0; i < P; i++) {
            cnt.put(A[i], cnt.get(A[i])+1);
        }

        // 4. 슬라이딩 윈도우 탐색 시작
        while (right < S) {
            if (stand.get('A') <= cnt.get('A') &&
                    stand.get('C') <= cnt.get('C') &&
                    stand.get('G') <= cnt.get('G') &&
                    stand.get('T') <= cnt.get('T')) { // STAR 필수 문자 갯수 이상이어야 함



                answer++;
            }

            cnt.put(A[left], cnt.get(A[left])-1);
            left++;
            right++;
            if (right < S) cnt.put(A[right], cnt.get(A[right])+1);
        }

        // F. 출력
        System.out.println(answer);
        br.close();
    }
}
