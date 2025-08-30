package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    void deveSomarCorretamente() {
        int a = 2;
        int b = 3;
        int soma = a + b;
        assertTrue(soma == 5, "A soma deveria ser 5");
    }
}
