package com.example.crm;

import leetcode.array.LeetCode1;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCodeTest {
    LeetCode1 leetCode1;

    @BeforeEach
    void setUp() {
        leetCode1 = new LeetCode1();
    }

    @Test
    public void maxLengthBetweenEqualCharacters() {
        int maxLength = leetCode1.maxLengthBetweenEqualCharacters("aba");
        assertEquals(maxLength, 1);
    }
}
