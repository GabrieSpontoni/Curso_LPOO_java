# Tarefa - Pizzaria :pizza:

Uma pizza é responsável por informar qual o seu preço. O preço de uma pizza depende da quantidade de ingredientes. Mais especificamente, o preço da pizza será:

- R$ 15,00 se tiver 2 ingredientes ou menos;
- R$ 20,00 se tiver de 3 a 5 ingredientes; e
- R$ 23,00 se tiver mais do que 5 ingredientes.



A quantidade de ingredientes de uma pizza deve ser informada no momento da criação do objeto que a representa.

Além do seu preço, um objeto pizza também deve ser responsável por retornar a sua quantidade de ingredientes. Desta forma, o carrinho de compras poderá verificar se a pizza possui, no mínimo, 2 ingredientes. Se for tentado adicionar uma pizza com menos do que 2 ingredientes em um carrinho, o método do carrinho não deve realizar a inclusão da pizza.

O carrinho de compras deve ser responsável por armazenar o valor total das pizzas que foram adicionadas ao carrinho. Desta forma, o carrinho deve possuir um método para adicionar uma pizza.

Crie então um programa (classe **Principal** com o método main) que faz o seguinte:

* cria 3 pizzas com quantidades de ingredientes diferentes;

- cria um carrinho de compras e adicionar as 3 pizzas a este carrinho; e
- exibe o valor total do carrinho.

Pense em quais classes serão necessárias e quais as responsabilidades de cada classe. Então pense em quais atributos e métodos são necessários em cada classe para implementar as funcionalidades solicitadas. Lembre-se que uma classe pode interagir com outras classes através do envio de mensagens de uma para outra. Uma mensagem da classe A para a classe B corresponde a invocar um método de um objeto do classe B a partir de um método da classe A.

Posteriormente, modifique o programa acima para realizar o seguinte:

- crie uma pizza com menos do que 2 ingredientes;
- tente adicionar a pizza irregular no carrinho; e
- exiba o valor total do carrinho novamente, para verificar que a pizza não foi adicionada.





## Tarefa - Pizzaria com Controle Global :pizza: 

Modifique sua implementação da tarefa anterior para permitir que a classe Pizza controle duas informações globais: número de pizzas criadas e número de ingredientes usados em todas as pizzas criadas.

Modifique seu programa para, no final, exibir estas duas informações.