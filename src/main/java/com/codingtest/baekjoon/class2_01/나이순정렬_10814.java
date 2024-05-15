package com.codingtest.baekjoon.class2_01;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 나이순정렬_10814 {
    public void solution() throws NumberFormatException, IOException {

        // 0. 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 회원 배열 저장
        user[] users = new user[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            users[i] = new user(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        // 2. 정의한 정렬대로 오름차순 정렬
        Arrays.sort(users);

        // F. 출력
        for (user user : users) {
            System.out.println(user.age + " " + user.name);
        }
    }

    static class user implements Comparable<user> {
        int age;
        String name;

        public user(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(user o) {
            return this.age - o.age;
        }
    }
}
