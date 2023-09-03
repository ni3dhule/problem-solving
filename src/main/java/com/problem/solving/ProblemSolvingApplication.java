package com.problem.solving;

import com.problem.solving.hackerrank.SocksPairMerchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProblemSolvingApplication {

	private static Logger logger = LoggerFactory.getLogger(ProblemSolvingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProblemSolvingApplication.class, args);
		logger.info("===========================================================");
		Integer[] input = new Integer[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		List<Integer> socks = Arrays.asList(input);
		int totalPairs = SocksPairMerchant.socksPairMerchant(input.length, socks);
		logger.info("Pairs : {}", totalPairs);
		logger.info("===========================================================");
	}

}
