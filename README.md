# JB Burger

## Sobre o Projeto

Este projeto compõe a atividade final da disciplina de Programação Orientada a Objetos em Java do curso de Ciência da Computação da UNIFOR. O sistema de gerenciamento interno da hamburgueria JB Burger foi desenvolvido para aplicar conceitos de POO, como classes, interfaces, herança, encapsulamento e tratamento de exceções.

O sistema gerencia operações diárias de uma hamburgueria, permitindo o cadastro de clientes, mesas, pedidos e itens do cardápio, além de imprimir comandas e gerenciar o fechamento de pedidos.

## Como Executar

Siga os passos abaixo para executar o projeto:

- Clone o repositório do projeto usando `git clone https://github.com/bmatox/poo-jb-burger-java.git`.
- Abra o Eclipse e importe o projeto como um projeto Java existente.
- Execute a classe `Principal.java` para iniciar o sistema.
- Interaja com o sistema através do console seguindo as instruções exibidas.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Cadastro de Clientes**: Inserção e busca de clientes pelo nome.
- **Gestão de Mesas**: Adição de mesas e alteração de seu estado (disponível/ocupada).
- **Pedidos**: Criação de pedidos e associação a mesas, adição e remoção de itens do pedido.
- **Comandas**: Impressão de comandas em arquivo de texto.
- **Cardápio**: Cadastro de pratos e bebidas com detalhes como preço e ingredientes.
- **Fechamento de Pedidos**: Encerramento de pedidos e liberação das mesas associadas.
- **Remoção de Mesas Disponíveis**: Limpeza do registro de mesas disponíveis ao final do expediente.

## Requisitos Atendidos

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

## Contribuições

Contribuições são bem-vindas. Para contribuir:

- Faça um fork do projeto.
- Crie uma branch para sua feature (`git checkout -b feature/novaFeature`).
- Faça commit das suas alterações (`git commit -am 'Adicionando novaFeature'`).
- Faça push para a branch (`git push origin feature/novaFeature`).
- Abra um Pull Request.


