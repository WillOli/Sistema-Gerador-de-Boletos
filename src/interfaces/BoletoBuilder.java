package interfaces;

import java.util.Calendar;

/*
 * interface para cria��o do Product
 */
public interface BoletoBuilder {
    void buildSacado(String sacado);
    void buildCedente(String cedente);
    void buildValor(double valor);
    void buildVencimento(Calendar vencimento);
    void buildNossoNro(int nossoNro);
    void buildConvenio(String convenio);
    void buildAgencia(String agencia);
   
    Boleto getBoleto();
}
