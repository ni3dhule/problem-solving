package com.problem.solving.leetcode.dailychalange.year2023.october;

import com.problem.solving.leetcode.dailychalange.year2023.october.MaxDotProduct;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaxDotProductTest {
    @Test
    public void maxDotProductPositiveTestCase(){
        int[] num1 = new int[]{2,1,-2,5};
        int[] num2 = new int[]{3,0,-6};
        int expectedResult = 18;
        int actualResult = MaxDotProduct.maxDotProduct(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
