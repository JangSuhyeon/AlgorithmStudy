package com.codingtest;


import com.codingtest.baekjoon.session3.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CodingtestApplication {

	public static void main(String[] args) throws IOException {
		회의실배정하기_035 solution = new 회의실배정하기_035();
		solution.solution();
	}

}
