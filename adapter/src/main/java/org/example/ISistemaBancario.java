package org.example;

public interface ISistemaBancario {
    double getSaldo();
    void depositar(double valor);
    void sacar(double valor);
}