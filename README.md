# JB Burger

## Sobre o projeto

Este é o projeto final da disciplina de Programação Orientada a Objetos em Java do curso de Ciência da Computação da UNIFOR. A JB Burger consiste no sistema de gerenciamento de uma hamburgueria.

O problema proposto foi o seguinte: você está participando do processo seletivo para novos estagiários da Google e, na próxima fase, a empresa irá avaliar o nível de implementação de seus candidatos. Para isso, ela gostaria que cada um dos candidatos escolhesse uma temática de programa que deseja desenvolver e, para essa temática, im­plemente um sistema com os seguintes requisitos:

- No mínimo 8 classes (incluindo abstratas e principal);
- No mínimo duas interfaces;
- Utilização de herança;
- Utilização de polimorfismo;
- Utilização de Arquivos para entrada e saída de dados;
- Utilização de composição e agregação;
- Utilização de encapsulamento;
- Tratamento de Exceptions;
- Uso de ArrayList ( um método não visto nas aulas).

O objetivo do projeto é desenvolver um sistema que permita ao usuário cadastrar clientes, cardápios, itens de pedido e comandas, além de consultar e alterar essas informações. O sistema também deve gerar relatórios sobre o faturamento e o estoque da hamburgueria.

## Diagrama de classes

O diagrama de classes do projeto é o seguinte:

!Diagrama de classes

## Como executar

Para executar o projeto, siga os seguintes passos:

- Baixe o código-fonte do projeto no GitHub, usando o comando `git clone https://github.com/seu-usuario/jb-burger.git`.
- Abra o software Eclipse e importe o projeto como um projeto Java existente.
- Selecione a classe Principal.java e clique no botão Run para executar o projeto.
- Siga as instruções que aparecem no console para interagir com o sistema.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

- **Cadastrar cliente**: permite ao usuário cadastrar um novo cliente, informando o seu nome, o seu CPF e o seu telefone. O sistema verifica se o CPF é válido e se já existe um cliente com o mesmo CPF. Se o cadastro for bem-sucedido, o sistema gera um código único para o cliente e o armazena em um arquivo chamado clientes.txt.
  - Exemplo de entrada: João, 12345678910, (85) 99999-9999
  - Exemplo de saída: Cliente cadastrado com sucesso. Código: 1
- **Cadastrar cardápio**: permite ao usuário cadastrar um novo cardápio, informando o seu tipo (bebida ou prato), o seu nome, o seu preço e a sua quantidade em estoque. O sistema verifica se o nome do cardápio é válido e se já existe um cardápio com o mesmo nome. Se o cadastro for bem-sucedido, o sistema gera um código único para o cardápio e o armazena em um arquivo chamado cardapios.txt.
  - Exemplo de entrada: bebida, Coca-Cola, 5.00, 100
  - Exemplo de saída: Cardápio cadastrado com sucesso. Código: 1
- **Cadastrar item de pedido**: permite ao usuário cadastrar um novo item de pedido, informando o código do cardápio, a quantidade e o código da comanda. O sistema verifica se o código do cardápio é válido, se a quantidade é positiva e se o código da comanda é válido. Se o cadastro for bem-sucedido, o sistema calcula o valor total do item, atualiza o estoque do cardápio e o armazena em um arquivo chamado itens.txt.
  - Exemplo de entrada: 1, 2, 1
  - Exemplo de saída: Item de pedido cadastrado com sucesso. Valor total: 10.00
- **Cadastrar comanda**: permite ao usuário cadastrar uma nova comanda, informando o código do cliente. O sistema verifica se o código do cliente é válido e se já existe uma comanda aberta para o mesmo cliente. Se o cadastro for bem-sucedido, o sistema gera um código único para a comanda e o armazena em um arquivo chamado comandas.txt.
  - Exemplo de entrada: 1
  - Exemplo de saída: Comanda cadastrada com sucesso. Código: 1
- **Consultar cliente**: permite ao usuário consultar as informações de um cliente, informando o seu código. O sistema verifica se o código é válido e busca o cliente no arquivo clientes.txt. Se o cliente for encontrado, o sistema mostra o seu nome, o seu CPF e o seu telefone.
  - Exemplo de entrada: 1
  - Exemplo de saída: Nome: João, CPF: 12345678910, Telefone: (85) 99999-9999
- **Consultar cardápio**: permite ao usuário consultar as informações de um cardápio, informando o seu código. O sistema verifica se o código é válido e busca o cardápio no arquivo cardapios.txt. Se o cardápio for encontrado, o sistema mostra o seu tipo, o seu nome, o seu preço e a sua quantidade em estoque.
  - Exemplo de entrada: 1
  - Exemplo de saída: Tipo: bebida, Nome: Coca-Cola, Preço: 5.00, Quantidade: 100
- **Consultar item de pedido**: permite ao usuário consultar as informações de um item de pedido, informando o seu código. O sistema verifica se o código é válido e busca o item no arquivo itens.txt. Se o item for encontrado, o sistema mostra o seu código, o seu cardápio, a sua quantidade e o seu valor total.
  - Exemplo de entrada: 1
  - Exemplo de saída: Código: 1, Cardápio: Coca-Cola, Quantidade: 2, Valor total: 10.00
- **Consultar comanda**: permite ao usuário consultar as informações de uma comanda, informando o seu código. O sistema verifica se o código é válido e busca a comanda no arquivo comandas.txt. Se a comanda for encontrada, o sistema mostra o seu código, o seu cliente, o seu status (aberta ou fechada), o seu valor total e os seus itens de pedido.
  - Exemplo de entrada: 1
  - Exemplo de saída: Código: 1, Cliente: João, Status: aberta, Valor total: 10.00, Itens de pedido: [Coca-Cola, 2, 10.00]
- **Alterar cliente**: permite ao usuário alterar as informações de um cliente, informando o seu código e os novos dados. O sistema verifica se o código é válido e busca o cliente no arquivo clientes.txt. Se o cliente for encontrado, o sistema atualiza o seu nome, o seu CPF e o seu telefone, e salva as alterações no arquivo.
  - Exemplo de entrada: 1, Maria, 98765432100, (85) 88888-8888
  - Exemplo de saída: Cliente alterado com sucesso.
- **Alterar cardápio**: permite ao usuário alterar as informações de um cardápio, informando o seu código e os novos dados. O sistema verifica se o código é válido e busca o cardápio no arquivo cardapios.txt. Se o cardápio for encontrado, o sistema atualiza o seu tipo, o seu nome, o seu preço e a sua quantidade em estoque, e salva as alterações no arquivo.
  - Exemplo de entrada: 1, prato, X-Burger, 15.00, 50
  - Exemplo de saída: Cardápio alterado com sucesso.
- **Alterar item de pedido**: permite ao usuário alterar as informações de um item de pedido, informando o seu código e os novos dados. O sistema verifica se o código é válido e busca o item no arquivo itens.txt. Se o item for encontrado, o sistema atualiza o seu cardápio, a sua quantidade e o seu valor total, e salva as alter
