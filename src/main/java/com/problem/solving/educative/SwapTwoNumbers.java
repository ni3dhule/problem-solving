package com.problem.solving.educative;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwapTwoNumbers {
    //swap two numbers without using a third variable
    private SwapTwoNumbers(){}
    private static Logger logger = LoggerFactory.getLogger(SwapTwoNumbers.class);
    public static void main(String[] args) {
        int firstNumber = 4000;
        int secondNumber = 200;

        logger.info("Numbers Before Swap ");
        logger.info("First Number : {}", firstNumber);
        logger.info("Second Number : {}", secondNumber);

        /*firstNumber = firstNumber * secondNumber;
        secondNumber = firstNumber / secondNumber;
        firstNumber = firstNumber / secondNumber;*/
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        // Operation sequnce First, second , first

        logger.info("--------------------------");

        logger.info("Numbers After Swap ");
        logger.info("First Number : {}", firstNumber);
        logger.info("Second Number : {}", secondNumber);

    }
}
