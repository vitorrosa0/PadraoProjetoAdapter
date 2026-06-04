package org.example;

public class SistemaBancarioModerno implements ISistemaBancario {

    private double saldo;

    public SistemaBancarioModerno(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
}