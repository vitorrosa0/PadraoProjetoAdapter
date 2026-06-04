package org.example;

public class ContaBancaria {

    private ISistemaBancario sistema;
    private SistemaBancarioAdapter adaptador;

    public ContaBancaria(double saldoInicial) {
        sistema = new SistemaBancarioModerno(saldoInicial);
        adaptador = new SistemaBancarioAdapter(sistema);
    }

    public void depositar(double valor) {
        sistema.depositar(valor);
    }

    public void sacar(double valor) {
        sistema.sacar(valor);
    }

    public double getSaldo() {
        return sistema.getSaldo();
    }

    public String getSaldoLegado() {
        return adaptador.getSaldoLegado();
    }
}
