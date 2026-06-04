package org.example;

public class SistemaBancarioAdapter extends SistemaBancarioLegado {

    private ISistemaBancario sistemaModerno;

    public SistemaBancarioAdapter(ISistemaBancario sistemaModerno) {
        super(String.valueOf(sistemaModerno.getSaldo()));
        this.sistemaModerno = sistemaModerno;
    }

    public String getSaldoLegado() {
        return String.valueOf(sistemaModerno.getSaldo());
    }

    public void salvarDeposito(double valor) {
        depositarString(String.valueOf(valor));
    }

    public void salvarSaque(double valor) {
        sacarString(String.valueOf(valor));
    }
}
