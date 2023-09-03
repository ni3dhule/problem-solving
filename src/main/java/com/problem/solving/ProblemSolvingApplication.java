package com.problem.solving;

import com.problem.solving.hackerrank.SocksPairMerchant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProblemSolvingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemSolvingApplication.class, args);
		System.out.println("===========================================================");
		Integer[] input = new Integer[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
		//Integer[] input = new Integer[]{1, 2, 1, 2, 1, 3, 2};
		input = new Integer[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		List<Integer> socks = Arrays.asList(input);
		int totalPairs = SocksPairMerchant.socksPairMerchant(input.length, socks);
		System.out.println("Pairs : "+totalPairs);
		System.out.println("===========================================================");
	}

}
