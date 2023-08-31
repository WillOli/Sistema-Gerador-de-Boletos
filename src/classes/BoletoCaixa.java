package classes;

import interfaces.Boleto;

import java.util.Calendar;

public class BoletoCaixa implements Boleto {

    private String sacado;
    private String cedente;
    private double valor;
    private String convenio;
    private String agencia;

    public BoletoCaixa(String sacado, String cedente, double valor, String convenio, String agencia) {
        this.sacado = sacado;
        this.cedente = cedente;
        this.valor = valor;
        this.convenio = convenio;
        this.agencia = agencia;
    }

    @Override
    public String getSacado() {
        return sacado;
    }

    @Override
    public String getCedente() {
        return cedente;
    }

    @Override
    public Calendar getVencimento() {
        return null;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public String getConvenio() {
        return convenio;
    }

    public String getAgencia() {
        return agencia;
    }

    @Override
    public String toString() {
        return "BoletoCaixa [sacado = " + sacado + ", cedente = " + cedente + ", valor = " + valor + ", convenio = " + convenio
                + ", agencia = " + agencia + "]";
    }
}
