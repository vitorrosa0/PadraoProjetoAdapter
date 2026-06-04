package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveRetornarSaldoModerno() {
        ContaBancaria conta = new ContaBancaria(1000.0);
        conta.depositar(500.0);

        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void deveRetornarSaldoLegado() {
        ContaBancaria conta = new ContaBancaria(1000.0);
        conta.depositar(500.0);

        assertEquals("1500.0", conta.getSaldoLegado());
    }

    @Test
    void deveRetornarSaldoAposSaque() {
        ContaBancaria conta = new ContaBancaria(1000.0);
        conta.sacar(200.0);

        assertEquals(800.0, conta.getSaldo());
        assertEquals("800.0", conta.getSaldoLegado());
    }

    @Test
    void deveLancarExcecaoParaSaqueComSaldoInsuficiente() {
        ContaBancaria conta = new ContaBancaria(100.0);

        assertThrows(IllegalArgumentException.class, () -> conta.sacar(500.0));
    }

}