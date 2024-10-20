package com.problem.solving.leetcode.dailychalange.year2024.october;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class ParseBooleanExpressionTest {
    @Test
    public void shouldParseBooleanExpressionSuccess(){
        assertFalse(ParseBooleanExpression.parseBoolExpr("&(|(f))"));
    }
}
