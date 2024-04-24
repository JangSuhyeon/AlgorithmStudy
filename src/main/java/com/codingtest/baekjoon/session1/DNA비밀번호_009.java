package com.codingtest.baekjoon.session1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DNA비밀번호_009 {
    int[] cnt = new int[4];
    int[] min = new int[4];

    public void solution() throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] dna = bf.readLine().toCharArray();

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) min[i] = Integer.parseInt(st.nextToken()); // ACGT

        // 초기 비밀번호 배열만 확인
        for (int i = 0; i < P; i++) add(dna[i]);

        int answer = 0;
        if(check()) answer++;

        for (int i = P; i < S; i++) { // ???
            int j = i - P;
            remove(dna[j]);
            add(dna[i]);
            if(check()) answer++;
        }

        System.out.println(answer);
    }

    public boolean check() {
        boolean flag = false;
        if (min[0] <= cnt[0] &&
                min[1] <= cnt[1] &&
                min[2] <= cnt[2] &&
                min[3] <= cnt[3])
            flag = true;
        return flag;
    }

    public void add(int ck){
        if(ck == 'A') cnt[0]++;
        else if (ck == 'C') cnt[1]++;
        else if (ck == 'G') cnt[2]++;
        else if (ck == 'T') cnt[3]++;
    }

    public void remove(int ck){
        if(ck == 'A') cnt[0]--;
        else if (ck == 'C') cnt[1]--;
        else if (ck == 'G') cnt[2]--;
        else if (ck == 'T') cnt[3]--;
    }
}
