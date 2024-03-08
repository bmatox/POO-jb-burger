# JB Burger

## Sobre o projeto

Este é o projeto final da disciplina de Programação Orientada a Objetos em Java do curso de Ciência da Computação da UNIFOR. O tema escolhido foi o sistema de gerenciamento de uma hamburgueria, chamada JB Burger. O objetivo do projeto é demonstrar o uso de conceitos e técnicas de POO em Java, como classes, interfaces, herança, polimorfismo, arquivos, composição, agregação, encapsulamento e tratamento de exceções.

O sistema permite cadastrar e consultar clientes, cardápios, pratos, bebidas e comandas. O sistema também permite gerar relatórios de vendas e estoque, além de salvar e recuperar os dados em arquivos de texto.

## Como executar

Para executar o projeto, você precisa ter instalado o software Eclipse e o JDK (Java Development Kit) na sua máquina. Você também precisa baixar ou clonar o repositório do projeto no seu GitHub. Siga os passos abaixo:

- Abra o Eclipse e selecione a opção File > Import.
- Na janela que se abre, escolha a opção Projects from Git e clique em Next.
- Na próxima janela, escolha a opção Clone URI e clique em Next.
- Na janela seguinte, cole o link do seu repositório do GitHub no campo URI e preencha os campos de autenticação, se necessário. Clique em Next.
- Na próxima janela, selecione a branch main e clique em Next.
- Na janela seguinte, escolha o diretório onde deseja salvar o projeto localmente e clique em Next.
- Na última janela, escolha a opção Import as general project e clique em Finish.
- Após importar o projeto, clique com o botão direito sobre ele na aba Project Explorer e selecione a opção Configure > Convert to Maven Project.
- Aguarde o Eclipse baixar as dependências do projeto e atualizar o índice do Maven.
- Para executar o projeto, clique com o botão direito sobre ele na aba Project Explorer e selecione a opção Run As > Java Application.
- Na janela que se abre, escolha a classe Principal e clique em OK.
- O sistema será executado no console do Eclipse e você poderá interagir com ele através de um menu de opções.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

- Cadastrar e consultar clientes: o sistema permite inserir e buscar os dados dos clientes, como nome, telefone e endereço. Os clientes são armazenados em um ArrayList e em um arquivo de texto chamado clientes.txt.
- Cadastrar e consultar cardápios: o sistema permite inserir e buscar os dados dos cardápios, como nome, descrição e preço. Os cardápios são divididos em duas subclasses: Prato e Bebida, que herdam da classe abstrata Cardapio. Os cardápios são armazenados em um ArrayList e em um arquivo de texto chamado cardapios.txt.
- Cadastrar e consultar comandas: o sistema permite inserir e buscar os dados das comandas, que são as ordens de serviço dos clientes. As comandas implementam a interface Comanda, que define os métodos para calcular o valor total, o troco e a forma de pagamento. As comandas são compostas por itens de pedido, que são objetos da classe ItemPedido, que possui os atributos quantidade e cardapio. As comandas são armazenadas em um ArrayList e em um arquivo de texto chamado comandas.txt.
- Gerar relatórios: o sistema permite gerar relatórios de vendas e estoque, mostrando as informações sobre as comandas, os cardápios e os clientes. Os relatórios são exibidos no console e também salvos em arquivos de texto chamados relatorioVendas.txt e relatorioEstoque.txt.

## Requisitos atendidos

O projeto atende aos seguintes requisitos do processo seletivo da Google:

| Requisito | Referência no código-fonte |
| --------- | -------------------------- |
| No mínimo 8 classes (incluindo abstratas e principal) | As classes são: Principal, Cardapio, Bebida, Cliente, Comanda, ItemPedido, Prato e Restaurante. |
| No mínimo duas interfaces | A interface Comanda é implementada pelas classes Prato e Bebida. A interface Serializable é implementada pelas classes Cliente, Cardapio, ItemPedido e Restaurante. |
| Utilização de herança | A classe Cardapio é abstrata e é herdada pelas classes Prato e Bebida. |
| Utilização de polimorfismo | O método toString() é sobrescrito nas classes Cliente, Cardapio, Prato, Bebida, ItemPedido e Restaurante. O método calcularValorTotal() é polimórfico na interface Comanda e nas classes Prato e Bebida. |
| Utilização de Arquivos para entrada e saída de dados | O sistema utiliza as classes BufferedReader, BufferedWriter, FileReader e FileWriter para ler e escrever dados em arquivos de texto. |
| Utilização de composição e agregação | O sistema utiliza composição na classe Comanda, que possui um atributo do tipo Cliente e um ArrayList de ItemPedido. O sistema utiliza agregação na classe Restaurante, que possui um ArrayList de Comanda. |
| Utilização de encapsulamento | O sistema utiliza os modificadores de acesso private, public e protected para controlar o acesso aos atributos e métodos das classes. O sistema também utiliza métodos getters e setters para acessar e modificar os atributos das classes. |
| Tratamento de Exceptions | O sistema utiliza as classes Exception, IOException, NumberFormatException e InputMismatchException para tratar possíveis erros de entrada e saída de dados, conversão de tipos e entrada inválida do usuário. |
| Uso de ArrayList | O sistema utiliza a classe ArrayList para armazenar os objetos das classes Cliente, Cardapio, Comanda e ItemPedido. |
