package org.example;

public class SistemaBancarioLegado {

    private String saldo;

    public SistemaBancarioLegado(String saldo) {
        this.saldo = saldo;
    }

    public String getSaldoString() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public void depositarString(String valor) {
        double saldoAtual = Double.parseDouble(this.saldo);
        double valorDeposito = Double.parseDouble(valor);
        this.saldo = String.valueOf(saldoAtual + valorDeposito);
    }

    public void sacarString(String valor) {
        double saldoAtual = Double.parseDouble(this.saldo);
        double valorSaque = Double.parseDouble(valor);
        if (valorSaque > saldoAtual) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo = String.valueOf(saldoAtual - valorSaque);
    }
}
