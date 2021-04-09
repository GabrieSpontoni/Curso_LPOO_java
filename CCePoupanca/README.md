# Tarefa - Conta Corrente e Conta Poupança :bank: :moneybag: 

Crie uma hierarquia de classes com a superclasse **Conta** e duas subclasses: **ContaCorrente** e **ContaPoupanca**.

A classe **Conta** deve possuir os seguintes atributos:



- numero (int)
- titular (String)
- saldo (double)

E os seguintes métodos:



- void exibe() - exibe todas as informações da conta.
- void fimDoMes() - este método será sobrescrito nas subclasses.
- boolean saca(double valor) - você pode decidir se implementa este método nesta classe ou não.
- void deposita(double valor) - você pode decidir se implementa este método nesta classe ou não.

A classe **ContaCorrente** deve possuir os seguintes atributos adicionais:



- limite (double) - valor permitido para saques além do saldo.
- taxaJuros (double) - representa a taxa cobrada no final do mês caso o saldo da conta esteja negativo.

Na ContaCorrente, o método fimDoMes() deve atualizar o saldo da conta dependendo da taxa de juros, caso o saldo esteja negativo.



A classe **ContaPoupanca** deve possuir os seguintes atributos adicionais:



- taxaRendimento (double) - representa a taxa paga pelo banco ao final do mês sobre o saldo.



Na ContaPoupanca, o método fimDoMes() deve atualizar o saldo de acordo com a taxa de rendimento, caso o saldo seja maior que zero.

Na classe Conta, você deve decidir quais métodos serão abstratos. Nas duas subclasses, você deve pensar quais métodos da superclasse devem ser sobrescritos.

Nas três classes, além dos métodos acima, você deve pensar quais construtores e getters/setters que fazem sentido, e então implementá-los.

Escreva um programa para testar suas classes e os principais métodos.



# Tarefa - Banco com HashMap :bank: :moneybag: 

Nesta tarefa, você deve extender a tarefa anterior (contas corrente e poupança) com uma classe **Banco** que irá gerenciar as contas de um banco. Esta classe deve implementar os seguintes métodos:



- boolean insere(Conta c) - Insere uma nova conta no banco. Deve-se verificar se já não existe uma conta com o mesmo número de conta dada (c.getNumero()). Caso já exista, o método não deve inserir a conta dada e deve retornar **false**. Caso contrário, o método deve inserir e retornar **true**.
- Conta getConta(int numero) - Retorna a conta do banco com o número dado.
- void exibe() - Exibe os dados de todas as contas do banco.
- void fimDoMes() - Invoca o método fimDoMes() para todas as contas do banco.

Utilize um **HashMap<Integer, Conta>** para armazenar cada conta associada ao seu número. Desta maneira, será eficiente acessar uma conta através do seu número, como é necessário para implementar alguns método acima.

Escreva um programa para testar a classe Banco. Você pode reaproveitar o programa da tarefa anterior. Lembre-se de testar o caso de inserir uma conta com um número já existente.