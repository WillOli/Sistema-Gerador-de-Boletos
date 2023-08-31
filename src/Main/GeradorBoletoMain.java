package Main;

import classes.BoletoCaixaBuilder;
import classes.ItauBoletoBuilder;
import generator.GeneratorBoleto;
import interfaces.Boleto;
import interfaces.BoletoBuilder;

public class GeradorBoletoMain {
    public static void main(String[] args) {
        BoletoBuilder itauBoletoBuilder = new ItauBoletoBuilder();
        GeneratorBoleto itauGeneratorBoleto = new GeneratorBoleto(itauBoletoBuilder);
        Boleto itauBoleto = itauGeneratorBoleto.geraBoleto();
        System.out.println("Itau Boleto: " + itauBoleto);

        BoletoBuilder caixaBoletoBuilder = new BoletoCaixaBuilder();
        caixaBoletoBuilder.buildSacado("William Oliveira");
        caixaBoletoBuilder.buildCedente("Caixa Econômica");
        caixaBoletoBuilder.buildValor(1500.00);


        GeneratorBoleto caixaGeneratorBoleto = new GeneratorBoleto(caixaBoletoBuilder);
        Boleto caixaBoleto = caixaGeneratorBoleto.geraBoleto();
        System.out.println("Caixa Boleto: " + caixaBoleto);
    }
}
