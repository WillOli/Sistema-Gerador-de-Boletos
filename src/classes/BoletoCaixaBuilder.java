package classes;

import interfaces.Boleto;
import interfaces.BoletoBuilder;

import java.util.Calendar;

public class BoletoCaixaBuilder implements BoletoBuilder {

    private String sacado;
    private String cedente;
    private double valor;
    private String convenio;
    private String agencia;

    @Override
    public void buildSacado(String sacado) {
        this.sacado = sacado;
    }

    @Override
    public void buildCedente(String cedente) {
        this.cedente = cedente;
    }

    @Override
    public void buildValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void buildVencimento(Calendar vencimento) {

    }

    @Override
    public void buildNossoNro(int nossoNro) {

    }

    public void buildConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void buildAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public Boleto getBoleto() {
        return new BoletoCaixa(sacado, cedente, valor, convenio, agencia);
    }
}
