# Tarefa - Quebra de Encapsulamento :bank: :moneybag: 

**<u>As entregas desta tarefa estão sublinhadas</u>.** São 3 entregas que são variações do mesmo código. Você pode criar três projetos separados (todos modificações do mesmo código base) e entregar um arquivo compactado contendo todos eles.

Considere a **Tarefa - Banco com HashMap** que vimos anteriormente, na qual criamos algumas classes que representam contas de um banco e então criamos uma classe **Banco** para gerenciar estas contas. A classe **Banco** provê o acesso a uma conta específica através do método:

- Conta getConta(int numero)

Este método recebe o número da conta e retorna a conta com aquele número.

Imagine agora que, fora da classe **Banco**, precisamos acessar todas as contas do banco. Por exemplo, imagine que precisamos criar um método **double calculaSaldoTotal()** que retorna a soma dos saldos de todas as contas do banco, mas este método não está na classe **Banco** e, portanto, não tem acesso direto ao HashMap que armazena as contas. Como não também não temos os números de todas as contas (fora da classe **Banco**), não temos uma maneira de percorrer todas as contas.

Pense por um momento como resolver este problema.

Uma solução seria incluir o método abaixo na classe **Banco**:

Collection <<g>Conta> getContas() {

 **return** contas.values();

}

Este método retorna uma **Collection** com as contas do banco. Sugiro você pesquisar o que é uma **Collection** mas, de forma bem simples, ela armazena a lista de contas que estão no **HashMap** contas da classe **Banco**. Desta forma, poderíamos implementar o método de cálculo do total de saldo assim:

**double** calculaSaldoTotal() {

 **double** total = 0;

 **for** (Conta c : banco.getContas())

  total += c.getSaldo();

 **return** total;

}

Considerando as discussões sobre quebra de encapsulamento apresentadas nas aulas, você consegue identificar um problema nesta solução? Pense sobre isto por um momento antes de continuar lendo.

Se ainda não conseguiu encontrar o problema, imagine então invocar o método **banco.getContas().clear()** que remove todas as contas da lista. **<u>Escreva um programa para testar isto</u>.** Consegue ver o problema agora?

Como prover a funcionalidade desejada (acesso a todas as contas do banco) sem quebrar o encapsulamento da classe **Banco**? Existem diferentes maneiras de resolver este problema. Procure na internet por soluções antes de continuar lendo.

Espero que você tenha conseguido resolver o problema de alguma maneira. Uma das maneiras de se resolver isto é retornar uma cópia da lista de contas, ao invés de retornar a lista original (aquela da **HashMap**). Podemos fazer isto de diferentes formas. Uma delas é retornar **new ArrayList<>(contas)** no método getContas(). Desta maneira, estamos retornando uma cópia da lista original. O usuário do método poderá remover elementos desta lista, mas isto não afetará o **HashMap** do **Banco**. **Altere sua implementação anterior para usar esta ideia e teste se ela funciona** (evita o problema do usuário do código alterar o HashMap).

Outra maneira é utilizar o método estático **[Collection<> unmodifiableCollection(Collection<> c)](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#unmodifiableCollection-java.util.Collection-)** da classe Collections. Leia a documentação deste método e implemente uma solução para o nosso problema utilizando ele. A classe **Collections** (observe que tem um **s** no final do nome) provê vários métodos auxiliares para manipular objetos **Collection** (sem **s** no final). **<u>Altere sua implementação anterior usando esta ideia.</u>**