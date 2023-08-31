**Sistema Gerador de Boletos**

Este repositório contém código em Java para um Sistema Gerador de Boletos. Boleto é um método de pagamento amplamente utilizado no Brasil, semelhante a um boleto de pagamento ou fatura, frequentemente usado para pagamentos de contas. O sistema utiliza o padrão de projeto builder para criar objetos Boleto para duas instituições financeiras diferentes: Caixa Econômica e Itaú.

**Estrutura do Projeto:**

O projeto está organizado em vários pacotes, cada um contendo classes/interfaces específicas:

1. **`classes`**: Este pacote contém as implementações concretas da interface Boleto e da interface BoletoBuilder para duas instituições financeiras diferentes: Caixa Econômica (`BoletoCaixa` e `BoletoCaixaBuilder`) e Itaú (`ItauBoleto` e `ItauBoletoBuilder`).

2. **`generator`**: Este pacote inclui a classe `GeneratorBoleto`, responsável por gerar objetos Boleto. A classe utiliza um objeto que implementa a interface BoletoBuilder para criar o boleto com informações específicas.

3. **`interfaces`**: Este pacote contém as interfaces `Boleto` e `BoletoBuilder`, que definem os métodos que as classes concretas devem implementar para criar e representar boletos.

**Utilização:**

Para utilizar o sistema, siga os passos abaixo:

1. Instancie um objeto BoletoBuilder específico para a instituição financeira desejada (Caixa Econômica ou Itaú).

2. Preencha os detalhes do boleto usando os métodos `buildSacado`, `buildCedente`, `buildValor`, `buildVencimento` e outros, conforme necessário.

3. Crie um objeto `GeneratorBoleto`, passando o objeto BoletoBuilder criado como argumento para o construtor.

4. Chame o método `geraBoleto` do objeto `GeneratorBoleto` para obter o objeto Boleto completo.

5. Use o objeto Boleto gerado conforme necessário, por exemplo, para exibir informações sobre o boleto.

**Exemplo:**

O arquivo `GeradorBoletoMain` na pasta `Main` demonstra como usar o sistema para gerar boletos para as instituições financeiras Caixa Econômica e Itaú.

Este sistema oferece uma estrutura flexível para criar e gerar boletos com informações personalizadas para diferentes instituições financeiras. O padrão de projeto builder facilita a criação de boletos complexos com diversos detalhes, garantindo a separação clara entre a construção do objeto e sua representação.
