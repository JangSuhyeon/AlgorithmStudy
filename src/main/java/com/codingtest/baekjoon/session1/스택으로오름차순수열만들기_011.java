package com.codingtest.baekjoon.session1;

import java.io.*;
import java.util.*;

public class 스택으로오름차순수열만들기_011 {

    public void solution() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.println("+");

        for (int i = 1; i <= n; i++) {
            int p = s.peek();
            int in = sc.nextInt();

            while (p < in) {
                s.push(p++);
                p = s.peek();
                System.out.println("+");
            }

            if (i == in) {
                s.pop();
                System.out.println("-");
            } else{
                System.out.println("NO");
            }
        }

    }
}
