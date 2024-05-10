package com.codingtest.baekjoon.class1_01;

import java.io.IOException;
import java.util.Scanner;

public class ACM호텔_10250 {
    public void solution() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int ho = N / H;
            int cheng = N % H;

            String hoS = "";
            if (cheng != 0){
                ho += 1;
            }
            hoS = ho < 10 ? "0" + ho : ho + "";
            String chengS = cheng == 0 ? H + "" : cheng + "";
            System.out.println(chengS + hoS);
        }
    }
}
