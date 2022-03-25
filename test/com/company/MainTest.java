package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertEquals(3 * 4, Main.multiply(3, 4));
    }
    @Test
    void main1() {
        assertEquals(-2 * 4, Main.multiply(-2, 4));
    }
    @Test
    void main2() {
        assertEquals(3 * -5, Main.multiply(3, -5));
    }
    @Test
    void main3() {
        assertEquals(0 * 6, Main.multiply(0, 6));
    }
    @Test
    void main4() {
        assertEquals(5 * 0, Main.multiply(5, 0));
    }
    @Test
    void main5() {
        assertEquals(-2 * 0, Main.multiply(-2, 0));
    }
    @Test
    void main6() {
        assertEquals(0 * -4, Main.multiply(0, -4));
    }
    @Test
    void main7() {
        assertEquals(0 * 0, Main.multiply(0, 0));
    }
}