package com.problem.solving;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProblemSolvingApplicationTests {

	@Test
	public void contextLoads() {
        int result = 10;
        Assertions.assertEquals(10,result);
    }
}
